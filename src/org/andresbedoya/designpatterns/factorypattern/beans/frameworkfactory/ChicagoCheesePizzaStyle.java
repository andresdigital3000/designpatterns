/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.andresbedoya.designpatterns.factorypattern.beans.frameworkfactory;

import org.andresbedoya.designpatterns.factorypattern.beans.Pizza;
import java.util.ArrayList;

/**
 *
 * @author Andres Bedoya
 */
public class ChicagoCheesePizzaStyle extends Pizza{        
    
    private ArrayList topping = new ArrayList();    
    
    public ChicagoCheesePizzaStyle(){
        this.setName("Pizza de Queso Estilo Chicago");
        this.setDough("Masa Esponjosa");
        this.setSauce("Tomate");
        topping.add("Queso Parmesano");
        topping.add("Queso Philadelphia");
        topping.add("Queso Tradicional Chicago");
        this.setToppings(topping);
    }
    
    @Override
    public void cut(){
        System.out.println("Cortando en Cuadros....");
    }
}
