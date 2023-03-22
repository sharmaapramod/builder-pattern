package com.builder.pattern.designpattern;

import com.builder.pattern.designpattern.core.Product;
import com.builder.pattern.designpattern.core.ProductFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesignPatternApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesignPatternApplication.class, args);

Double amount = 23000.0;
		String productName = "TV";
		System.out.println("amount :"+amount +" productName :" + productName);
		Product product =  new Product.ProductBuilder(amount,productName).build();
		System.out.println("product Object created using builder design pattern : "+ product);

		ProductFactory factory = new ProductFactory();
		Product productTVUsingFactory =factory.factory("TV");
		System.out.println("product productTVUsingFactory using UsingFactory : "+productTVUsingFactory.getProductName());

		Product productMOBILEUsingFactory =factory.factory("MOBILE");
		System.out.println("productMOBILEUsingFactory created using UsingFactory : "+productMOBILEUsingFactory.getProductName());

		Product productLAPTOPUsingFactory =factory.factory("LAPTOP");
		System.out.println("productLAPTOPUsingFactory created using UsingFactory : "+productLAPTOPUsingFactory.getProductName());
	}

}
