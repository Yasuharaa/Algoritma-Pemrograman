package Latihanjava;
import java.util.Scanner;
public class mie {
    public static void main(String [] args) { 
        Scanner input = new Scanner(System.in);
        String produk = "";
        int harga, jumlah;
        double total, potongan, bayar;
        
        System.out.print("Masukan Jenis Mie : ");
        produk = input.nextLine();
        System.out.print("Masukan Harga per Pack : ");
        harga = input.nextInt();
        System.out.print("Masukan Jumlah Pack : ");
        jumlah = input.nextInt();
        
        System.out.println("------------------------------");
        System.out.println(produk);
        total = harga*jumlah;
        System.out.println("Total Rp."+total);
        if(total >=250000) {
            potongan = 0.1*total;
            System.out.println("Potongan Rp."+potongan);
            bayar = total-potongan;
            System.out.println("Total Bayar Rp."+bayar);
            
        }else if(total >=150000){
            potongan = 0.05*total;
            System.out.println("Potongan Rp."+potongan);
            bayar = total-potongan;
            System.out.println("Total Bayar Rp."+bayar);
        }else if(total >=100000){
            potongan = 0.02*total;
            System.out.println("Potongan Rp."+potongan);
            bayar = total-potongan;
            System.out.println("Total Bayar Rp."+bayar);
        }else{
            potongan = 0;
            System.out.println("Potongan Rp."+potongan);
            bayar = total-potongan;
            System.out.println("Total Bayar Rp."+bayar);
        }
        
        if("SARIMI".equals(produk)) {
            System.out.println("Hadiah : Gantungan Kunci");
        }else if ("INDOMIE".equals(produk)) {
            System.out.println("Hadiah : Note Book Kecil");
        }else {
            System.out.println("Hadiah : - ");
        }
        System.out.println("------------------------------");
    }
}
