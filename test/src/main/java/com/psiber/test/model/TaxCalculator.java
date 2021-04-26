package com.psiber.test.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TaxCalculator{
	
	private TaxYears taxYear;
	private String userAge;
	private TaxableEarnings earnings;
	private int numberOfMemebers;
	
	

}
