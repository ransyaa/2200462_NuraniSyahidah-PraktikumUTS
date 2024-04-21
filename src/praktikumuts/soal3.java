/*
Nurani Syahidah - 2200462

3.(Integer Palindrome) Tulis metode dengan header berikut
// Return the reversal of an integer, i.e., reverse(456) returns 654
public static int reverse(int number)
// Return true if number is a palindrome
public static boolean isPalindrome(int number)
Gunakan metode reverse untuk mengimplementasikan isPalindrome. Suatu bilangan 
disebut palindrom jika pembalikannya sama dengan bilangan itu sendiri. Tulis 
program pengujian yang meminta pengguna untuk memasukkan bilangan bulat dan 
melaporkan apakah bilangan bulat tersebut adalah palindrom.
*/
package praktikumuts;

import java.util.Scanner;

public class soal3 {

    // Method untuk membalikkan angka
    public static int reverse(int number) {
        int reversedNumber = 0;
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }
        return reversedNumber;
    }

    // Method untuk mengecek apakah suatu bilangan adalah palindrom atau tidak
    public static boolean isPalindrome(int number) {
        return number == reverse(number);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan bilangan bulat: ");
        int number = scanner.nextInt();

        if (isPalindrome(number)) {
            System.out.println(number + " adalah palindrom.");
        } else {
            System.out.println(number + " bukan palindrom.");
        }
    }
}
