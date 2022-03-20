package entity.common

import com.beust.klaxon.JsonObject

abstract class AbstractBaseEntityImpl(private val entity: JsonObject) : BaseEntity {

    override fun getReadableName(): ReadableName {
        return ReadableNameImpl(entity.obj("readableName")!!)
    }

    override fun getMachineName(): String {
        return entity.string("machineName")!!
    }

    override fun getId(): String {
        return entity.string("id")!!
    }

}
