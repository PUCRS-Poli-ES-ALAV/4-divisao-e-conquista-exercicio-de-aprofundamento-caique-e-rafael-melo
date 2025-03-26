package br.pucrs;

public class Multiply {

    public static long iterationCount = 0;

    public static long multi(long x, long y, int n) {
        iterationCount++;

        if (n == 1) {
            return x * y;
        }

        int m = (int) Math.ceil(n / 2.0);

        long a = x >> m;
        long b = x & ((1L << m) - 1);
        long c = y >> m;
        long d = y & ((1L << m) - 1);

        long e = multi(a, c, m);
        long f = multi(b, d, m);
        long g = multi(b, c, m);
        long h = multi(a, d, m);

        return (1L << (2 * m)) * e + (1L << m) * (g + h) + f;
    }
}
