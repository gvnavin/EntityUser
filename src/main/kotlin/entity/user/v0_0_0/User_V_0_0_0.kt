package entity.user.v0_0_0

import com.beust.klaxon.JsonObject
import entity.common.AbstractBaseEntityImpl
import entity.user.User

internal open class User_V_0_0_0(private val entity: JsonObject) : AbstractBaseEntityImpl(entity), User {
    override fun getProfile(): String {
        return entity.string("profile")!!
    }
}