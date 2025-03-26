package br.pucrs;

public class MaxFinder {
    public static long iterationCount = 0;

    public static long maxVal1(long[] A, int n) {
        long max = A[0];
        for (int i = 1; i < n; i++) {
            iterationCount++;
            if (A[i] > max)
                max = A[i];
        }
        return max;
    }
}
