import static org.junit.Assert.*;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class OperatorTest {

	Operator obj;
	int a,b;
@Before
	public void setUp() throws Exception {
		
		obj=new Operator();
		a=3;
		b=2;
	}

	@After
	public void tearDown() throws Exception {
		
		obj=null;
		a=0;
		b=0;
	}
@Test
	
	public void testMul() {
		assertEquals(6,obj.mul(a, b));
	}

}
