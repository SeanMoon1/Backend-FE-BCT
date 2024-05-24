package com.example.demo.services;

public class Products {
    public Products() {
    }

    public Products(String productName, String productSize, String productQuantity) {
        this.productName = productName;
        this.productSize = productSize;
        this.productQuantity = productQuantity;
    }

    private String productName ;
    private String productSize;
    private String productQuantity;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(String productQuantity) {
        this.productQuantity = productQuantity;
    }

    public String getProductSize() {
        return productSize;
    }

    public void setProductSize(String productSize) {
        this.productSize = productSize;
    }
}
