package com.bridgelabz;
import org.junit.Assert;
import org.junit.Test;
public class UserRegistrationTest {
    /**
     * Test for The First_Name passed by( 1 given True & 2 for false)
     */
    @Test
    public void givenValid_FirstName_ShouldReturn_True(){
        UserRegistrationRegExTest userRegistration = new UserRegistrationRegExTest();
        boolean result = userRegistration.firstNameValidate("Rushikesh");
        Assert.assertEquals(true, result);
    }
    @Test
    public void givenInValid_FirstName_ShouldReturn_False(){
        UserRegistrationRegExTest userRegistration = new UserRegistrationRegExTest();
        boolean result = userRegistration.firstNameValidate("Rushikesh");
        Assert.assertFalse( result);
    }
    @Test
    public void givenInValid_FirstName_ShouldReturn_False_Numeric_number(){
        UserRegistrationRegExTest userRegistration = new UserRegistrationRegExTest();
        boolean result = userRegistration.firstNameValidate("Rushikesh123");
        Assert.assertFalse( result);
    }
    /**
     *     Test for The Last_Name passed by( 1 given True & 2 for false)
     */
    @Test
    public void givenValid_LastName_ShouldReturn_True(){
        UserRegistrationRegExTest userRegistration = new UserRegistrationRegExTest();
        boolean result = userRegistration.lastNameValidate("Bhandare");
        Assert.assertTrue(result);
    }
    @Test
    public void givenValid_LastName_ShouldReturn_False(){
        UserRegistrationRegExTest userRegistration = new UserRegistrationRegExTest();
        boolean result = userRegistration.lastNameValidate("Bhandare");
        Assert.assertFalse(result);
    }
    @Test
    public void givenValid_LastName_ShouldReturn_False_Numeric_number(){
        UserRegistrationRegExTest userRegistration = new UserRegistrationRegExTest();
        boolean result = userRegistration.lastNameValidate("Bhandare12");
        Assert.assertFalse(result);
    }

    /**
     *     Test for The Email passed by( 1 given True & 2 for false)
     */
    @Test
    public void givenValid_Email_ShouldReturn_True(){
        UserRegistrationRegExTest userRegistration = new UserRegistrationRegExTest();
        boolean result = userRegistration.emailValidate("rushikeshbhandare123@gmail.com.in");
        Assert.assertTrue(result);
    }
    @Test
    public void givenValid_Email_ShouldReturn_False(){
        UserRegistrationRegExTest userRegistration = new UserRegistrationRegExTest();
        boolean result = userRegistration.emailValidate("abc@.com.my");
        Assert.assertFalse(result);
    }
    @Test
    public void givenValid_Email_ShouldReturn_False_Special_Character(){
        UserRegistrationRegExTest userRegistration = new UserRegistrationRegExTest();
        boolean result = userRegistration.emailValidate("abc@abc@gmail.com");
        Assert.assertFalse(result);
    }

    /**
     *     Test for The Phone_Number passed by( 1 given True & 2 for false)
     */
    @Test
    public void givenValid_Phone_Number_ShouldReturn_True(){
        UserRegistrationRegExTest userRegistration = new UserRegistrationRegExTest();
        boolean result = userRegistration.phoneNumberValidate("91 7743928819");
        Assert.assertTrue(result);
    }
    @Test
    public void givenValid_Phone_Number_ShouldReturn_False(){
        UserRegistrationRegExTest userRegistration = new UserRegistrationRegExTest();
        boolean result = userRegistration.phoneNumberValidate("91 12345678910");
        Assert.assertFalse(result);
    }
    @Test
    public void givenValid_Phone_Number_ShouldReturn_False_Number_Should_10(){
        UserRegistrationRegExTest userRegistration = new UserRegistrationRegExTest();
        boolean result = userRegistration.phoneNumberValidate("91  12345678");
        Assert.assertFalse(result);
    }

    /**
     *     Test for The Password passed by( 1 given True & 2 for false)
     */
    @Test
    public void givenValid_Password_ShouldReturn_True(){
        UserRegistrationRegExTest userRegistration = new UserRegistrationRegExTest();
        boolean result = userRegistration.passwordValidate("Rushikesh@1234");
        Assert.assertTrue(result);
    }
    @Test
    public void givenValid_Password_ShouldReturn_False(){
        UserRegistrationRegExTest userRegistration = new UserRegistrationRegExTest();
        boolean result = userRegistration.passwordValidate("Ravi.123");
        Assert.assertFalse(result);
    }
    @Test
    public void givenValid_Password_ShouldReturn_False_Should_8_Character(){
        UserRegistrationRegExTest userRegistration = new UserRegistrationRegExTest();
        boolean result = userRegistration.passwordValidate("pass@1");
        Assert.assertFalse(result);
    }

}
