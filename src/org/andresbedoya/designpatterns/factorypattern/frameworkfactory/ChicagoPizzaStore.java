/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.andresbedoya.designpatterns.factorypattern.frameworkfactory;

import org.andresbedoya.designpatterns.factorypattern.beans.Pizza;
import org.andresbedoya.designpatterns.factorypattern.beans.frameworkfactory.ChicagoCheesePizzaStyle;
import org.andresbedoya.designpatterns.factorypattern.beans.frameworkfactory.ChicagoPeperoniPizzaStyle;

/**
 *
 * @author Andres Bedoya
 */
public class ChicagoPizzaStore extends PizzaStore{

    @Override
    protected Pizza createPizza(String name) {
       
       Pizza pizza = null;
        
        if(name.equals("Peperoni")){
            pizza = new ChicagoPeperoniPizzaStyle();
        }else if(name.equals("Queso")){
           pizza = new ChicagoCheesePizzaStyle();
        }  
        
        return pizza; 
        
    }
}
