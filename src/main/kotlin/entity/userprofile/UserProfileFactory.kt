package entity.userprofile

import com.beust.klaxon.JsonObject
import com.beust.klaxon.Parser
import entity.common.EntityKeys
import entity.common.EntityTypes
import entity.userprofile.v0_0_0.User_Profile_V_0_0_0
import entity.userprofile.v0_0_1.User_Profile_V_0_0_1
import entity.userprofile.v0_1_0.User_Profile_V_0_1_0

object UserProfileFactory {

    fun get(jsonString: String): UserProfile {
        val parser = Parser.default( )
        val json = parser.parse(jsonString.byteInputStream()) as JsonObject

        val type = json.string(EntityKeys.TYPE)!!
        if (type != EntityTypes.USER) {
            throw RuntimeException("unexpected type, UserFactory only supports ${EntityTypes.USER}")
        }

        val version = json.string(EntityKeys.VERSION)!!
        val entity = json.obj(EntityKeys.ENTITY)!!

        return when (version) {
            "0.0.0" -> User_Profile_V_0_0_0(entity)
            "0.0.1" -> User_Profile_V_0_0_1(entity)
            "0.1.0" -> User_Profile_V_0_1_0(entity)
            else -> {
                throw RuntimeException("invalid entity version")
            }
        }
    }

}