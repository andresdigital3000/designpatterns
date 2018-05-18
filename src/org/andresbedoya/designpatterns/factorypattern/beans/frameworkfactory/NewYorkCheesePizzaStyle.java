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
public class NewYorkCheesePizzaStyle  extends Pizza{        
    
    private ArrayList topping = new ArrayList();    
    
    public NewYorkCheesePizzaStyle(){
        this.setName("Pizza de Queso Estilo New York");
        this.setDough("Masa Crujiente y Delgada");
        this.setSauce("Tomate y Oregano");
        topping.add("Queso Parmesano");
        topping.add("Queso Philadelphia");
        topping.add("Queso Tradicional New York");
        this.setToppings(topping);
    }
    
    @Override
    public void bake(){
        System.out.println("Horneando a 350 grados Centigrados....");
    }
            
}
