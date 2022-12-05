package Latihanjava;
public class var002 {
    public static void main(String[] args) { 
        //var
        String nama, kelas, progdi;
        int umur, thnlhr, thnskrg;
        double tinggi;  
        
        //input data
        nama = "Arief Rahman Andhika";
        kelas = "1P52";
        progdi = "Sistem Informasi";
        umur = 18;
        tinggi = 170.5;
        thnskrg = 2022;
        thnlhr = thnskrg - umur;
        
        //output
        System.out.println("Nama   : " + nama);
        System.out.println("Kelas  : " + kelas);
        System.out.println("Progdi : " + progdi );
        System.out.println("Umur   : " + umur);
        System.out.println("Tinggi : " + tinggi + "cm");
        System.out.println("Umur Anda Sekarang " + umur + " berarti anda lahir tahun " + thnlhr); 
    }
}