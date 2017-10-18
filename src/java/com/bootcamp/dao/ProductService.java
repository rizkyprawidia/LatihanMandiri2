/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bootcamp.dao;

import com.bootcamp.model.Product;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class ProductService {
   
   EntityManagerFactory emf;
    
    EntityManager em;
    
    public ProductService() {
       emf = Persistence.createEntityManagerFactory("AplikasiBelanjaPU2");
       em = emf.createEntityManager();
//        
    }
    
      
    
    public List<Product> findAllProduct (){
        List<Product> prod ;
         prod= this.em.createNamedQuery("Product.findAll").getResultList();
        return prod;
            
        
    }
    
    public Product findById(Integer productId){
       Query query = em.createNamedQuery("Product.findByProductId");
       query.setParameter("productId", productId);
       List<Product> lp = query.getResultList();
       Product p = null;
       if(!lp.isEmpty()){
           p = lp.get(0);
       }
        return p;
    }

    
   

  
    
   
}
