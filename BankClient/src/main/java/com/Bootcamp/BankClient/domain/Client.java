package com.Bootcamp.BankClient.domain;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

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
@Document("client")
public class Client {

	    @Id
	    private String id;

	    @NotNull
	    private int  rolClient;   // 1= person  2= bussiness  3=both

	    @NotNull
	    private String typeDocument;
	    
	    @NotNull
	    @Column(unique=true)
	    private String numberDocument;

	    @NotNull
	    private String fullName;
	    
	    
	    @NotNull
	    private List<Product> listProduct;
	    
	    @NotNull
	    private int state;
	    

	    private  Timestamp userCreate;
	    

	    private  Timestamp userUpdate;
}
