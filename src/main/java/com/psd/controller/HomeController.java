package com.psd.controller;

import com.psd.entity.Product;
import com.psd.service.ProductService;
import org.jboss.seam.ScopeType;
import org.jboss.seam.annotations.*;

import java.io.Serializable;
import java.util.List;

@AutoCreate
@Name("homeController")
@Scope(ScopeType.PAGE)
public class HomeController extends AbstractController implements Serializable {

    private static final long serialVersionUID = 8922738989128585844L;

    @In
    private ProductService productService;

    private String name = "name";

    public void init(){
        System.out.println("homeController.init");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void findProducts(){
        List<Product> productList = productService.findAll();
        if (productList != null) {
            LOG.info("Product's size = "+productList.size());
        }

    }
}
