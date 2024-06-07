package model;

import enumeration.EstadoJuego;
import java.util.Objects;
import java.util.UUID;
import model.*;
/**
 * Class representing a Multiplayer Bingo game.
 *
 * @author Axel Leguero
 */
public class BingoMultijugador {
    private final ServicioBingo servicioBingo;
    private String gameId;
    private CartonBingo cartonJugador1;
    private CartonBingo cartonJugador2;
    private String nombreJugador;
    private String nombreJugador2;
    private String winner;
    private String turn;
    private EstadoJuego gameState;

    public BingoMultijugador(String player1, String player2) {
        servicioBingo = new ServicioBingoImpl();
        this.gameId = UUID.randomUUID().toString();
        this.nombreJugador = player1;
        this.nombreJugador2 = player2;
        this.turn = player1;
        this.cartonJugador1 = servicioBingo.generarCarton(5);
        this.cartonJugador2 = servicioBingo.generarCarton(5);
        gameState = EstadoJuego.WAITING_FOR_PLAYER;
    }


    // public void makeMove(String player, int move) {
    //     int row = move / 3;
    //     int col = move % 3;
    //     if (Objects.equals(board[row][col], " ")) {
    //         board[row][col] = Objects.equals(player, nombreJugador1) ? "X" : "O";
    //         turn = player.equals(player1) ? player2 : player1;
    //         checkWinner();
    //         updateGameState();
    //     }
    // }

    /**
     * Check if there is a winner. If a winning combination is found,
     * the winner is set to the corresponding player.
     */
    private void checkWinner() {

        if(servicioBingo.linea(servicioBingo.getNumerosMarcadosEnElCarton(), cartonJugador1)){
            setWinner(nombreJugador);
            return;
        }
        if(servicioBingo.linea(servicioBingo.getNumerosMarcadosEnElCarton(), cartonJugador2)){
            setWinner(nombreJugador2);
            return;
        }
    }


    /**
     * Updates the game state based on the current state of the game.
     */
    // private void updateGameState() {
    //     if (winner != null) {
    //         gameState = winner.equals(player1) ? EstadoJuego.PLAYER1_WON : EstadoJuego.PLAYER2_WON;
    //     } else if (isBoardFull()) {
    //         gameState = EstadoJuego.TIE;
    //     } else {
    //         gameState = turn.equals(player1) ? EstadoJuego.PLAYER1_TURN : EstadoJuego.PLAYER2_TURN;
    //     }
    // }



    public boolean isGameOver() {
        return winner != null || servicioBingo.getSeHizobingo() == true;
    }


    public String getGameId() {
        return gameId;
    }

    public void setGameId(String gameId) {
        this.gameId = gameId;
    }

    public String getNombreJugador() {
        return nombreJugador;
    }

    public void setNombreJugador(String player1) {
        this.nombreJugador = player1;
    }

    public String getNombreJugador2() {
        return nombreJugador2;
    }

    public void setNombreJugador2(String player2) {
        this.nombreJugador2 = player2;
    }

    public String getWinner() {
        return winner;
    }

    public void setWinner(String winner) {
        this.winner = winner;
    }

    public String getTurn() {
        return turn;
    }

    public void setTurn(String turn) {
        this.turn = turn;
    }

    public EstadoJuego getGameState() {
        return gameState;
    }

    public void setGameState(EstadoJuego gameState) {
        this.gameState = gameState;
    }
}
