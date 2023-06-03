package tests.actions;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;

public class AfterActions {
    @AfterSuite
    public void aftrSuite() {
        System.out.println("==== After Suite ====");
    }

    @AfterTest
    public void aftrTest() {
        System.out.println("==== After Test ====");
    }
}
