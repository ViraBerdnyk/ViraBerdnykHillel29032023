package tests.wd.actions;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BeforeActions {
    @BeforeSuite
    public void beforeSuite() {
        System.out.println("====Before Suite ====");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("====Before Test ====");
    }
}
