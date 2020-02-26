package Log4j;

import static org.junit.Assert.*;

import org.junit.Test;

public class GetPlanFactoryTest {

	@Test
	public void testCost1() {
		Generatecost standardCost= new Generatecost();
		assertEquals(6000.0,standardCost.Cost("standard", 5),0);
	}
	@Test
	public void testCost2() {
		Generatecost aboveStandardCost= new Generatecost();
		assertEquals(9000.0,aboveStandardCost.Cost("Abovestandard", 6),0);
	}
	@Test
	public void testCost3() {
		Generatecost highStandardCost= new Generatecost();
		assertEquals(12600.0,highStandardCost.Cost("Highstandard", 7),0);
	}
	@Test
	public void testCost4() {
		Generatecost highStandardFullAutomaticCost= new Generatecost();
		assertEquals(20000.0,highStandardFullAutomaticCost.Cost("HighstandardFullautomatic", 8),0);
	}
	@Test
	public void testCost5() {	
		Calculate empty=GetPlanFactory.getPlan("");
		assertNull(empty);
	}
}
