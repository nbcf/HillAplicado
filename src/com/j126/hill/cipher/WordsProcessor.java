/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.j126.hill.cipher;

import com.j126.hill.alphabet.Alphabet97;

/**
 *
 * @author NILDOPC
 */

public final class WordsProcessor{
    private final CipherHill97 hill;

    public WordsProcessor(CipherHill97 hill) {
        if (hill == null) throw new IllegalArgumentException("Cifra obrigatoria.");
        this.hill = hill;
    }

    public String cifrar(String mensagem) {
        if (mensagem == null) throw new IllegalArgumentException("Mensagem nula.");
        int comprimento = mensagem.length();
        if ((comprimento & 1) != 0) mensagem += 'z';
        StringBuilder saida = new StringBuilder().append(comprimento).append('|');
        for (int i = 0; i < mensagem.length(); i += 2) {
            int[] vetor = {
                Alphabet97.obterValor(mensagem.charAt(i)),
                Alphabet97.obterValor(mensagem.charAt(i + 1))
            };
            int[] cifrado = hill.cifrar(vetor);
            if (i > 0) saida.append(',');
            saida.append(cifrado[0]).append(',').append(cifrado[1]);
        }
        return saida.toString();
    }

    public String decifrar(String mensagemCifrada) {
        if (mensagemCifrada == null) throw new IllegalArgumentException("Mensagem nula.");
        int separador = mensagemCifrada.indexOf('|');
        if (separador < 1 || separador != mensagemCifrada.lastIndexOf('|')) {
            throw new IllegalArgumentException("Formato esperado: comprimento|valores.");
        }
        final int comprimento;
        try {
            comprimento = Integer.parseInt(mensagemCifrada.substring(0, separador));
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Comprimento invalido.", e);
        }
        String corpo = mensagemCifrada.substring(separador + 1);
        String[] partes = corpo.isEmpty() ? new String[0] : corpo.split(",", -1);
        if (comprimento < 0 || partes.length != comprimento + (comprimento % 2)) {
            throw new IllegalArgumentException("Quantidade de valores inconsistente.");
        }
        StringBuilder texto = new StringBuilder(partes.length);
        for (int i = 0; i < partes.length; i += 2) {
            int[] vetor = {lerValor(partes[i]), lerValor(partes[i + 1])};
            int[] decifrado = hill.decifrar(vetor);
            texto.append(Alphabet97.obterCaractere(decifrado[0]));
            texto.append(Alphabet97.obterCaractere(decifrado[1]));
        }
        if ((comprimento & 1) != 0 && texto.charAt(texto.length() - 1) != 'z') {
            throw new IllegalArgumentException("Preenchimento invalido ou chave incorreta.");
        }
        return texto.substring(0, comprimento);
    }

    private static int lerValor(String texto) {
        try {
            int valor = Integer.parseInt(texto);
            if (valor >= 0 && valor < 97) return valor;
        } catch (NumberFormatException ignored) { }
        throw new IllegalArgumentException("Valor cifrado invalido: " + texto);
    }
}
