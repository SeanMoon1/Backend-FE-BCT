package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;



@RestController
public class ProductController {

    @Autowired
    private ProductsService productsService;

    @RequestMapping("/BCT/Products")
    public List<Products> getAllProducts(){
        return productsService.getProducts();
    }
    @RequestMapping("/BCT/Shipping")
    public List<Shipping> getAllShipping(){
        return productsService.getShipping();
    }

    @RequestMapping("/BCT/Products/{productName}")
    public List getProductName(@PathVariable String productName){
        return  productsService.getProductName(productName);
    }

    @RequestMapping(method=RequestMethod.POST,value="/BCT/Products/")
    public void addProducts(@RequestBody Products data){
          ProductsService.addProduct(data);
    }

    @RequestMapping(method=RequestMethod.PUT,value="/BCT/{productName}")
    public void updateProducts(@RequestBody Products data, @PathVariable String productName){
        ProductsService.updateProduct(data,productName);
    }
    @RequestMapping(method=RequestMethod.DELETE,value="/BCT/Products/{productName}")
    public void deleteProducts(@PathVariable String productName){
        ProductsService.deleteProduct(productName);
    }

}
