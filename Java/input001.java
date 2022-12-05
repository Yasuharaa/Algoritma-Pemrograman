package Latihanjava;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class input001 {
    public static void main(String [] args) { 
        BufferedReader datain = new BufferedReader(new InputStreamReader(System.in));
        String nama = "";
        String kelas = "";
        String progdi = "";
        String matkul = "";
        try {
            System.out.print("Ketikan Nama = ");
            nama = datain.readLine();
            System.out.print("Ketikan Kelas = ");
            kelas = datain.readLine();
            System.out.print("Ketikan Progdi = ");
            progdi = datain.readLine();
            System.out.print("Ketikan Mata Kuliah = ");
            matkul = datain.readLine();
        }catch (IOException x) {
            System.out.println("Salah input!!!");
        }
        System.out.println("-------------------------");
        System.out.println("Haiii..." +nama);
        System.out.println("Dari Kelas " +kelas);
        System.out.println("Progdi " +progdi);
        System.out.println("Mata Kuliah " +matkul);
        
    }
    
}
