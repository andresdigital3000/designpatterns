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
public class VeggiePizza extends Pizza{        
    
    private ArrayList topping = new ArrayList();    
    
    public VeggiePizza(){
        this.setName("Pizza Vegetariana");
        this.setDough("Masa Delgada");
        this.setSauce("Tomate");
        topping.add("Champiñones");
        topping.add("Rajas");
        topping.add("Philadelphia");
        this.setToppings(topping);        
    }
}
