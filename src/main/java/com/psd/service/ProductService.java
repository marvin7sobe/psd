package com.psd.service;

import com.psd.dao.ProductDao;
import com.psd.entity.Product;
import org.jboss.seam.ScopeType;
import org.jboss.seam.annotations.AutoCreate;
import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.Scope;

import java.util.List;

@AutoCreate
@Name("productService")
@Scope(ScopeType.APPLICATION)
public class ProductService extends AbstractService{

    @In
    ProductDao productDao;

    public List<Product> findAll(){
        return productDao.findAll();
    }

    public void createProduct(String name, Long groupId, Long price){
        productDao.createProduct(name, groupId, price);
    }
}
