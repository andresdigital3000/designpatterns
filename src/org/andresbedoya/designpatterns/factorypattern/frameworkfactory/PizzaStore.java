/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.andresbedoya.designpatterns.factorypattern.frameworkfactory;

import org.andresbedoya.designpatterns.factorypattern.beans.Pizza;

/**
 *
 * @author Andres Bedoya
 */
public abstract class PizzaStore {
    
    public PizzaStore(){
        
    }
    
    public Pizza orderPizza(String name){
        
        Pizza pizza = null;
        
        pizza = createPizza(name);
        
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        
        return pizza;
    }
    
    protected abstract Pizza createPizza(String name);
}
