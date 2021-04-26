package com.psiber.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.psiber.test.model.TaxCalculator;

@RestController
@RequestMapping("/TaxCalculator")
public class Controller {

	@Autowired
	TaxCalculator taxCalculator;
	
	@PostMapping(path = "/Add Customer" )
    public String addCustomer(@RequestBody TaxCalculator inputOftaxCalculator , @RequestParam()){
        try {
        	 
        	   

        } catch (Exception e){
            return new ResponseEntity(e.getLocalizedMessage(), HttpStatus.BAD_REQUEST);
        }
    }
}
