package jlin2.Group_17.localtesting

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun Test1()
    {
        val email = "123@abc.com"
        val output : Boolean = EmailValidator.isValidEmail(email)
        assertEquals("When Email is Valid", true, output)
    }
}