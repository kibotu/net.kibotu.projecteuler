package net.kibotu.projecteuler.solved;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Problem11 {
    private Problem11() {

    }

    public static void main(String[] args) throws FileNotFoundException {

        Scanner fin = new Scanner(new BufferedReader(new FileReader(
                "./src/files/problem11.txt")));

        PrintWriter cout = new PrintWriter(System.out, true);

        Double[][] data = new Double[20][20];

        double max = 0;
        Double[] tempSum = new Double[20];

        while (fin.hasNextLine()) {

            for (int i = 0; i < 20; i++) {
                for (int j = 0; j < 20; j++) {
                    data[i][j] = fin.nextDouble();
                }
            }
        }

        // Matrix matrix = new Matrix(data);

        // matrix.show();

        // up
        for (int i = 0; i < 17; i++) {
            for (int j = 0; j < 17; j++) {

                tempSum[i] = data[i][j].doubleValue() * data[i + 1][j + 1].doubleValue() *
                        data[i + 2][j + 2].doubleValue() * data[i + 3][j + 3].doubleValue();
            }
        }

        for (int i = 0; i < 16; i++) {
            max = ((tempSum[i].doubleValue() > tempSum[i + 1].doubleValue()) ? tempSum[i].doubleValue() : tempSum[i + 1].doubleValue());
        }

        cout.println(max);
        cout.println(99 * 99 * 99 * 99);

        // down

        // left

        // right

        // diagonally
    }

    public static int getMax(int a, int b) {
        return (a > b) ? a : b;
    }
}
