package org.andresbedoya.designpatterns.strategypattern.comportamiento;

/**
 *
 * @author Andres Bedoya
 */
public class NoVolar implements IVolar{

    public void volar() {
        System.out.println("Yo no puedo volar.");
    }

}