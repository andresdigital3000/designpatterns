package org.andresbedoya.designpatterns.strategypattern;

import org.andresbedoya.designpatterns.strategypattern.comportamiento.IVolar;
import org.andresbedoya.designpatterns.strategypattern.comportamiento.NoVolar;

/**
 *
 * @author Andres Bedoya
 */
public class PatoHule extends Pato{

    @Override
    public void getVolar() {
        IVolar vuela = getVuela();
        vuela = new NoVolar();
        vuela.volar();
    }

}