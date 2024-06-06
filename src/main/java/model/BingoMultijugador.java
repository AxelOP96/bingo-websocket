package model;

import enumeration.EstadoJuego;
import java.util.Objects;
import java.util.UUID;

/**
 * Class representing a Multiplayer Bingo game.
 *
 * @author Axel Leguero
 */
public class BingoMultijugador {
    private String gameId;
    private String[][] board;
    private String nombreJugador;
    private String nombreJugador2;
    private String winner;
    private String turn;
    private EstadoJuego gameState;

    public BingoMultijugador(String player1, String player2) {
        this.gameId = UUID.randomUUID().toString();
        this.nombreJugador = player1;
        this.nombreJugador2 = player2;
        this.turn = player1;
        this.board = new String[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                this.board[i][j] = " ";
            }
        }
        gameState = EstadoJuego.WAITING_FOR_PLAYER;
    }

    /**
     * Makes a move in the specified position on the board.
     *
     * @param player the name of the player making the move
     * @param move   the position of the move
     */
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
   /*  private void checkWinner() {
        for (int i = 0; i < 3; i++) {
            if (Objects.equals(board[i][0], board[i][1]) && Objects.equals(board[i][0], board[i][2])) {
                if (!Objects.equals(board[i][0], " ")) {
                    setWinner(Objects.equals(board[i][0], player1) ? player1 : player2);
                    return;
                }
            }
        }

        for (int i = 0; i < 3; i++) {
            if (Objects.equals(board[0][i], board[1][i]) && Objects.equals(board[0][i], board[2][i])) {
                if (!Objects.equals(board[0][i], " ")) {
                    setWinner(Objects.equals(board[0][i], player1) ? player1 : player2);
                    return;
                }
            }
        }

        if (Objects.equals(board[0][0], board[1][1]) && Objects.equals(board[0][0], board[2][2])) {
            if (!Objects.equals(board[0][0], " ")) {
                setWinner(Objects.equals(board[0][0], player1) ? player1 : player2);
                return;
            }
        }
    }
 */
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

    /**
     * Check if the board is full.
     *
     *  true if the board is full, false otherwise
     */
    // private boolean isBoardFull() {
    //     for (int i = 0; i < 3; i++) {
    //         for (int j = 0; j < 3; j++) {
    //             if (Objects.equals(board[i][j], " ")) {
    //                 return false;
    //             }
    //         }
    //     }
    //     return true;
    // }

    /**
     * Check if the game is over.
     *
     *  true if the game is over, false otherwise
     */
    /* public boolean isGameOver() {
        return winner != null || isBoardFull();
    }
 */
    /**
     * Getters and Setters
     */
    public String getGameId() {
        return gameId;
    }

    public void setGameId(String gameId) {
        this.gameId = gameId;
    }

    public String[][] getBoard() {
        return board;
    }

    public void setBoard(String[][] board) {
        this.board = board;
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
