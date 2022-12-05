package Latihanjava;
import java.util.Scanner;
public class servismotor001 {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        //var
        int motor, tahun, oli, potongan = 0, service, hargaoli, total, totalbayar, bayar, kembalian, totalservice;
        String jenismotor, jenisoli, diskon = "", gratis;
        
        //pilih motor
        System.out.println("Jenis Motor");
        System.out.println("1. Matic");
        System.out.println("2. Bebek");
        System.out.println("3. Manual");
        System.out.print("Pilih Jenis Motor (1-3 :");
        motor = input.nextInt();
        //tahun motor
        System.out.print("Masukan Tahun Motor :");
        tahun = input.nextInt();
        //pilih jenis oli
        System.out.println("Jenis Oli");
        System.out.println("1. Top_1");
        System.out.println("2. Top_2");
        System.out.println("3. Top_3");
        System.out.print("Pilih Jenis Motor (1-3 :");
        oli = input.nextInt();
        //harga service
        if(motor==1){
            jenismotor="Matic";
            service=25000;
            gratis="Gratis Oli Top 1";
        }else if(motor==2){
            jenismotor="Bebek";
            service=20000;
            gratis="-";
        }else if(motor==3){
            jenismotor="Manual";
            service=30000;
            gratis="-";
        }else{
            jenismotor="Tidak ada";
            service=0;
            gratis="-";
        }
        //harga oli
        if(oli==1){
            hargaoli=15000;
            if(motor==1){
                hargaoli=0;
            }
        }else if(oli==2){
            hargaoli=10000;
        }else{
            hargaoli=5000;
        }
        //potongan biaya servis
        if(motor==1 && tahun <2010){
            potongan=service*10/100;
            diskon = "10%";
        }else if(motor==2 && tahun <2010){
            potongan=service*5/100;
            diskon = "5%";
        }else if(motor==3 && tahun <2005){
            potongan=service*5/100;
            diskon = "5%";
        }else{
            potongan=0;
            diskon = "Tidak ada";
        }
        //total
        totalservice=service-potongan;
        totalbayar=totalservice+hargaoli;
        //output
        System.out.println("--------------------------------");
        System.out.println("Jenis Motor : "+jenismotor);
        System.out.println("Tahun Motor : "+tahun);
        System.out.println("Gratis      : "+gratis);
        System.out.println("Potongan    : "+diskon);
        System.out.println("Total Bayar : "+totalbayar);
        System.out.print("Masukan Nominal Bayar : ");
        bayar = input.nextInt();
        kembalian = bayar-totalbayar;
        System.out.println("Uang Kembalian :"+kembalian);
        System.out.println("--------------------------------");        
    }
}
