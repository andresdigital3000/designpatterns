/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.andresbedoya.designpatterns.factorypattern.simplefactory;

import org.andresbedoya.designpatterns.factorypattern.beans.Pizza;

/**
 *
 * @author Andres Bedoya
 */
public class PizzaStore {
    
    SimplePizzaFactory factory;
    
    public PizzaStore(SimplePizzaFactory factory){
        this.factory = factory;
    }
    
    public Pizza orderPizza(String name){
        
        Pizza pizza = null;
        
        pizza = factory.createPizza(name);
        
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        
        return pizza;
    }
    
}
