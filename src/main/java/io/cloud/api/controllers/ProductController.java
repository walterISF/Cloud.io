package io.cloud.api.controllers;


import io.cloud.api.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/product")
@CrossOrigin(allowedHeaders = "*")
public class ProductController {

    @Autowired
    ProductService productService;
}
