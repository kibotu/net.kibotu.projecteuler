package net.kibotu.projecteuler.solved;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Problem11 {
    private Problem11() {

    }

    final static PrintWriter cout = new PrintWriter(System.out, true);

    public static void main(String[] args) throws FileNotFoundException {

        final Scanner fin = new Scanner(new BufferedReader(new FileReader("assets/files/problem11.txt")));


        final int size = 20;
        final int[][] data = new int[size][size];

        int max = 0;

        while (fin.hasNextLine()) {

            for (int x = 0; x < size; x++) {
                for (int y = 0; y < size; y++) {
                    data[x][y] = fin.nextInt();
//                    cout.print(data[x][y] + " ");
                }
//                cout.println();
            }
        }


        // up
        int y = 0;
        for (int x = 0; x < size; x++) {
            for (y = 0; y < size; y++) {

                // right
                max = Math.max(max, getProduct(getHorizontalAdjacent(data, x, y)));

                // down
                max = Math.max(max, getProduct(getVerticalAdjacent(data, x, y)));

                // diagonal right
                max = Math.max(max, getProduct(getDiagonalRightAdjacent(data, x, y)));

                // diagonal left
                max = Math.max(max, getProduct(getDiagonalLeftAdjacent(data, x, y)));
            }

//            cout.println();
        }

        cout.println(max);
//        cout.println(99 * 99 * 99 * 99);
    }

    private static int getProduct(int... v) {
        int ret = 1;
        for(int i : v) {
            ret *= i;
        }
        return ret;
    }

    public static int[] getHorizontalAdjacent(final int[][] data, final int x, final int y) {
        int[] ret = new int[]{0, 0, 0, 0};

        if (y >= 0 && y < data.length - 3) {

            ret[0] = data[x][y];
            ret[1] = data[x][y + 1];
            ret[2] = data[x][y + 2];
            ret[3] = data[x][y + 3];

//            cout.println(ret[0] + " " + ret[1] + " " + ret[2] + " " + ret[3] + " ");
        }

        return ret;
    }

    public static int[] getVerticalAdjacent(final int[][] data, final int x, final int y) {
        int[] ret = new int[]{0, 0, 0, 0};

        if (x >= 0 && x < data.length - 3) {

            ret[0] = data[x][y];
            ret[1] = data[x + 1][y];
            ret[2] = data[x + 2][y];
            ret[3] = data[x + 3][y];

//            cout.println(ret[0] + " " + ret[1] + " " + ret[2] + " " + ret[3] + " ");
        }

        return ret;
    }

    private static int [] getDiagonalRightAdjacent(int[][] data, int x, int y) {
        int[] ret = new int[]{0, 0, 0, 0};

        if (x >= 0 && x < data.length - 3 && y >= 0 && y < data.length - 3) {

            ret[0] = data[x][y];
            ret[1] = data[x + 1][y + 1];
            ret[2] = data[x + 2][y + 2];
            ret[3] = data[x + 3][y + 3];

//            cout.println(ret[0] + " " + ret[1] + " " + ret[2] + " " + ret[3] + " ");
        }

        return ret;
    }

    private static int [] getDiagonalLeftAdjacent(int[][] data, int x, int y) {
        int[] ret = new int[]{0, 0, 0, 0};

        if (x >= 0 && x < data.length - 3 && y >= 3 && y < data.length) {

            ret[0] = data[x][y];
            ret[1] = data[x + 1][y - 1];
            ret[2] = data[x + 2][y - 2];
            ret[3] = data[x + 3][y - 3];

//            cout.println(ret[0] + " " + ret[1] + " " + ret[2] + " " + ret[3] + " ");
        }

        return ret;
    }
}
