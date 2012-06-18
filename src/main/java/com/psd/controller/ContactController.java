package com.psd.controller;

import org.jboss.seam.annotations.AutoCreate;
import org.jboss.seam.annotations.Name;

@AutoCreate
@Name("contactController")
public class ContactController {
    private String name = "name";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}