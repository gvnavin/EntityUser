package entity.common

import com.beust.klaxon.JsonObject

internal class HumanFriendlyNameImpl(private val entity: JsonObject): HumanFriendlyName {

    companion object {
        const val TEXT = "text"
        const val FORMAT = "format"
    }

    override fun getText(): String {
        return entity.string(TEXT)!!
    }

    override fun getFormat(): String {
        return entity.string(FORMAT)!!
    }

}