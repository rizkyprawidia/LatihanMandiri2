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
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping("/products")
public class ProductController {
    
    @Autowired
    ProductService ps;

     List<Product> keranjang = new ArrayList<>();
        
    @RequestMapping(value = "/all")
    public String showAllProducts(HttpSession session) {
        List<Product> product = ps.findAllProduct();
        session.setAttribute("prod", product);
        session.setAttribute("cart", keranjang);
        return "products";

    }

    @RequestMapping(value = "/{productId}")
    public String showOneProducts(@PathVariable Integer productId, Model model) {
       Product pro = ps.findById(productId);
        model.addAttribute("prod", pro);
        return "productdetail";
        
   }
//        @RequestMapping(value="/addToCart")
//        public String addToCart(HttpSession session){
//     List<Product> item = (List<Product>) session.getAttribute("cart");
//     
//     item.add((Product)session.getAttribute("prod"));
//    
//     session.removeAttribute("prod");
//        
//        return "cart";
//    }
  
    @RequestMapping(value="/addToCart")
    public String addToCart(HttpSession session){
        List<Product> item = (List<Product>)session.getAttribute("cart");
       session.getAttribute("prod");
        item.add((Product)session.getAttribute("prod"));
        session.removeAttribute("prod");
        return "cart";
        
    }
    
    }

