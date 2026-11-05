/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.j126.hill.matrix;

/**
 *
 * @author NILDOPC
 */


/** Operacoes com matrizes 2x2 sobre Z/97Z. */
public final class Matrix {
    private static final int MODULO = 97;

    private Matrix() { }

    public static int[][] inversa(int[][] matriz) {
        if (matriz == null || matriz.length != 2
                || matriz[0] == null || matriz[1] == null
                || matriz[0].length != 2 || matriz[1].length != 2) {
            throw new IllegalArgumentException("A matriz deve ser 2x2.");
        }

        int a = Math.floorMod(matriz[0][0], MODULO);
        int b = Math.floorMod(matriz[0][1], MODULO);
        int c = Math.floorMod(matriz[1][0], MODULO);
        int d = Math.floorMod(matriz[1][1], MODULO);
        int determinante = Math.floorMod(a * d - b * c, MODULO);
        if (determinante == 0) {
            throw new IllegalArgumentException("Chave nao invertivel modulo 97.");
        }
        int inversoDet = 1;
        while ((determinante * inversoDet) % MODULO != 1) {
            inversoDet++;
        }
        return new int[][] {
            {Math.floorMod(d * inversoDet, MODULO), Math.floorMod(-b * inversoDet, MODULO)},
            {Math.floorMod(-c * inversoDet, MODULO), Math.floorMod(a * inversoDet, MODULO)}
        };
    }
}
