package com.example.e_commerce.Service;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.e_commerce.Model.Product;

@Service
public class ProductService {

    List<Product> products = Arrays.asList(new Product(1, "MobilePhone", 20000),new Product(02,"Laptop",50000) );

    public List<Product> getProducts(){
        return products;

    }

    public ResponseEntity<Product> getProduct(int Id) {
        Product product = products.stream().filter(p-> p.getProductId()== Id).findFirst().orElse(new Product(0,"No Item",0));
      return new ResponseEntity<>(product, HttpStatus.OK);
    }

  
}
