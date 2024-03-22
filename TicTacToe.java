import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class TicTacToe extends Application {
    private static final int SIZE = 5;
    private static final int WIN_CONDITION = 5;
    private String currentPlayer = "X";
    private Button[][] board = new Button[SIZE][SIZE];

    @Override
    public void start(Stage primaryStage) {
        GridPane gridPane = new GridPane();

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                Button button = new Button(" ");
                button.setPrefSize(100.0, 100.0);
                final int finalI = i;
                final int finalJ = j;
                button.setOnAction(e -> makeMove(finalI, finalJ, button));

                gridPane.add(button, j, i);
                board[i][j] = button;
            }
        }

        Scene scene = new Scene(gridPane, 500, 500);
        primaryStage.setTitle("Tic Tac Toe");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void makeMove(int i, int j, Button button) {
        if (!button.getText().equals(" ")) return;

        button.setText(currentPlayer);
        if (checkWin(i, j)) {
            System.out.println("Player " + currentPlayer + " wins!");
          
        }

        currentPlayer = currentPlayer.equals("X") ? "O" : "X";
    }

    private boolean checkWin(int row, int col) {
        // Horizontal, vertical, and both diagonal checks
        return checkLine(row, col, 1, 0) || // Horizontal
               checkLine(row, col, 0, 1) || // Vertical
               checkLine(row, col, 1, 1) || // Diagonal
               checkLine(row, col, 1, -1);  // Anti-diagonal
    }

    private boolean checkLine(int row, int col, int dRow, int dCol) {
        int count = 1;
        int r, c;

        // Check one direction
        r = row + dRow;
        c = col + dCol;
        while (r >= 0 && r < SIZE && c >= 0 && c < SIZE && board[r][c].getText().equals(currentPlayer)) {
            count++;
            r += dRow;
            c += dCol;
        }

        // Check the opposite direction
        r = row - dRow;
        c = col - dCol;
        while (r >= 0 && r < SIZE && c >= 0 && c < SIZE && board[r][c].getText().equals(currentPlayer)) {
            count++;
            r -= dRow;
            c -= dCol;
        }

        return count >= WIN_CONDITION;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
