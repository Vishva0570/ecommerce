package com.example.e_commerce.Model;

import org.springframework.stereotype.Component;


@Component
public class Product {
     private int ProductId ;
     private String ProductName;
     private int ProductPrice;
    public Product() {
    }
    public Product(int productId, String productName, int productPrice) {
        ProductId = productId;
        ProductName = productName;
        ProductPrice = productPrice;
    }
    public int getProductId() {
        return ProductId;
    }
    public void setProductId(int productId) {
        ProductId = productId;
    }
    public String getProductName() {
        return ProductName;
    }
    public void setProductName(String productName) {
        ProductName = productName;
    }
    public int getProductPrice() {
        return ProductPrice;
    }
    public void setProductPrice(int productPrice) {
        ProductPrice = productPrice;
    }  

     
}
