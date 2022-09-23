package com.Bootcamp.BankClient.web.model;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Column;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.Bootcamp.BankClient.domain.Product;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ClientModel {

	@JsonProperty("id")
	private String id;


	@NotBlank(message="Debe ingresar un tipo de cliente")
	private int  rolClient;   // 1= person  2= bussiness  3=both

	@NotBlank(message="Debe ingresar un tipo de documento")
    private String typeDocument;
    
	@NotBlank(message="Debe ingresar un número de documento")
    private String numberDocument;

	@NotBlank(message="Debe ingresar el nombre completo")
    private String fullName;
    
	@NotBlank(message="Debe ingresar un producto")
    private List<ProductModel> listProduct;
    
	@NotBlank(message="Debe ingresar un estado")
    private int state;
    

    private  Timestamp userCreate;
    

    private  Timestamp userUpdate;

}
