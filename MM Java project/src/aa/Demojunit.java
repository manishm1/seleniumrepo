
package aa;

//import static org.junit.Assert.assertEquals;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
//import aa.Demojunit;

	public class Demojunit {
		
//		System.out.println("Enter a no. ");
		
		

	@BeforeClass
	public static void beforeClass() {
		System.out.println("insode before class method.");
	}
	@Before
	public void before() {
		System.out.println("insode before method.");
	}
	@Test
	public void test() {
		System.out.println("insode test method.");
	}
	@After
	public void after() {
		System.out.println("insode after method.");
	}
	@AfterClass
	public static void afterClass() {
		System.out.println("insode after class method.");
	}
}