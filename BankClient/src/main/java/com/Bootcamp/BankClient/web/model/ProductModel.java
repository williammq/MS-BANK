package com.Bootcamp.BankClient.web.model;

import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductModel {
    
    
   
	 	private String codeProduct;

	    private String type;

	    private String description;
	    
	    private String availableBalance;
	    
	    private String Balance;
	    
	    private String account;

	    private int  state;
}
