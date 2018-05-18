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
public class ChicagoPeperoniPizzaStyle extends Pizza{        
    
    private ArrayList topping = new ArrayList();    
    
    public ChicagoPeperoniPizzaStyle(){
        this.setName("Pizza de Peperoni Estilo Chicago");
        this.setDough("Masa Esponjosa");
        this.setSauce("Tomate");
        topping.add("Peperoni");
        topping.add("Queso Tradicional Chicago");
        this.setToppings(topping);
    }
    
    @Override
    public void cut(){
        System.out.println("Cortando en Cuadros....");
    }
}
