package entity.user

import entity.common.EntityTypes
import entity.common.ReadableName

object TestData_V_0_1_0 {

    const val userInput = """{ 
        "type" : "${EntityTypes.USER}",
        "version" : "0.0.1",
         "entity": {
            "readableName": { 
                "type": "text",
                "name": "Test User" 
            },
            "machineName": "testUser001",
            "id": "shortCompanyName.1.user.5ccff4b4-3330-4f7d-a814-3d383640b58f",
            "profile" : "test profile"
            "location" : "test location"
         }
    }"""

    val userOutput = object: User {

        override fun getProfile(): String {
            return "test profile"
        }

        override fun getLocation(): String {
            return "test location"
        }

        override fun getReadableName(): ReadableName {
            return object: ReadableName {
                override fun getName(): String {
                    return "Test User"
                }

                override fun getType(): String {
                    return "text"
                }
            }
        }

        override fun getMachineName(): String {
            return "testUser001"
        }

        override fun getId(): String {
            return "shortCompanyName.1.user.5ccff4b4-3330-4f7d-a814-3d383640b58f"
        }
    }
}