package Latihanjava;
import java.util.Scanner;
public class scanner001 {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        String nama, kelas, progdi, matkul;
        
        System.out.print("Ketikan Nama = ");
        nama = input.nextLine();
        System.out.print("Ketikan Kelas = ");
        kelas = input.nextLine();
        System.out.print("Ketikan Progdi = ");
        progdi = input.nextLine();
        System.out.print("Ketikan Mata Kuliah = ");
        matkul = input.nextLine();
        
        System.out.println("-------------------------");
        System.out.println("Haiii..." +nama);
        System.out.println("Dari Kelas " +kelas);
        System.out.println("Progdi " +progdi);
        System.out.println("Mata Kuliah " +matkul);
    }
}
