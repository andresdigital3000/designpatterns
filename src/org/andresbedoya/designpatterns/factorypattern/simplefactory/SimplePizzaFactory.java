/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.andresbedoya.designpatterns.factorypattern.simplefactory;

import org.andresbedoya.designpatterns.factorypattern.beans.Pizza;
import org.andresbedoya.designpatterns.factorypattern.beans.simplefactory.CheesePizza;
import org.andresbedoya.designpatterns.factorypattern.beans.simplefactory.PeperoniPizza;
import org.andresbedoya.designpatterns.factorypattern.beans.simplefactory.VeggiePizza;

/**
 *
 * @author Andres Bedoya
 */
public class SimplePizzaFactory {
    
    public SimplePizzaFactory(){
        
    }
    
    public Pizza createPizza(String name){
        
        Pizza pizza = null;
        
        if(name.equals("Peperoni")){
            pizza = new PeperoniPizza();
        }else if(name.equals("Vegetariana")){
            pizza = new VeggiePizza();
        }else if(name.equals("Queso")){
           pizza = new CheesePizza(); 
        }  
        
        return pizza;  
    }    
}
