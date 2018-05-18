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
public class NewYorkVeggiePizzaStyle extends Pizza{        
    
    private ArrayList topping = new ArrayList();    
    
    public NewYorkVeggiePizzaStyle(){
        this.setName("Pizza Vegetariana Estilo New York");
        this.setDough("Masa Crujiente y Delgada");
        this.setSauce("Tomate y Oregano");
        topping.add("Champiñones");
        topping.add("Queso Philadelphia");
        topping.add("Jamón Pavo New York");
        this.setToppings(topping);
    }
    
    @Override
    public void bake(){
        System.out.println("Horneando a 350 grados Centigrados....");
    }
}
