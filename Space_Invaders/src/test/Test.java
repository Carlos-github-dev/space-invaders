
package test;

import modelo.factory.Factory;


public class Test {
    public static void main(String[] args) {
        Factory factory = new Factory();
        for(int i =0; i<10;i++){
            System.out.println(factory.crearNuevoJugador("usuario"));
        }
    }
}
