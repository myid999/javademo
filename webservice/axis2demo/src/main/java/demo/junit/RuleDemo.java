package demo.junit;

import static org.junit.Assert.*;

import java.util.ConcurrentModificationException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class RuleDemo{

	private static final Logger logger = LogManager.getLogger(RuleDemo.class);
	
	@Rule
    public final ExpectedException expectedException = ExpectedException.none();
    
    @Test
    public void testThrowExceptionWithRule() {
    	logger.entry();
        expectedException.expect(IllegalStateException.class);
        
        throw new IllegalStateException("test");
    }
    
    @Test
    public void testThrowExceptionAndMessageWithRule() {
    	logger.entry();
        expectedException.expect(IllegalStateException.class);
        expectedException.expectMessage("fail");
        
        throw new IllegalStateException("expect fail");		
    }


	

}
