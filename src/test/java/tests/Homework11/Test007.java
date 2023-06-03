package tests.Homework11;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test007 {
    @Test(dataProvider = "dataProviderMethod", groups = "login")
    public void loginTest(String username, String password, String role) {

        System.out.println("Test1 - Login Test: " + username + ", " + password + ", " + role);
    }


    @DataProvider
    public Object[][] dataProviderMethod() {

        return new Object[][]{{"user1", "password1", "role1"}, {"user2", "password2", "role2"}, {"user3", "password3", "role3"}};
    }

    @Test(dependsOnGroups = "login")
    public void dependentTest() {

        System.out.println("Test2 - login");
    }


    @Test
    @Parameters("externalParameter")
    public void parameterTest(String externalParameter) {

        System.out.println("Test3 " + externalParameter);
    }
}

