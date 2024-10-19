package com.example.e_commerce.Controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.e_commerce.Model.Product;
import com.example.e_commerce.Service.ProductService;

import java.util.List;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
public class ProductController {

     @Autowired
     ProductService productService;
    @GetMapping("/products")
    public List<Product> product() {
        return productService.getProducts();
    }
    
    @GetMapping("/product/{Id}")
    public ResponseEntity<Product> getProduct(@PathVariable int Id ) {
        return productService.getProduct(Id);
    }
    
}
