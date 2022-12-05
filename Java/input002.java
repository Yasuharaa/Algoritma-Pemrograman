package Latihanjava;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class input002 {
    public static void main(String [] args) {
        //membuat var BufferedReader
        BufferedReader jumlah = new BufferedReader(new InputStreamReader(System.in));
        //membuat var data
        int total, Ang1, Ang2;
       
        try {
            //mengambil data angka dari keyboard
            System.out.print("Angka Pertama = ");
            Ang1 = Integer.parseInt(jumlah.readLine());
            System.out.print("Angka Kedua   = ");
            Ang2 = Integer.parseInt(jumlah.readLine());
            
            total = Ang1+Ang2;
            System.out.println("Hasil Penjumlahan = " +total);
        }catch (IOException x) {
            System.out.print(x);
        }
    }
}
