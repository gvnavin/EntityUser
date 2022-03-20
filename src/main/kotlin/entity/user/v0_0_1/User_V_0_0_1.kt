package entity.user.v0_0_1

import com.beust.klaxon.JsonObject
import entity.common.AbstractBaseEntityImpl
import entity.user.User
import entity.user.v0_0_0.User_V_0_0_0

internal open class User_V_0_0_1(private val entity: JsonObject) : User_V_0_0_0(entity) {
    override fun getLocation(): String {
        return entity.string("location")!!
    }

    override fun getQualification(): String {
        return entity.string("qualification")!!
    }
}