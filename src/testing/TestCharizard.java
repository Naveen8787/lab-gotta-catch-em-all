package testing;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import model.Charizard;



public class TestCharizard {
//	@Test
	public void testCharacteristicsMethod() {
	Charizard p = new Charizard("AAA",4, null, null, null, null);
	String temp = "Charizard is fit and strong and has the ability to soar up to ridiculous heights. With a single breath of fire, it can burn down forests and melt gigantic glaciers.";
	assertEquals(temp,p.getCharacteristics());		
		try {
			Charizard p1 = new Charizard(null,0, null, null, null, null);
			temp = null;
		p1.getCharacteristics();
}
	catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testTypeMethod() {
		Charizard p = new Charizard("AAA",4, null, null, null, null);
		String temp = "FIRE";
		assertEquals(temp,p.getType());		
		try {
			Charizard p1 = new Charizard(null,0, null, null, null, null);
			temp = null;
			p1.getType();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
//	@Test
	public void testEvolutionMethod() {
		Charizard p = new Charizard("AAA",4, null, null, null, null);
		String temp = "CHARMELEON";
		assertEquals(temp,p.getEvolution());		
	try {
			Charizard p1 = new Charizard(null,0, null, null, null, null);
			temp = null;
			p1.getEvolution();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testBaseExpMethod() {
		Charizard p = new Charizard("AAA",4, null, null, null, null);
		String temp = "240";
		assertEquals(temp,p.getBaseExp());		
		try {
		Charizard p1 = new Charizard(null,0, null, null, null, null);
			temp = null;
			p1.getBaseExp();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}