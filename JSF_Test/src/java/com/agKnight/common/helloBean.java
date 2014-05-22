/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.agKnight.common;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;
import javax.inject.Named;


/**
 *
 * @author nukeboy666
 */
@ManagedBean
@Named(value = "helloBean")
@SessionScoped
public class helloBean implements Serializable {

    /**
     * Creates a new instance of helloBean
     */
    private String name;
    public helloBean() {
    }
    
    public helloBean(String name){
    this.name = name;
    }
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    
}
