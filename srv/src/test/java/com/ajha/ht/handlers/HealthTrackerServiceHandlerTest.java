package com.ajha.ht.handlers;

import static org.junit.Assert.assertEquals;

import java.util.stream.Stream;

import org.junit.Before;
import org.junit.Test;

import cds.gen.healthtrackerservice.Symptoms;


public class HealthTrackerServiceHandlerTest {
    
    private HealthTrackerServiceHandler handler = new HealthTrackerServiceHandler();
    private Symptoms symptoms = Symptoms.create();

    @Before
	public void prepareSymptom() {
		symptoms.setName("Fever");
	}

    @Test
	public void testRecovered() {
		symptoms.setStat("Recovered");
		handler.recoveredFrom(Stream.of(symptoms));;
		assertEquals("Recovered from Fever", symptoms.getName());
	}
}
