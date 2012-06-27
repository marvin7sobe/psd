package com.psd.dao;

import com.psd.entity.Product;
import org.jboss.seam.ScopeType;
import org.jboss.seam.annotations.AutoCreate;
import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.Scope;

import javax.persistence.EntityManager;
import java.util.List;

@AutoCreate
@Name("productDao")
@Scope(ScopeType.APPLICATION)
public class ProductDao extends AbstractDao {

    @In
    EntityManager entityManager;

    public List<Product> findAll(){
        return (List<Product>)entityManager.createQuery("select p from Product p").getResultList();
    }

    public void createProduct(String name, Long groupId, Long price){


    }
}
