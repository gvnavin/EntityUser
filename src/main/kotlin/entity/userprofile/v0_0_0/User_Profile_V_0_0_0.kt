package entity.userprofile.v0_0_0

import com.beust.klaxon.JsonObject
import entity.common.AbstractBaseEntityImpl
import entity.userprofile.UserProfile

internal open class User_Profile_V_0_0_0(private val entity: JsonObject) : AbstractBaseEntityImpl(entity), UserProfile {
    override fun getProfile(): String {
        return entity.string("profile")!!
    }
}