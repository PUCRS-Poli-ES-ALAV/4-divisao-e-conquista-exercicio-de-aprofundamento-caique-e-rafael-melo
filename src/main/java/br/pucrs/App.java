package br.pucrs;

import java.util.Random;

public class App {
    public static void main(String[] args) {

        System.out.println("====== MERGESORT ======\n");

        int[] sizes = {32, 2048, 1_048_576};
        Random rand = new Random();

        for (int size : sizes) {
            int[] array = new int[size];
            for (int i = 0; i < size; i++) {
                array[i] = rand.nextInt(10000);
            }

            MergeSort.iterationCount = 0;
            long startTime = System.nanoTime();
            MergeSort.mergeSort(array, 0, array.length - 1);
            long endTime = System.nanoTime();

            System.out.println("==============================================");
            System.out.println("Tamanho do vetor: " + size);
            System.out.println("Número de iterações: " + MergeSort.iterationCount);
            System.out.printf("Tempo gasto: %.3f ms%n", (endTime - startTime) / 1_000_000.0);
            System.out.println("==============================================\n");
        }

        System.out.println("====== ALGORITMO MAXFINDER (linear) ======\n");

        for (int size : sizes) {
            long[] array = new long[size];
            for (int i = 0; i < size; i++) {
                array[i] = rand.nextInt(100000);
            }

            MaxFinder.iterationCount = 0;
            long startTime = System.nanoTime();
            long max = MaxFinder.maxVal1(array, array.length);
            long endTime = System.nanoTime();

            System.out.println("==============================================");
            System.out.println("Tamanho do vetor: " + size);
            System.out.println("Maior valor encontrado: " + max);
            System.out.println("Número de iterações: " + MaxFinder.iterationCount);
            System.out.printf("Tempo gasto: %.3f ms%n", (endTime - startTime) / 1_000_000.0);
            System.out.println("==============================================\n");
        }

        System.out.println("====== ALGORITMO MAXRECURSIVE (divisão e conquista) ======\n");

        for (int size : sizes) {
            long[] array = new long[size];
            for (int i = 0; i < size; i++) {
                array[i] = rand.nextInt(100000);
            }

            MaxRecursive.iterationCount = 0;
            long startTime = System.nanoTime();
            long max = MaxRecursive.maxVal2(array, 0, array.length - 1);
            long endTime = System.nanoTime();

            System.out.println("==============================================");
            System.out.println("Tamanho do vetor: " + size);
            System.out.println("Maior valor encontrado: " + max);
            System.out.println("Número de iterações: " + MaxRecursive.iterationCount);
            System.out.printf("Tempo gasto: %.3f ms%n", (endTime - startTime) / 1_000_000.0);
            System.out.println("==============================================\n");
        }

        System.out.println("====== MULTIPLY (divisão e conquista) ======\n");

        int[] bits = {4, 16, 64};

        for (int n : bits) {
            long maxVal = (1L << n) - 1;
            long x = (long) (rand.nextDouble() * maxVal);
            long y = (long) (rand.nextDouble() * maxVal);

            Multiply.iterationCount = 0;
            long startTime = System.nanoTime();
            long result = Multiply.multi(x, y, n);
            long endTime = System.nanoTime();

            System.out.println("==============================================");
            System.out.println("Bits: " + n);
            System.out.println("x: " + x);
            System.out.println("y: " + y);
            System.out.println("Resultado: " + result);
            System.out.println("Número de iterações: " + Multiply.iterationCount);
            System.out.printf("Tempo gasto: %.3f ms%n", (endTime - startTime) / 1_000_000.0);
            System.out.println("==============================================\n");
        }
    }
}
