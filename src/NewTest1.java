import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest1 {
  @Test
  public void f() {
		System.out.println("Hello akashTest");

  }
  @BeforeTest
  public void beforeTest() {
		System.out.println("Hello akash Before Test");

  }

  @AfterTest
  public void afterTest() {
		System.out.println("Hello akash After Test");

  }

}
