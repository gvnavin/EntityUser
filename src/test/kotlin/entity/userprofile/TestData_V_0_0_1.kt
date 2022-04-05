package entity.userprofile

import entity.common.*

object TestData_V_0_0_1 {

    const val userProfileInput = """{ 
        "${EntityKeys.TYPE}" : "${EntityTypes.USER}",
        "${EntityKeys.VERSION}" : "0.0.1",
        "${EntityKeys.ENTITY}": {
            "${AbstractBaseEntityImpl.HUMAN_FRIENDLY_NAME}": { 
                "${HumanFriendlyNameImpl.FORMAT}": "${HumanReadableNamesFormats.PLAIN_TEXT}",
                "${HumanFriendlyNameImpl.TEXT}": "Test User" 
            },
            "${AbstractBaseEntityImpl.MACHINE_FRIENDLY_NAME}": "testUser001",
            "${AbstractBaseEntityImpl.ID}": "shortCompanyName.1.user.5ccff4b4-3330-4f7d-a814-3d383640b58f",
            "profile" : "test profile",
            "location" : "test location",
            "qualification" : "test qualification"
         }
    }"""

    val userProfileOutput = object: UserProfile {

        override fun getProfile(): String {
            return "test profile"
        }

        override fun getLocation(): String {
            return "test location"
        }

        override fun getQualification(): String {
            return "test qualification"
        }

        override fun getHumanFriendlyName(): HumanFriendlyName {
            return object: HumanFriendlyName {
                override fun getText(): String {
                    return "Test User"
                }

                override fun getFormat(): String {
                    return HumanReadableNamesFormats.PLAIN_TEXT
                }
            }
        }

        override fun getMachineFriendlyName(): String {
            return "testUser001"
        }

        override fun getId(): String {
            return "shortCompanyName.1.user.5ccff4b4-3330-4f7d-a814-3d383640b58f"
        }
    }
}