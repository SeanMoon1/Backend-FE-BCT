package com.example.demo.services;

public class Shipping {
    private String shippingId;
    private String numberOfContainer;
    private String priceInEuro;
    public Shipping() {
    }

    public Shipping(String shippingId, String numberOfContainer, String priceInEuro) {
        this.shippingId = shippingId;
        this.numberOfContainer = numberOfContainer;
        this.priceInEuro = priceInEuro;
    }



    public String getShippingId() {
        return shippingId;
    }

    public void setShippingId(String shippingId) {
        this.shippingId = shippingId;
    }

    public String getNumberOfContainer() {
        return numberOfContainer;
    }

    public void setNumberOfContainer(String numberOfContainer) {
        this.numberOfContainer = numberOfContainer;
    }

    public String getPriceInEuro() {
        return priceInEuro;
    }

    public void setPriceInEuro(String priceInEuro) {
        this.priceInEuro = priceInEuro;
    }

}
