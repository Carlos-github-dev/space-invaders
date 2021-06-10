package modelo.factory;

public class Factory {

    public Jugador crearNuevoJugador(String channel) {
        if (channel == null || channel.isEmpty()) {
            return null;
        }
        if ("usuario".equals(channel)) {
            return new JugadorUsuario();
        } else if ("enemigo".equals(channel)) {
            return new JugadorEnemigo();
        }

        return null;
    }
}
