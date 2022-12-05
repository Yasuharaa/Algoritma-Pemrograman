package Latihanjava;
import java.util.Scanner;
public class progdi001 {
    public static void main(String [] args) { 
        //variable scanner
        Scanner input = new Scanner(System.in);
        //variable nilai
        String progdi;
        //input
        System.out.print("Masukan Kode Progdi : ");
        progdi = input.nextLine();
        if ("TI".equals(progdi)) {
            System.out.println("Teknik Informatika");
        }else if ("SI".equals(progdi)) {
            System.out.println("Sistem Informasi");
        }else {
            System.out.println("Salah memasukan kode progdi");
        }
        
    
        
    }
}
