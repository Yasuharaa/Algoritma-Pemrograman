package Latihanjava;
import java.util.Scanner;
public class per003 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("");
        
        System.out.print("Input Nilai Awal (kecil)  : ");
        int a = in.nextInt();
        System.out.print("Input Nilai Akhir (besar) : ");
        int b = in.nextInt();
        
        int awal=a;
        int cetak=a;
        for (int i = a; i <= b; i++) {
            
            for(int x = b; x >= awal; x--){
                
                System.out.print("  ");
            }
            
            for (int y = a; y <= awal; y++) {
                
                System.out.print(cetak+" ");
            }
            
            cetak++;
            awal++;
            System.out.println("");
        }
    }
}