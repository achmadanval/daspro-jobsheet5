import java.io.NotSerializableException;
import java.util.Scanner;

public class SIAKAD02 {
   public SIAKAD02() {
   }

   public static void main(String[] argss ) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Masukkan nama           : ");
      String nama = sc.nextLine();
      System.out.print("Masukkan NIM            : ");
      String NIM = sc.nextLine();
      System.err.print("Masukkan kelas          : ");
      char kelas = sc.nextLine().charAt(0);
      System.out.print("Masukkan nomor absen    :");
      byte absen = sc.nextByte();
      System.out.print("Masukkan nilai kuis     : ");
      int kuis = sc.nextInt();
      System.out.print("Masukkan nilai tugas    : ");
      int tugas = sc.nextInt();
      System.out.print("Masukkan nilai UTS      :");
      int uts = sc.nextInt();
      System.out.print("Masukkan nilai UAS      :");
      int uas = sc.nextInt();
      System.out.print("Memasukkan nilaiAkhir   : ");
      double nilaiAkhir = tugas / 100.0 * 20.0 + kuis / 100.0 * 15.0 + uts / 100.0 * 30.0 + uas / 100.0 * 35.0;
      System.out.println("Nama          : " + nama);
      System.out.println("NIM           : " + NIM );
      System.out.println("Kelas         : " + kelas);
      System.out.println("No Absen      : " + absen);
      System.out.println("Nilai UTS     : " + uts );
      System.out.println("Nilai UAS     : " + uas);
      System.out.println("Nilai Akhir   : " + nilaiAkhir);

      if (nilaiAkhir >= 80 && nilaiAkhir <=100 ) {
            System.out.println("Nilai Akhir : A");
            System.out.println("Kualifikasi : Sangat Baik");
      }
      else if (nilaiAkhir >= 73 && nilaiAkhir <= 80) {
            System.out.println("Nilai Akhir  : B+");
            System.out.println("Kualifikasi  : Lebih dari Baik");
      }
      else if (nilaiAkhir >= 65 && nilaiAkhir <= 73) {
            System.out.println("Nilai Akhir  : B");
            System.err.println("Kualifikasi  : Baik");
      }
      else if (nilaiAkhir >= 60 && nilaiAkhir <= 65) {
            System.out.println("Nilai Akhir  : C+");
            System.out.println("Kualifikasi  : Lebih dari Cukup");
      }
      else if (nilaiAkhir >= 50 && nilaiAkhir <= 60) {
            System.out.println("Nilai Akhir  : C");
            System.out.println("Kualifikasi  :Cukup");
      }
      else if (nilaiAkhir >= 39 && nilaiAkhir <=50) {
            System.out.println("Nilai Akhir  : D");
            System.out.println("Kualifikasi  :Kurang");
      }
      else{
            System.out.println("Nilai Akhir  :E");
            System.out.println("Kualifikasi  :Gagal");
      }
   }
}
