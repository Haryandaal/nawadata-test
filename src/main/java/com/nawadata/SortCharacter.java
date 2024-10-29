package com.nawadata;

import java.util.Scanner;

public class SortCharacter {
    public static String procVowel(String param){
        StringBuilder vowelChars = new StringBuilder(); // Untuk menyimpan karakter vokal
        String vowel = "aeoiu"; // Daftar vokal yang valid

        for (char c : param.toLowerCase().toCharArray()) { // Mengonversi input ke huruf kecil dan memecahnya menjadi karakter
            if (vowel.contains(String.valueOf(c))) { // Memeriksa apakah karakter adalah vokal
                if (vowelChars.indexOf(String.valueOf(c)) == -1) { // Jika vokal belum ada dalam StringBuilder
                    vowelChars.append(c); // Tambahkan vokal ke StringBuilder
                } else {
                    vowelChars.insert(vowelChars.indexOf(String.valueOf(c)), c); // Jika vokal sudah ada, tambahkan di depan
                }
            }
        }
        return vowelChars.toString(); // Mengembalikan hasil sebagai string
    }

    public static String procConsonant(String param){
        StringBuilder consonantChars = new StringBuilder();
        String consonant = "bcdfghjklmnpqrstvwxqyz";

        for (char c : param.toLowerCase().toCharArray()) {
            if (consonant.contains(String.valueOf(c))) {
                if (consonantChars.indexOf(String.valueOf(c)) == -1) {
                    consonantChars.append(c);
                } else {
                    consonantChars.insert(consonantChars.indexOf(String.valueOf(c)), c);
                }
            }
        }
        return consonantChars.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input one line of words (S) : ");
        String input = scanner.nextLine();

        String charVowel = procVowel(input);
        String charConsonant = procConsonant(input);

        System.out.println("Vowel Characters:");
        System.out.println(charVowel);
        System.out.println("Consonant Characters:");
        System.out.println(charConsonant);
        scanner.close();
    }
}
