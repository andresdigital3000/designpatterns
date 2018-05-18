/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.andresbedoya.designpatterns.factorypattern.frameworkfactory;

import org.andresbedoya.designpatterns.factorypattern.beans.Pizza;
import org.andresbedoya.designpatterns.factorypattern.beans.frameworkfactory.NewYorkCheesePizzaStyle;
import org.andresbedoya.designpatterns.factorypattern.beans.frameworkfactory.NewYorkVeggiePizzaStyle;

/**
 *
 * @author Andres Bedoya
 */
public class NYPizzaStore extends PizzaStore{

    @Override
    protected Pizza createPizza(String name) {
       
       Pizza pizza = null;
        
        if(name.equals("Vegetariana")){
            pizza = new NewYorkVeggiePizzaStyle();
        }else if(name.equals("Queso")){
           pizza = new NewYorkCheesePizzaStyle();
        }  
        
        return pizza; 
        
    }
    
}
