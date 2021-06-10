
package modelo.strategy;


public class Contexto {
    private Strategy strategy;
    public Contexto(Strategy strategy){
        this.strategy=strategy;
    }
    public void ejecutarMovimiento(){
        strategy.moverse();
    }
    public void ejecutarDisparo(){
        strategy.disparar();
    }
}
