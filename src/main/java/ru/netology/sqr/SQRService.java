package ru.netology.sqr;

public class SQRService {
    public int numberOfSquaresFallingWithinTheRange(int x, int y) {
        int numberOfSquares = 0;

        for (int i = 10; i <= 99; i++) {
            if (i * i >= x & i * i <= y) {
                numberOfSquares++;
            }
        }
        return numberOfSquares;
    }
}
