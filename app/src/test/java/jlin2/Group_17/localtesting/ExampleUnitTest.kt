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
//    Testing correct email address format
    fun Test1()
    {
        val email = "123@abc.com"
        val output : Boolean = EmailValidator.isValidEmail(email)
        assertEquals("When Email is Valid", true, output)
    }

    @Test
//    Testing correct email with subdomain
    fun Test2()
    {
        val email = "123@abc.co.ca"
        val output : Boolean = EmailValidator.isValidEmail(email)
        assertEquals("When Email is Valid", true, output)
    }

    @Test
//    Testing incorrect email address(123@abc)
    fun Test3()
    {
        val email = "123@abc"
        val output : Boolean = EmailValidator.isValidEmail(email)
        assertEquals("When Email is Valid", false, output)
    }

    @Test
//    Testing incorrect email address(123@abc..com)
    fun Test4()
    {
        val email = "123@abc..com"
        val output : Boolean = EmailValidator.isValidEmail(email)
        assertEquals("When Email is Valid", false, output)
    }

    @Test
    // Testing incorrect email address(@abc.com)
    fun Test5()
    {
        val email = "@abc.com"
        val output : Boolean = EmailValidator.isValidEmail(email)
        assertEquals("When Email is Valid", false, output)
    }


}