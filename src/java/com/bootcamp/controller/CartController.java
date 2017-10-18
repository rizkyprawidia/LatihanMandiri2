/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bootcamp.controller;

import com.bootcamp.dao.ProductService;
import com.bootcamp.model.Product;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/shoppingCart")
public class CartController {
    
    @Autowired
    ProductService pser;
    
    @RequestMapping
    public String cartController(HttpSession session,Model model){
        List<Product> listProduct = (List<Product>) session.getAttribute("cart");
        List<Product> products = new ArrayList<>();
        
        for (Product product : listProduct){
            products.add(pser.findById(product.getProductId()));
        }
        
        model.addAttribute("products", products);
        return "cart";
    }
}
