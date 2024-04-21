/*
Nurani Syahidah - 2200462
2. Gunakan loop bersarang yang menampilkan pola (patterns)  dalam empat program 
terpisah.
*/
package praktikumuts;

import java.util.Scanner;

public class soal2 {

    public static void printPatternA(int baris) {
        for (int i = 1; i <= baris; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void printPatternB(int rows) {
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void printPatternC(int baris) {
        for (int i = 1; i <= baris; i++) {
            for (int j = baris; j > i; j--) {
                System.out.print("  ");
            }
            for (int k = i; k >= 1; k--) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }

    public static void printPatternD(int baris) {
        for (int i = baris; i >= 1; i--) {
            for (int j = baris; j > i; j--) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Jenis pattern (A, B, C, D) : ");
        char patternType = scanner.next().charAt(0);

        System.out.print("Masukkan jumlah baris: ");
        int baris = scanner.nextInt();

        switch (patternType) {
            case 'A':
                printPatternA(baris);
                break;
            case 'B':
                printPatternB(baris);
                break;
            case 'C':
                printPatternC(baris);
                break;
            case 'D':
                printPatternD(baris);
                break;
            default:
                System.out.println("Pilihan pattern tidak valid.");
        }
    }
}
