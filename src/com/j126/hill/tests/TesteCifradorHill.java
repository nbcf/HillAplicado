/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.j126.hill.tests;

import com.j126.hill.alphabet.Alphabet97;
import com.j126.hill.application.HillCipher;


/**
 *
 * @author NILDOPC
 */



public final class TesteCifradorHill {
    public static void main(String[] args) {
        HillCipher cifrador = new HillCipher(new int[][] {{1, 2}, {3, 5}});
        String[] mensagens = {"", "a", "ab", "CASA", "CASAS", "Shalom", "Fimz", "zz", "§°", "Ola, mundo!", "J126 2026!"};
        int total = 0;
        for (String original : mensagens) {
            String cifrado = cifrador.cifrar(original);
            String recuperado = cifrador.decifrar(cifrado);
            if (!original.equals(recuperado)) throw new AssertionError("Falha: " + original);
            System.out.println("OK: " + original + " -> " + cifrado + " -> " + recuperado);
            total++;
        }
        for (int i = 0; i < 97; i++) {
            String simbolo = Alphabet97.obterCaractere(i);
            if (Alphabet97.obterValor(simbolo.charAt(0)) != i) throw new AssertionError("Alfabeto: " + i);
            if (!simbolo.equals(cifrador.decifrar(cifrador.cifrar(simbolo)))) throw new AssertionError("Simbolo: " + i);
            total++;
        }
        try {
         
            new HillCipher(new int[][] {{1, 2}, {2, 4}});
            throw new AssertionError("Chave singular aceita.");
        } catch (IllegalArgumentException esperado) {
            System.out.println("OK: chave singular rejeitada.");
        }
        System.out.println("SUCESSO: " + total + " recuperacoes verificadas.");
    }
}
