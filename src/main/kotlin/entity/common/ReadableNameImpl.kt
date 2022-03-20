package entity.common

import com.beust.klaxon.JsonObject

class ReadableNameImpl(private val entity: JsonObject): ReadableName {

    override fun getName(): String {
        return entity.string("name")!!
    }

    override fun getType(): String {
        return entity.string("type")!!
    }

}