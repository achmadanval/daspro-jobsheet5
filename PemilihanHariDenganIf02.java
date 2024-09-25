import java.util.Scanner;

public class PemilihanHariDenganIf02 {

    public static void main (String[]argss ){

        int hari;

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan bilangan bulat :  ");
        hari = sc.nextInt();

        if (hari >= 1 && hari <= 5){
           System.out.println("Weekday");
        }
        else if (hari == 6 || hari == 7) {
            System.out.println("Weekend");
        }
        else{
            System.out.println("Invalid Number");
        }

    }
}
