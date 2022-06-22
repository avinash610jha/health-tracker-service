package com.ajha.ht.handlers;

import java.util.stream.Stream;
import org.springframework.stereotype.Component;
import cds.gen.healthtrackerservice.HealthTrackerService_;
import cds.gen.healthtrackerservice.Symptoms;
import com.sap.cds.services.cds.CdsService;
import com.sap.cds.services.handler.EventHandler;
import com.sap.cds.services.handler.annotations.After;
import com.sap.cds.services.handler.annotations.ServiceName;



@Component
@ServiceName(HealthTrackerService_.CDS_NAME)
public class HealthTrackerServiceHandler implements EventHandler{

    @After(event = CdsService.EVENT_READ)
	public void recoveredFrom(Stream<Symptoms> symptoms) {
		symptoms.filter(b -> b.getName() != null && b.getStat() == "Recovered")
		.forEach(b -> b.setName("Recovered from " + b.getName()));
	}
    
}





