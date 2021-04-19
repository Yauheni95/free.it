package by.freee.it.lesson4;

import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] field = {{"1", "2", "3"}, {"4", "5", "6"}, {"7", "8", "9"}};
        int move;
        int count = 0;
        String box = "";
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)
                System.out.print(field[i][j] + " | ");
            System.out.println();
            System.out.println("----------");
        }

        Outer:
        while (count < 8) {
            count++;

            if (count % 2 != 0) {
                box = "X";
                System.out.println("First player's turn. Point out  a number of the field, please.");
            } else {
                box = "O";
                System.out.println("Second player's turn. Point out  a number of the field, please.");
            }
            while (true) {
                move = scanner.nextInt();
                if (move > 9 || move < 1)
                    System.out.println("Wrong field, try again");
                else break;
            }

            switch (move) {
                case 1:
                    field[0][0] = box;
                    break;
                case 2:
                    field[0][1] = box;
                    break;
                case 3:
                    field[0][2] = box;
                    break;
                case 4:
                    field[1][0] = box;
                    break;
                case 5:
                    field[1][1] = box;
                    break;
                case 6:
                    field[1][2] = box;
                    break;
                case 7:
                    field[2][0] = box;
                    break;
                case 8:
                    field[2][1] = box;
                    break;
                case 9:
                    field[2][2] = box;
                    break;
            }

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++)
                    System.out.print(field[i][j] + " | ");
                System.out.println();
                System.out.println("----------");
            }

            for (int i = 0; i < 3; i++) {
                for (int j = 0, b = 0, a = 0, c = 0, d = 0; j < 3; j++) {
                    if (field[i][j].equals(box))
                        a++;
                    if (field[j][i].equals(box))
                        b++;
                    if (field[j][j].equals(box))
                        c++;
                    if (field[j][2 - j].equals(box))
                        d++;
                    if (a == 3 || b == 3 || c == 3 || d == 3)
                        break Outer;
                }

            }
        }

        System.out.println("Game over");
        if (count == 8)
            System.out.println("The game ended in a draw");
        else {
            if (box.equals("X"))
                System.out.println("Player 1 win");
            if (box.equals("O"))
                System.out.println("Player 2 win");
        }
    }
}
