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
public class PeperoniPizza extends Pizza{        
    
    private ArrayList topping = new ArrayList();    
    
    public PeperoniPizza(){
        this.setName("Pizza de Peperoni");
        this.setDough("Masa con Queso");
        this.setSauce("Tomate");
        topping.add("Peperoni");
        this.setToppings(topping);
    }
}
