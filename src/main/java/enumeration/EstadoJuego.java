package enumeration;

public enum EstadoJuego {
    WAITING_FOR_PLAYER("Esperando por otro jugador."),
    PLAYER1_TURN("Turno del jugador 1."),
    PLAYER2_TURN("Turno del jugador 2."),
    PLAYER1_WON("El jugador 1 ganó."),
    PLAYER2_WON("El jugador 2 ganó"),
    TIE("Empate.");

    String description;

    EstadoJuego(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
