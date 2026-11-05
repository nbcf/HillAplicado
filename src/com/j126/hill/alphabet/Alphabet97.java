/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.j126.hill.alphabet;

/**
 * Copyright (c)
 * @author NILDO BUENO CORREIA FILGO
 * @author AVRAHAM BUENO COHEN
 * @autor ARIEL BUENO COHEN
 * כל הזכויות שמורות. פרויקט זה מופץ תחת רישיון MIT.
 * 
 * @מחבר נילדו בואנו קוראה בן דוד
 * @מחבר אברהם בואנו כהן
 * @מחבר אריאל בואנו כהן

* 
* MIT License

Copyright (c) 2026 NILDO BUENO CORREIA FILHO, AVRAHAM BUENO COHEN, ARIEL BUENO COHEN

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
* 
רישיון MIT

כל הזכויות שמורות (c) 2026 נילדו בואנו קוראה בן, אברהם בואנו כהן, אריאל בואנו כהן

הרשאה ניתנת בזאת, ללא תשלום, לכל אדם המקבל עותק של תוכנה זו וקבצי התיעוד הנלווים אליה (להלן: "התוכנה"), לעשות בתוכנה שימוש ללא הגבלה, לרבות אך ללא הגבלה הזכויות להשתמש, להעתיק, לשנות, למזג, לפרסם, להפיץ, להעניק רישיון משנה ו/או למכור עותקים של התוכנה, ולהתיר לאנשים להם התוכנה מסופקת לעשות כן, בכפוף לתנאים הבאים:

הודעת זכויות היוצרים לעיל והודעת הרשאה זו ייכללו בכל העותקים או בחלקים משמעותיים של התוכנה.

התוכנה מסופקת "כפי שהיא" (AS IS), ללא אחריות מכל סוג שהוא, מפורשת או משתמעת, לרבות אך לא רק אחריות לסחירות, התאמה למטרה מסוימת ואי-הפרה. בשום מקרה לא יהיו המחברים או בעלי זכויות היוצרים אחראים לכל תביעה, נזק או חבות אחרת, אם בפעולה של חוזה, עוולה או אחרת, הנובעת מתוך, מחוץ או בקשר לתוכנה או לשימוש או עסקאות אחרות בתוכנה.

* Licença MIT

Copyright (c) 2026 NILDO BUENO CORREIA FILHO, AVRAHAM BUENO COHEN, ARIEL BUENO COHEN

É concedida permissão, gratuitamente, a qualquer pessoa que obtenha uma cópia
deste software e dos arquivos de documentação associados (o "Software"), para
lidar com o Software sem restrições, incluindo, sem limitação, os direitos
de usar, copiar, modificar, mesclar, publicar, distribuir, sublicenciar e/ou
vender cópias do Software, e permitir que as pessoas a quem o Software é
fornecido o façam, sujeito às seguintes condições:

O aviso de copyright acima e este aviso de permissão devem ser incluídos em todas
as cópias ou partes substanciais do Software.

O SOFTWARE É FORNECIDO "COMO ESTÁ", SEM GARANTIA DE QUALQUER TIPO, EXPRESSA OU
IMPLICÍTAI, INCLUINDO, MAS NÃO SE LIMITANDO ÀS GARANTIAS DE COMERCIALIZAÇÃO,
ADEQUAÇÃO A UM DETERMINADO FIM E NÃO VIOLAÇÃO. EM NENHUM CASO OS AUTORES OU
DETENTORES DE DIREITOS AUTORAIS SERÃO RESPONSÁVEIS POR QUALQUER REIVINDICAÇÃO,
DANOS OU OUTRA RESPONSABILIDADE, SEJA EM AÇÃO DE CONTRATO, ILÍCITO OU DE OUTRA
FORMA, DECORRENTE DE, FORA DE OU EM CONEXÃO COM O SOFTWARE OU O USO OU OUTRAS
NEGOCIAÇÕES NO SOFTWARE.

 */
public final class Alphabet97 {
 // Coluna 0 = caractere
    // Coluna 1 = valor modular
    // Coluna 2 = representacao binaria UTF-8

