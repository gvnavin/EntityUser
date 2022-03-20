package entity.user

import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class UserFactoryTest {

    @Test
    internal fun testGet_V_0_0_0() {
        val user = UserFactory.get(TestData_V_0_0_0.userInput)

        assertUtil(TestData_V_0_0_0.userOutput, user)
        assertThrows(RuntimeException::class.java) { user.getLocation() }
        assertThrows(RuntimeException::class.java) { user.getQualification() }

    }

    private fun assertUtil(expectedUser: User, actualUser: User) {
        assertEquals(expectedUser.getId(), actualUser.getId())
        assertEquals(expectedUser.getMachineName(), actualUser.getMachineName())

        assertEquals(expectedUser.getReadableName().getName(), actualUser.getReadableName().getName())
        assertEquals(expectedUser.getReadableName().getType(), actualUser.getReadableName().getType())

        assertEquals(expectedUser.getProfile(), actualUser.getProfile())
    }

    @Test
    internal fun testGet_V_0_0_1() {
        val user = UserFactory.get(TestData_V_0_0_1.userInput)

        assertUtil(TestData_V_0_0_1.userOutput, user)

        assertEquals(user.getLocation(), TestData_V_0_0_1.userOutput.getLocation())
        assertEquals(user.getQualification(), TestData_V_0_0_1.userOutput.getQualification())
    }

    @Test
    internal fun testGet_V_0_1_0() {
        val user = UserFactory.get(TestData_V_0_1_0.userInput)

        assertUtil(TestData_V_0_1_0.userOutput, user)
        assertEquals(user.getLocation(), TestData_V_0_1_0.userOutput.getLocation())
        assertThrows(RuntimeException::class.java) { user.getQualification() }
    }
}