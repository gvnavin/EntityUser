package entity.user

import com.beust.klaxon.JsonObject
import com.beust.klaxon.Parser
import entity.common.BaseEntity
import entity.common.EntityKeys
import entity.common.EntityTypes
import entity.user.v0_0_0.User_V_0_0_0
import entity.user.v0_0_1.User_V_0_0_1
import entity.user.v0_1_0.User_V_0_1_0

object UserFactory {

    fun get(jsonString: String): User {
        val parser = Parser.default( )
        val json = parser.parse(jsonString.byteInputStream()) as JsonObject

        val type = json.string(EntityKeys.TYPE)!!
        if (type != EntityTypes.USER) {
            throw RuntimeException("unexpected type, UserFactory only supports ${EntityTypes.USER}")
        }

        val version = json.string(EntityKeys.VERSION)!!
        val entity = json.obj(EntityKeys.ENTITY)!!

        return when (version) {
            "0.0.0" -> User_V_0_0_0(entity)
            "0.0.1" -> User_V_0_0_1(entity)
            "0.1.0" -> User_V_0_1_0(entity)
            else -> {
                throw RuntimeException("invalid entity version")
            }
        }
    }

}