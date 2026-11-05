/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.j126.hill.cipher;

/**
 *
 * @author NILDOPC
 */


public final class CipherHill97 {

    private static final int MODULO = 97;

    private final int[][] matrizCifra;
    private final int[][] matrizDecifra;

    public CipherHill97(int[][] matrizCifra, int[][] matrizDecifra) {

        validarMatriz(matrizCifra);
        validarMatriz(matrizDecifra);

        this.matrizCifra = copiarMatriz(matrizCifra);
        this.matrizDecifra = copiarMatriz(matrizDecifra);

        validarInversas();
    }

    public int[] cifrar(int[] vetor) {
        return multiplicar(matrizCifra, vetor);
    }

    public int[] decifrar(int[] vetor) {
        return multiplicar(matrizDecifra, vetor);
    }

    private int[] multiplicar(int[][] matriz, int[] vetor) {

        if (vetor == null || vetor.length != 2) {
            throw new IllegalArgumentException(
                    "O vetor deve possuir dois elementos.");
        }

        int[] resultado = new int[2];

        for (int i = 0; i < 2; i++) {

            long soma = 0;

            for (int j = 0; j < 2; j++) {
                soma += (long) matriz[i][j] * vetor[j];
            }

            resultado[i] = (int) Math.floorMod(soma, MODULO);
        }

        return resultado;
    }

    private void validarInversas() {

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {

                long soma = 0;

                for (int k = 0; k < 2; k++) {
                    soma += (long) matrizCifra[i][k]
                            * matrizDecifra[k][j];
                }

                int valor = (int) Math.floorMod(soma, MODULO);
                int esperado = (i == j) ? 1 : 0;

                if (valor != esperado) {
                    throw new IllegalArgumentException(
                            "As matrizes nao sao inversas modulo 97.");
                }
            }
        }
    }

    private static void validarMatriz(int[][] matriz) {

        if (matriz == null || matriz.length != 2
                || matriz[0] == null || matriz[1] == null
                || matriz[0].length != 2
                || matriz[1].length != 2) {

            throw new IllegalArgumentException(
                    "A matriz deve possuir dimensoes 2x2.");
        }
    }

    private static int[][] copiarMatriz(int[][] matriz) {

        return new int[][] {
            {matriz[0][0], matriz[0][1]},
            {matriz[1][0], matriz[1][1]}
        };
    }

    public int[][] getMatrizCifra() {
        return copiarMatriz(matrizCifra);
    }

    public int[][] getMatrizDecifra() {
        return copiarMatriz(matrizDecifra);
    }
}
