/*
Nurani Syahidah - 2200462
1. Tulis sebuah program yang meminta pengguna untuk memasukkan bilangan bulat 
tiga digit dan menentukan apakah itu bilangan palindrom. Suatu bilangan disebut 
palindrom jika bacaannya sama dari kanan ke kiri dan dari kiri ke kanan. 
 */
package praktikumuts;

import java.util.Scanner;

public class soal1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //inputan
        System.out.print("Masukkan tiga digit integer: ");
        int number = scanner.nextInt();
        
        //proses pengecekan palindrom
        int first = number;
        int reverse = 0;
        
        while (first != 0){
            int second = first % 10;
            reverse = reverse*10 + second;
            first /= 10;
        }
        
        //proses penentuan untuk output
        if(number == reverse){
            System.out.println(number +" adalah Palindrom");
        }else{
            System.out.println(number +" bukan Palindrom");
        }
        
    }
}
