package org.andresbedoya.designpatterns.strategypattern.comportamiento;

/**
 *
 * @author Andres Bedoya
 */
public class VolarPlaneando implements IVolar{

    public void volar() {
        System.out.println("Yo solo planeo por corto tiempo.");
    }

}