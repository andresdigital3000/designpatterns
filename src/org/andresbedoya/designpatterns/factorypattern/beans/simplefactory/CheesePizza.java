/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.andresbedoya.designpatterns.factorypattern.beans.simplefactory;

import org.andresbedoya.designpatterns.factorypattern.beans.Pizza;
import java.util.ArrayList;

/**
 *
 * @author Andres Bedoya
 */
public class CheesePizza extends Pizza{        
    
    private ArrayList topping = new ArrayList();    
    
    public CheesePizza(){
        this.setName("Pizza de Queso");
        this.setDough("Masa Crujiente");
        this.setSauce("Tomate y Anchoas");
        topping.add("Queso");
        this.setToppings(topping);
    }
}
