package customer.health_tracker_service.rest;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/UtilityService")
public class Utility {

    @GetMapping(path = "/test")
    public String testing(){
        return "finally working with local authorization!!";
    }

    

    
}
