package Latihanjava;
import java.util.Scanner;
public class per002 {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        
        //var
        int awal, akhir, i, j;
        String ulang = "y";
        
        while(ulang.equals("y") || ulang.equals("Y")){           
        System.out.print("Masukan Nilai Awal  : ");
        awal = input.nextInt();
        System.out.print("Masukan Nilai Akhir : ");
        akhir = input.nextInt();
            
        for(i=awal; i<=akhir; i++){
            for(j=awal; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }    

            
        System.out.print("Masukkan lagi? [Y/N] : ");
        ulang = input.next();
        System.out.println("");
        }        
    }
}
