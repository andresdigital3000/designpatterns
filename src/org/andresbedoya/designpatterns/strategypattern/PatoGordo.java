package org.andresbedoya.designpatterns.strategypattern;

import org.andresbedoya.designpatterns.strategypattern.comportamiento.IVolar;
import org.andresbedoya.designpatterns.strategypattern.comportamiento.VolarPlaneando;

/**
 *
 * @author Andres Bedoya
 */
public class PatoGordo extends Pato{

    @Override
    public void getVolar() {
        IVolar vuela = getVuela();
        vuela = new VolarPlaneando();
        vuela.volar();
    }

}