package entity.userprofile

import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class UserProfileFactoryTest {

    @Test
    internal fun testGet_V_0_0_0() {
        val user = UserProfileFactory.get(TestData_V_0_0_0.userProfileInput)

        print(TestData_V_0_0_0.userProfileInput)

        assertUtil(TestData_V_0_0_0.userProfileOutput, user)
        assertThrows(RuntimeException::class.java) { user.getLocation() }
        assertThrows(RuntimeException::class.java) { user.getQualification() }

    }

    private fun assertUtil(expectedUserProfile: UserProfile, actualUserProfile: UserProfile) {
        assertEquals(expectedUserProfile.getId(), actualUserProfile.getId())
        assertEquals(expectedUserProfile.getMachineFriendlyName(), actualUserProfile.getMachineFriendlyName())

        assertEquals(expectedUserProfile.getHumanFriendlyName().getText(), actualUserProfile.getHumanFriendlyName().getText())
        assertEquals(expectedUserProfile.getHumanFriendlyName().getFormat(), actualUserProfile.getHumanFriendlyName().getFormat())

        assertEquals(expectedUserProfile.getProfile(), actualUserProfile.getProfile())
    }

    @Test
    internal fun testGet_V_0_0_1() {
        val user = UserProfileFactory.get(TestData_V_0_0_1.userProfileInput)

        assertUtil(TestData_V_0_0_1.userProfileOutput, user)

        assertEquals(user.getLocation(), TestData_V_0_0_1.userProfileOutput.getLocation())
        assertEquals(user.getQualification(), TestData_V_0_0_1.userProfileOutput.getQualification())
    }

    @Test
    internal fun testGet_V_0_1_0() {
        val user = UserProfileFactory.get(TestData_V_0_1_0.userProfileInput)

        assertUtil(TestData_V_0_1_0.userProfileOutput, user)
        assertEquals(user.getLocation(), TestData_V_0_1_0.userProfileOutput.getLocation())
        assertThrows(RuntimeException::class.java) { user.getQualification() }
    }
}