package com.nawadata;

import java.util.Scanner;

public class PSBB {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input the number of families : ");
        int numberOfFamilies = Integer.parseInt(scanner.nextLine());

        System.out.print("Input the number of members in the family (separated by a space) : ");
        String[] memberInput = scanner.nextLine().split(" "); // Membaca input dan membaginya menjadi array string

        // Memeriksa apakah jumlah input anggota keluarga sama dengan jumlah keluarga
        if (memberInput.length != numberOfFamilies) {
            System.out.println("Input must be equal with count of family");
            scanner.close();
            return;
        }

        // Membuat array untuk menyimpan jumlah anggota keluarga
        int[] familyMembers = new int[memberInput.length];
        // Mengonversi input string ke integer dan menyimpannya dalam array
        for (int i = 0; i < memberInput.length; i++) {
            familyMembers[i] = Integer.parseInt(memberInput[i]);
        }

        // Menghitung total jumlah anggota keluarga
        int totalMembers = 0;
        for (int members : familyMembers) {
            totalMembers += members; // Menjumlahkan anggota keluarga
        }

        // Menghitung jumlah minimum bus yang diperlukan
        int minBus = (int) Math.ceil((double) totalMembers / 4); // Membulatkan ke atas hasil pembagian totalMembers dengan 4

        System.out.println("Minimum bus required is : " + minBus);

        scanner.close();
    }
}
