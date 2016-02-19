package demo.java.collection;

import static org.junit.Assert.*;

import java.util.ConcurrentModificationException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import demo.java.v1c13collection.IteratorDemo;

public class IteratorDemoTest {

	private static final Logger logger = LogManager.getLogger(IteratorDemoTest.class);
	IteratorDemo id;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		logger.entry();
		
		logger.exit();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		logger.entry();
		
		logger.exit();		
	}

	@Before
	public void setUp() throws Exception {
		logger.entry();
		id = new IteratorDemo();
		logger.exit();		
	}

	@After
	public void tearDown() throws Exception {
		logger.entry();
		
		logger.exit();		
	}

	@Test(expected = ConcurrentModificationException.class)
	public void ConcurrentModifyTest() {
		logger.entry();
		id.ConcurrentModify();
		logger.exit();		
	}
	

}
