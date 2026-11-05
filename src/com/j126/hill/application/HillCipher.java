/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.j126.hill.application;

import com.j126.hill.cipher.CipherHill97;
import com.j126.hill.cipher.WordsProcessor;
import com.j126.hill.matrix.Matrix;

/**
 *
 * @author NILDOPC
 */

/** API publica: cifrar e decifrar, usando uma chave matricial 2x2. */
public final class HillCipher {
    private final WordsProcessor processador;

    public HillCipher(int[][] chave) {
        int[][] inversa = Matrix.inversa(chave);
        this.processador = new WordsProcessor(new CipherHill97(chave, inversa));
    }

    public String cifrar(String mensagem) {
        return processador.cifrar(mensagem);
    }

    public String decifrar(String mensagemCifrada) {
        return processador.decifrar(mensagemCifrada);
    }
}