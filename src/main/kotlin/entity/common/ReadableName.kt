package entity.common

/**
 * 1. readableName - used in UI, it can be simple text, html text and rtf
 * 2. machineName - to be used in url
 * 3. id - used for db - partition keys, index keys and used for fetching.
 * The pattern used in the id is explained below,
 *      1. "shortCompanyName" - shortname of interview desk
 *      2. "1" - version of the id format
 *      3. "user" - type and used to namespace the ids to avoid conflict with the ids from other entities
 *      4. "identifier" -  can be guid or some random id or machine name as well if we can guarantee uniqueness
 *
 */

interface ReadableName {
    fun getName(): String
    fun getType(): String
}