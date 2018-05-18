/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.andresbedoya.designpatterns.factorypattern;

import org.andresbedoya.designpatterns.factorypattern.beans.Pizza;
import org.andresbedoya.designpatterns.factorypattern.frameworkfactory.ChicagoPizzaStore;
import org.andresbedoya.designpatterns.factorypattern.frameworkfactory.NYPizzaStore;
import org.andresbedoya.designpatterns.factorypattern.simplefactory.PizzaStore;
import org.andresbedoya.designpatterns.factorypattern.simplefactory.SimplePizzaFactory;

/**
 *
 * @author Andres Bedoya
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //PROBANDO SIMPLEFACTORY
        SimplePizzaFactory factory = new SimplePizzaFactory();
        PizzaStore store = new PizzaStore(factory);
        System.out.println("Marcela encargo--------------------");
        Pizza pizza = store.orderPizza("Vegetariana");
        System.out.println("Juan encargo--------------------");
        pizza = store.orderPizza("Queso");
        System.out.println("Pedro encargo--------------------");
        pizza = store.orderPizza("Peperoni");
        
        //PROBANDO FRAMEWORKFACTORY
        /*NYPizzaStore nyStore = new NYPizzaStore();
        ChicagoPizzaStore cStore = new ChicagoPizzaStore();
        
        System.out.println("Marcela encargo--------------------");
        Pizza pizzaF = nyStore.orderPizza("Queso");
        System.out.println("Juan encargo--------------------");
        pizzaF = nyStore.orderPizza("Vegetariana");
        
        System.out.println("Maria encargo--------------------");
        pizzaF = cStore.orderPizza("Queso");
        System.out.println("Pedro encargo--------------------");
        pizzaF = cStore.orderPizza("Peperoni");*/
    }
}
