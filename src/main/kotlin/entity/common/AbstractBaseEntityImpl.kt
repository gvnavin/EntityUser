package entity.common

import com.beust.klaxon.JsonObject

internal abstract class AbstractBaseEntityImpl(private val entity: JsonObject) : BaseEntity {

    companion object {
        const val HUMAN_FRIENDLY_NAME = "humanFriendlyName"
        const val MACHINE_FRIENDLY_NAME = "machineFriendlyName"
        const val ID = "id"
    }

    override fun getHumanFriendlyName(): HumanFriendlyName {
        return HumanFriendlyNameImpl(entity.obj(HUMAN_FRIENDLY_NAME)!!)
    }

    override fun getMachineFriendlyName(): String {
        return entity.string(MACHINE_FRIENDLY_NAME)!!
    }

    override fun getId(): String {
        return entity.string(ID)!!
    }

}
