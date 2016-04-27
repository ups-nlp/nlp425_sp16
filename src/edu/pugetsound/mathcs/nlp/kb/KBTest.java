package edu.pugetsound.mathcs.nlp.kb;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class KBTest{
	@Test
	public void isThere(){
		KBController kb = new KBController();
		PrologStructure p = new PrologStructure(2);
		p.setName("isA");
		p.addArgument("fluffy", 0);
		p.addArgument("cat",1);
		List<PrologStructure> preds = new ArrayList<PrologStructure>();
		preds.add(p);
		assertTrue(kb.yesNo(preds));
	}

	@Test
	public void notThere(){
		KBController kb = new KBController();
		PrologStructure p = new PrologStructure(2);
		p.setName("isA");
		p.addArgument("spot", 0);
		p.addArgument("cat",1);
		List<PrologStructure> preds = new ArrayList<PrologStructure>();
		preds.add(p);
		assertFalse(kb.yesNo(preds));
	}

	@Test
	public void prologException(){
		KBController kb = new KBController();
		kb.updateEnvironment("faultyProlog.pl");
		PrologStructure p = new PrologStructure(2);
		List<PrologStructure> preds = new ArrayList<PrologStructure>();
		preds.add(p);
		assertTrue(kb.yesNo(preds));
		fail("An exception should have been thrown");
	}

}
