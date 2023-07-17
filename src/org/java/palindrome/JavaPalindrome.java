package org.java.palindrome;

import java.util.Scanner;

public class JavaPalindrome {
    public static void main(String[] args){
        //scrivere un programma che chiede all’utente
        // di inserire una parola e gli risponde se è una parola palindroma oppure no

        Scanner scan = new Scanner(System.in);

        System.out.println("Inserisci una parola: ");
        String word = scan.nextLine();
        String reversedWord = "" ;

        for (int i = word.length() - 1; i >= 0 ; i--) {
            reversedWord += word.charAt(i);
        }

        if (word.equals(reversedWord))
            System.out.println("La parola " + word + " è palindroma");
        else
            System.out.println("La parola " + word +  " non è palindroma");
    }
}
