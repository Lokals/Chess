package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int N = 8;
        int[][] chessboard = new int[N][N];
        Random random = new Random();

        int towerCount = 0;
        while (towerCount < N) {
            int j = random.nextInt(N);
            int k = random.nextInt(N);
            if (chessboard[j][k] == 0) {
                chessboard[j][k] = 1;
                towerCount++;
            }
        }
        for (int j = 0; j < chessboard.length; j++) {
            for (int i = 0; i < chessboard[j].length; i++) {
                System.out.print(chessboard[j][i] + "\t");
            }
            System.out.println();
        }

        int counter = 0;
        int indexCounter = 0;
        for (int j = 0; j < chessboard.length; j++) {
            int rowSum = 0;

            for (int i = 0; i < chessboard.length; i++) {
                rowSum += chessboard[j][i];
                if (rowSum > 1) {
                    counter++;
                    break;
                }
            }
        }
        System.out.println(" number of strike in rows: " + counter);
        int counterColumn = 0;
        for (int j = 0; j < chessboard.length; j++) {
            int sumColumn = 0;
            for (int i=0; i < chessboard[j].length; i++) {
                sumColumn += chessboard[i][j];

                if (sumColumn > 1) {
                    counterColumn++;
                    break;
                }
            }

        }
        System.out.println("Column " + counterColumn);

    }
}

