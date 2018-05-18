package org.andresbedoya.designpatterns.observerpattern.design;

/**
 * Interfaz que tiene que implementar el sujeto a observar.
 * 
 * @author Andres Bedoya
 */
public interface ISujeto {

    public void addObservador(IObservador obs);
    public void removeLastObservador();
    public void notificarObservadores();

}