    private static final String[][] DICIONARIO = {

        // Caractere, valor, binario
        {"§", "0",  "11000010 10100111"},

        // Letras minusculas
        {"a", "1",  "01100001"},
        {"b", "2",  "01100010"},
        {"c", "3",  "01100011"},
        {"d", "4",  "01100100"},
        {"e", "5",  "01100101"},
        {"f", "6",  "01100110"},
        {"g", "7",  "01100111"},
        {"h", "8",  "01101000"},
        {"i", "9",  "01101001"},
        {"j", "10", "01101010"},
        {"k", "11", "01101011"},
        {"l", "12", "01101100"},
        {"m", "13", "01101101"},
        {"n", "14", "01101110"},
        {"o", "15", "01101111"},
        {"p", "16", "01110000"},
        {"q", "17", "01110001"},
        {"r", "18", "01110010"},
        {"s", "19", "01110011"},
        {"t", "20", "01110100"},
        {"u", "21", "01110101"},
        {"v", "22", "01110110"},
        {"w", "23", "01110111"},
        {"x", "24", "01111000"},
        {"y", "25", "01111001"},
        {"z", "26", "01111010"},

        // Letras maiusculas
        {"A", "27", "01000001"},
        {"B", "28", "01000010"},
        {"C", "29", "01000011"},
        {"D", "30", "01000100"},
        {"E", "31", "01000101"},
        {"F", "32", "01000110"},
        {"G", "33", "01000111"},
        {"H", "34", "01001000"},
        {"I", "35", "01001001"},
        {"J", "36", "01001010"},
        {"K", "37", "01001011"},
        {"L", "38", "01001100"},
        {"M", "39", "01001101"},
        {"N", "40", "01001110"},
        {"O", "41", "01001111"},
        {"P", "42", "01010000"},
        {"Q", "43", "01010001"},
        {"R", "44", "01010010"},
        {"S", "45", "01010011"},
        {"T", "46", "01010100"},
        {"U", "47", "01010101"},
        {"V", "48", "01010110"},
        {"W", "49", "01010111"},
        {"X", "50", "01011000"},
        {"Y", "51", "01011001"},
        {"Z", "52", "01011010"},

        // Algarismos
        {"0", "53", "00110000"},
        {"1", "54", "00110001"},
        {"2", "55", "00110010"},
        {"3", "56", "00110011"},
        {"4", "57", "00110100"},
        {"5", "58", "00110101"},
        {"6", "59", "00110110"},
        {"7", "60", "00110111"},
        {"8", "61", "00111000"},
        {"9", "62", "00111001"},

        // Espaco e simbolos
        {" ",  "63", "00100000"},
        {"!",  "64", "00100001"},
        {"\"", "65", "00100010"},
        {"#",  "66", "00100011"},
        {"$",  "67", "00100100"},
        {"%",  "68", "00100101"},
        {"&",  "69", "00100110"},
        {"'",  "70", "00100111"},
        {"(",  "71", "00101000"},
        {")",  "72", "00101001"},
        {"*",  "73", "00101010"},
        {"+",  "74", "00101011"},
        {",",  "75", "00101100"},
        {"-",  "76", "00101101"},
        {".",  "77", "00101110"},
        {"/",  "78", "00101111"},
        {":",  "79", "00111010"},
        {";",  "80", "00111011"},
        {"<",  "81", "00111100"},
        {"=",  "82", "00111101"},
        {">",  "83", "00111110"},
        {"?",  "84", "00111111"},
        {"@",  "85", "01000000"},
        {"[",  "86", "01011011"},
        {"\\", "87", "01011100"},
        {"]",  "88", "01011101"},
        {"^",  "89", "01011110"},
        {"_",  "90", "01011111"},
        {"`",  "91", "01100000"},
        {"{",  "92", "01111011"},
        {"|",  "93", "01111100"},
        {"}",  "94", "01111101"},
        {"~",  "95", "01111110"},

        // Caractere adicional
        {"°", "96", "11000010 10110000"}
    };

    public static String[] obterPorIndice(int indice) {
        if (indice < 0 || indice >= DICIONARIO.length) {
            throw new IllegalArgumentException("Indice invalido");
        }
        return DICIONARIO[indice].clone();
    }

    public static int obterValor(char caractere) {
        for (String[] linha : DICIONARIO) {
            if (linha[0].charAt(0) == caractere) {
                return Integer.parseInt(linha[1]);
            }
        }
        throw new IllegalArgumentException(
            "Caractere nao encontrado: " + caractere);
    }

    public static String obterCaractere(int indice) {
        return obterPorIndice(indice)[0];
    }

    public static String obterBinario(int indice) {
        return obterPorIndice(indice)[2];
    }

}
