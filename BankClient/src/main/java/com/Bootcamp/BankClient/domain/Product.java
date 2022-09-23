package com.Bootcamp.BankClient.domain;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "Product")
public class Product {
    
    private String codeProduct;

    private String type;

    private String description;
    
    private String availableBalance;
    
    private String Balance;
    
    private String account;

    private int  state;

}
