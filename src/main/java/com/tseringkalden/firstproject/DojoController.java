package com.tseringkalden.firstproject;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class DojoController {
	@RequestMapping("dojo")
    public String index(){
      return "The dojo is awesome!";
    }
    
	@RequestMapping("/{track}")
	public String success(@PathVariable("track") String track) {
		if (track.equals("burbank-dojo")) {
			track = "Burbank Dojo is located in Southern California";
		} else if (track.equals("san-jose")) {
			track= "SJ dojo is the headquearters";
			
		}
		return track;
		
	}
    	
   }
	
