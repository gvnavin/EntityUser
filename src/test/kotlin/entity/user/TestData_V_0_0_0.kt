package entity.user

import entity.common.*

object TestData_V_0_0_0 {
    const val userInput = """{ 
        "${EntityKeys.TYPE}" : "${EntityTypes.USER}",
        "${EntityKeys.VERSION}" : "0.0.0",
        "${EntityKeys.ENTITY}": {
            "${AbstractBaseEntityImpl.HUMAN_FRIENDLY_NAME}": { 
                "${HumanFriendlyNameImpl.FORMAT}": "${HumanReadableNamesFormats.PLAIN_TEXT}",
                "${HumanFriendlyNameImpl.TEXT}": "Test User" 
            },
            "${AbstractBaseEntityImpl.MACHINE_FRIENDLY_NAME}": "testUser001",
            "${AbstractBaseEntityImpl.ID}": "shortCompanyName.1.user.5ccff4b4-3330-4f7d-a814-3d383640b58f",
            "profile" : "test profile"
         }
    }"""

    val userOutput = object: User {

        override fun getProfile(): String {
            return "test profile"
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