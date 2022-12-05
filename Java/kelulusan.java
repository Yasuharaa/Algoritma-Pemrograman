package Latihanjava;
import java.util.Scanner;
public class kelulusan {
    public static void main(String [] args) { 
        //variable scanner
        Scanner input = new Scanner(System.in);
        //variable nilai
        int nilai;
        //input
        System.out.print("Masukan Nilaimu : ");
        nilai = input.nextInt();
        //pilihan dan output
        if (nilai >=70) {
            System.out.println("Selamat Anda dinyatakan Lulus");
        }else if (nilai >=60) {
            System.out.println("Anda harus Mengulang");
        }else {
            System.out.println("Anda dinyatakan Tidak Lulus");
        }
        
    }
}
