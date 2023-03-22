package com.builder.pattern.designpattern.core;

public class Product {
    private String productName;
    private Double gst;
    private Double amount;

    private Product(ProductBuilder productBuilder) {
        this.productName = productBuilder.productName;
        this.gst = productBuilder.gst;
        this.amount = productBuilder.amount;

    }
    public String getProductName() {
        return productName;
    }

    public Double getGst() {
        return gst;
    }

    public Double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", gst=" + gst +
                ", amount=" + amount +
                '}';
    }

    public static class ProductBuilder {
    private Double amount;
    private Double gst;
    private String productName;

    public ProductBuilder(Double amount, String productName) {
        this.amount = amount;
        this.productName = productName;
        this.gst(amount);
    }


    public ProductBuilder gst(Double amount) {
        Double gst = (amount / 100) * 18;
        this.gst = gst;
        return this;
    }
        public ProductBuilder amount(Double amount) {
            this.amount = amount+this.gst;
            return this;
        }
    public ProductBuilder productName(String productName) {
        this.productName = productName;
        return this;
    }

    public Product build() {
        Product product = new Product(this);

        return product;
    }
}
}
