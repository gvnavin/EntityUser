package entity.common

/**
 * 1. readableName - used in UI, it can be simple text, html text and rtf
 * 2. machineName - to be used in urls
 * 3. id - used for db - partition keys, index keys and used for fetching.
 * pattern that we follow in the id is
 *      1. "intdsk" - shortname of interview desk
 *      2. "1" - version of the id format
 *      3. "user" - type and used to namespace the ids to avoid conflict with the ids from other entities
 *      4. "identifier" -  can be guid or some random id or machine name as well if we can guarantee uniqueness
 *
 */

interface BaseEntity {

    fun getHumanFriendlyName(): HumanFriendlyName
    fun getMachineFriendlyName(): String
    fun getId(): String
}