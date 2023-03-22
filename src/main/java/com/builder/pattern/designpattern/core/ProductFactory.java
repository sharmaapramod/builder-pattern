package com.builder.pattern.designpattern.core;

public class ProductFactory {
    private Product product;
     public Product factory(String productName){

         if(productName.equalsIgnoreCase("TV")) {
             product = new Product.ProductBuilder(35000.0, productName).build();
         }
         if(productName.equalsIgnoreCase("MOBILE")) {
             product = new Product.ProductBuilder(24000.0, productName).build();
         }
         if(productName.equalsIgnoreCase("LAPTOP")) {
             product = new Product.ProductBuilder(95000.0, productName).build();
         }
         return product;
     }
}
