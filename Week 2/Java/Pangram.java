package org.week2;

public class Pangram {
    public static void main(String[] args) {
        // Sample input
        String case1 = "We promptly judged antique ivory buckles for the next prize";
        String case2 = "We promptly judged antique ivory buckles for the prize";
        System.out.println(pangrams(case1)); // pangram
        System.out.println(pangrams(case2)); // not pangram

    }
    public static String pangrams(String s) {
        // Write your code here
        int[] arr = new int[26];
        boolean isPangram = true;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isWhitespace(c)) {
                continue;
            }
            int index = Character.getNumericValue(c) - Character.getNumericValue('a');
            arr[index]++;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                isPangram = false;
            }
        }

        if (isPangram) {
            return "pangram";
        } else {
            return "not pangram";
        }
    }
}

/*
Roy quiere mejorar su velocidad de escritura en máquina para concursos de programación. Su amigo le dijo que
escribiera la oración "The quick brown fox jumps over the lazy dog" repetidamente porque es un pangrama.
(pangramas son oraciones construidas usando todas las letras del alfabeto, por lo menos una vez.)
Después de escribir la oración muchas veces, Roy se aburrió. Entonces comenzó a buscar otros pangramas.
Dada una oración , dile a Roy si es un pangrama o no.

Formato de Entrada
La entrada consiste en una linea que contiene s.

Formato de Salida
Imprime una línea que contiene pangram si s es un pangrama, sino imprime not pangram.
*/