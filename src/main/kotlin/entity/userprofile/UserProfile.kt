package entity.userprofile

import entity.common.BaseEntity

interface UserProfile: BaseEntity {

    /**
     * from v.0.0.0
     */
    fun getProfile(): String = throw RuntimeException("Not Implemented")

    /**
     * from v.0.0.1
     *
     * - code that uses the v.0.0.0 will not know about the location.
     * - if the code uses getLocation in v.0.0.0, it will get RunTime Exception
     * - we can make the behaviour of the getLocation to return default value
     */
    fun getLocation(): String = throw RuntimeException("Not Implemented")

    fun getQualification(): String = throw RuntimeException("Not Implemented")
}