package suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class siuteconfig {
    @BeforeSuite
    public void beforesuite() {
        System.out.println("Before Suit运行啦");
    }

    @AfterSuite
    public void aftersuite() {
        System.out.println("After Suite运行啦");
    }
    @BeforeTest
    public void beforeTest() {
        System.out.println("Before Test");
    }
    @AfterTest
    public void afterTest() {
        System.out.println("After Test");
    }
}
