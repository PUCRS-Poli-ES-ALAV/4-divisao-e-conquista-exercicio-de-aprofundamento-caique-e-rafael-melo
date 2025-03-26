package br.pucrs;

public class MaxRecursive {
    public static long iterationCount = 0;

    public static long maxVal2(long[] A, int init, int end) {
        iterationCount++;
        if (end - init <= 1) {
            return Math.max(A[init], A[end]);
        } else {
            int m = (init + end) / 2;
            long v1 = maxVal2(A, init, m);
            long v2 = maxVal2(A, m + 1, end);
            return Math.max(v1, v2);
        }
    }
}
