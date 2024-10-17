package Primera;

import java.util.Random;
import java.util.Scanner;

public class Minesweeper {

    public static void main(String arg[]) {

        int heigth = 6;
        int width = 35;

        int[][] map = new int[heigth][width];
        int mines = 10;

        generateMines(map, mines);
        updateMines(map);
        printMap(map);
    }

    public static void updateMines(int[][] map) {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (map[i][j] != 9) {
                    int cont = 0;

                    // Aqui se revisan todas las celdas vecinas
                    for (int di = -1; di <= 1; di++) {
                        for (int dj = -1; dj <= 1; dj++) {
                            if (di == 0 && dj == 0) {
                                // Celda actual
                                continue;
                            }

                            int ni = i + di;
                            int nj = j + dj;

                            if (ni >= 0 && ni < map.length && nj >= 0 && nj < map[ni].length) {
                                if (map[ni][nj] == 9) {
                                    cont++;
                                }
                            }
                        }
                    }

                    map[i][j] = cont;
                }

            }
        }
    }

    public static boolean detectMine(int[][] map, int column, int row) {
        if (map[column][row] == 9) {
            return true;
        } else {
            return false;
        }
    }

    public static void generateMines(int[][] map, int mines) {
        for (int i = 0; i < mines; i++) {
            Random rand = new Random();

            int column = rand.nextInt(map.length-1);
            int row = rand.nextInt(map[0].length-1);

            if (!detectMine(map, column, row)) {
                map[column][row] = 9;
            } else {
                i--;
            }
        }
    }

    public static void printMap(int[][] map) {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (map[i][j] == 0) {
                    System.out.print("  ");

                } else {
                    System.out.print(map[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
