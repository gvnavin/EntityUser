package entity.userprofile.v0_1_0

import com.beust.klaxon.JsonObject
import entity.userprofile.v0_0_1.User_Profile_V_0_0_1

internal class User_Profile_V_0_1_0(private val entity: JsonObject) : User_Profile_V_0_0_1(entity) {
    override fun getQualification(): String = throw RuntimeException("Not available in the current version of the entity")
}