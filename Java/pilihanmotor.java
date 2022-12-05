package Latihanjava;
import java.util.Scanner;
public class pilihanmotor {
    public static void main(String [] args) {
        Scanner motor = new Scanner(System.in);
        String jenis;
        
        System.out.print("Masukan kode jenis motor MA/MN/BB : ");
        jenis = motor.nextLine();
        
        if ("MA".equals(jenis)){
            System.out.println("Motor Matic");
        }else if ("MM".equals(jenis)){
            System.out.println("Motor Manual");
        }else if ("BB".equals(jenis)){
            System.out.println("Motor Bebek");
        }else{
            System.out.println("Salah Input");
        }
      
    }
}
