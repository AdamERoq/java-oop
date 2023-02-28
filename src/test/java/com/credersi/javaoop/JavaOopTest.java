package com.credersi.javaoop;

import static org.junit.Assert.*;

import org.junit.Test;

public class JavaOopTest {
	@Test
    public void testRacing() {
    	McGredez mcGredez = new McGredez();
    	assertTrue(mcGredez.isRacing());
    	
    }
    
    @Test
    public void testtyrewear() {
    	McGredez mcGredez = new McGredez();
    	mcGredez.wear();
    	assertTrue(mcGredez.isRacing());
    	
    }
    
    @Test
    public void testtyrewearfail() {
    	McGredez mcGredez = new McGredez();
    	mcGredez.wear();
    	mcGredez.wear();
    	assertFalse(mcGredez.isRacing());
    	
    }
    
    @Test
    public void testRefuel() {
    	McGredez mcGredez = new McGredez();
    	mcGredez.refuel();
    	assertTrue(mcGredez.isRacing());
    	
    }
    
    @Test
    public void testRefuelReset() {
    	McGredez mcGredez = new McGredez();
    	mcGredez.reset();
    	mcGredez.refuel();
    	assertTrue(mcGredez.isRacing());	
    }
    
    @Test
    public void testRefuelResetToBreakdown() {
    	McGredez mcGredez = new McGredez();
    	mcGredez.reset();
    	mcGredez.refuel();
    	mcGredez.refuel();
    	mcGredez.refuel();
    	assertFalse(mcGredez.isRacing());	
    }
    
    @Test
    public void testReset() {
    	McGredez mcGredez = new McGredez();
    	mcGredez.reset();
    	assertTrue(mcGredez.isRacing());	
    }
    
    @Test
    public void testBreakdown() {
    	McGredez mcGredez = new McGredez();
    	mcGredez.breakdown();
    	assertFalse(mcGredez.isRacing());	
    }
    
    @Test
    public void testRaces() {
    	McGredez mcGredez = new McGredez();
    	mcGredez.races();
    	assertTrue(mcGredez.isRacing());	
    }
    
    @Test
    public void testRacesReset() {
    	McGredez mcGredez = new McGredez();
    	mcGredez.reset();
    	mcGredez.races();
    	assertTrue(mcGredez.isRacing());	
    }
    
}