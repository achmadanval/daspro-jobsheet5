import java.util.Scanner;

public class PemilihanBilangan02 { 

    public static void main(String[]argss ){
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan sebuah angka : ");
        int angka = sc.nextInt();

        String hasil;
        hasil = (angka % 2 == 0) ? " termasuk bilangan genap " : " termasuk bilangan ganjil ";
        System.out.println(angka + " adalah " + hasil);

    }
}