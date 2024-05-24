package com.example.demo.services;

import org.springframework.stereotype.Service;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductsService {

    public  static  List<Shipping> shipping = new ArrayList<>(Arrays.asList(
            new Shipping("1","20","2500")
    ));
    public static List<Products> products =  new ArrayList<>(Arrays.asList(
            new Products("Laptops","0.6*0.5*0.5","20"),
            new Products("Laptops","0.6*0.5*0.5","21"),
            new Products("Laptops","0.6*0.5*0.5","22"),
            new Products("Laptops","0.6*0.5*0.5","23"),
            new Products("Mouse","0.6*0.5*0.5","20"),
                new Products("LCD","0.6*0.5*0.5","20")
        ));

    public static void addProduct(Products product) {
         products.add(product);
    }

    public static void updateProduct(Products data, String productName) {
        for (int i = 0; i < products.size(); i++) {
            Products t = products.get(i);
            if (t.getProductName().equals(productName)){
                products.set(i, data);
                return;
            }
        }
    }

    public static void deleteProduct(String productName) {
        products.removeIf(t -> t.getProductName().equals(productName));
    }

    public List<Products> getProducts() {
        return products;
    }

    public List<Products> getProductName(String productName){
       return products.stream().filter(t -> t.getProductName().equals(productName)).collect(Collectors.toList());
    }


    public List<Shipping> getShipping() {
        return shipping;
    }
}
