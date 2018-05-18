package org.andresbedoya.designpatterns.strategypattern;

import org.andresbedoya.designpatterns.strategypattern.comportamiento.IVolar;
import org.andresbedoya.designpatterns.strategypattern.comportamiento.VolarAlas;


/**
 *
 * @author Andres Bedoya
 */
public class PatoVolador extends Pato{

    @Override
    public void getVolar() {
        IVolar vuela = getVuela();
        vuela = new VolarAlas();
        vuela.volar();
    }

}

