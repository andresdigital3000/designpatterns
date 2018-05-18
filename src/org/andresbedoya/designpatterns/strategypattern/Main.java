package org.andresbedoya.designpatterns.strategypattern;

/**
 *
 * @author Andres Bedoya
 */
public class Main {

    public static void main(String... args){
        Pato generico = new PatoGordo();
        generico.getVolar();

        generico = new PatoHule();
        generico.getVolar();

        generico = new PatoVolador();
        generico.getVolar();
    }

}