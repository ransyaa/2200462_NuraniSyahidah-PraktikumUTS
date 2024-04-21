/*
Nurani Syahidah - 2200462
4. Buatlah kelas Balok dan kelas Main untuk testernya sesuai dengan ketentuan 
pada gambar diagram kelas, dengan rumus balok :
1)	Luas balok: L = 2 x [(p x l) + (p x t) + (l x t)]
2)	Keliling balok: K = 4 x (p + l + t)
3)	Volume balok: V = p x l x t
output keluaran diminta :
Balok dengan panjang : 1, lebar : 1 dan tinggi : 1. 
Luasnya : 6 sedangkan kelilingnya : 12 dan volumenya : 1
Balok dengan panjang : 30, lebar : 40 dan tinggi :50.
Luasnya : 9400, sedangkan kelilingnya : 480 dan volumenya : 60000 
Balok dengan panjang : 25, lebar : 35 dan tinggi :45.
Luasnya : 7150, sedangkan kelilingnya : 420 dan volumenya : 39375
*/
package praktikumuts;

public class Balok {
    int panjang;
    int lebar;
    int tinggi;

    Balok() {
        this(1, 1, 1);
    }

    Balok(int panjangBaru, int lebarBaru, int tinggiBaru) {
        panjang = panjangBaru;
        lebar = lebarBaru;
        tinggi = tinggiBaru;
    }

    int getLuas() {
        return 2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi));
    }

    int getKeliling() {
        return 4 * (panjang + lebar + tinggi);
    }

    int getVolume() {
        return panjang * lebar * tinggi;
    }

    void setPanjang(int panjangBaru) {
        panjang = panjangBaru;
    }

    void setLebar(int lebarBaru) {
        lebar = lebarBaru;
    }

    void setTinggi(int tinggiBaru) {
        tinggi = tinggiBaru;
    }

    public static void main(String[] args) {
        Balok balok1 = new Balok();
        System.out.print("Balok dengan panjang: " + balok1.panjang);
        System.out.print(", lebar: " + balok1.lebar);
        System.out.println(" dan tinggi: " + balok1.tinggi);
        System.out.print("Luasnya: " + balok1.getLuas());
        System.out.print(", sedangkan keliling: " + balok1.getKeliling());
        System.out.println(" dan volumenya: " + balok1.getVolume());
        
        System.out.println(" ");
        
        Balok balok2 = new Balok(30, 40, 50);
        System.out.print("Balok dengan panjang: " + balok2.panjang);
        System.out.print(", lebar: " + balok2.lebar);
        System.out.println(" dan tinggi: " + balok2.tinggi);
        System.out.print("Luasnya: " + balok2.getLuas());
        System.out.print(", sedangkan keliling: " + balok2.getKeliling());
        System.out.println(" dan volumenya: " + balok2.getVolume());
        
        System.out.println(" ");
        
        Balok balok3 = new Balok(25, 35, 45);
        System.out.print("Balok dengan panjang: " + balok3.panjang);
        System.out.print(", lebar: " + balok3.lebar);
        System.out.println(" dan tinggi: " + balok3.tinggi);
        System.out.print("Luasnya: " + balok3.getLuas());
        System.out.print(", sedangkan keliling: " + balok3.getKeliling());
        System.out.println(" dan volumenya: " + balok3.getVolume());
        
        System.out.println(" ");
    }
}
