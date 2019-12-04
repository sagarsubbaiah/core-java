import static org.junit.Assert.*;

import org.junit.Test;

public class MainTest {

	@Test
	public void test() {
		//fail("Not yet implemented");
		Main m = new Main();
		
		m.setCostPrice(12);
		m.setSellingPrice(-45);
		
		
		boolean flag = m.getSellingPrice()>0;
		flag = flag && m.getCostPrice()>0 ;
		assertTrue(flag);
		
	}

}
