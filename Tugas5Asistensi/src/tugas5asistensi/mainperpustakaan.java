package tugas5asistensi;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.Scanner;

public class mainperpustakaan {
    public static void main(String[] args) {
        buku[]perpustakaan = new buku[1000];
       
        int n=3; //jumlah buku
        for(int i=0; i<=perpustakaan.length ; i++){
            n = perpustakaan.length;
        }
        int f = 0; //misal jumlah fiksi
        int halamanf =0;
        for(int c=0; c<n; c++)
            if(perpustakaan[c].getJenis()=="fiksi"){
                f++;
            }
            int nf= n-f;
            int halamannf=0;
        
    
        int jumlahHalaman =0; //menyatakan jumlah halaman
        for(int i=0; i<perpustakaan.length ; i++){
        jumlahHalaman += perpustakaan[i].getHalaman();
    }
        
        double rataHalaman = jumlahHalaman/perpustakaan.length;
        
        double jumlahakar =0;
        for(int i=0; i<perpustakaan.length; i++){
            jumlahakar += Math.pow((perpustakaan[i].getHalaman() -rataHalaman),2);
        }
        double sd = Math.sqrt(jumlahakar)/(perpustakaan.length);
        
        double rataf = halamanf/f;
        double sdf = 0;
         for(int i =0; i<n; i++){
             if(perpustakaan[i].getJenis()=="fiksi"){
                 sdf = Math.pow((perpustakaan[i].getHalaman() - rataf), 2);
             }
         }
         
         double ratanf = halamannf/nf;
         double sdnf = 0;
         for(int i=0; i<n ; i++){
             if(perpustakaan[i].getJenis()=="nonfiksi"){
                 sdnf = Math.pow((perpustakaan[i].getHalaman() - ratanf),2);
             }
         }
         
        Random rand = new Random();
        for (int i=0; i<2 ; i++){
            int coinflip = rand.nextInt(2)+1;
            if(coinflip == 1){
                perpustakaan[i] = new fiksi();
            }
           if(coinflip ==2){
                perpustakaan[i] = new nonfiksi();
            }
         for (int j = 0; j < 3; j++) {
            int coinflip2 = rand.nextInt(2) + 1;
            if (coinflip2 == 1) {
                perpustakaan[i] = new buku("Introduction to Java", "Y. Daniel Liang", "nonfiksi", 123);
                f += 1;
                halamanf += 123;
            }
            if (coinflip == 2) {
                perpustakaan[i] = new buku("Eleanor and Park", "RainbownRowell", "nonfiksi", 321);
                nf += 1;
                halamannf += 321;
            }
        }
        garis();
        header("PERPUSTAKAAN.txt");
        garis();
        System.out.println("[1]. input buku baru " + "\n[2]. modifikasi detail buku " + "\n[3]. hapus buku " + "\n[0]. EXIT");  
        
                    
        garis();
        System.out.println("Jumlah buku dalam perpustakaan : "+ n);
        System.out.println("Rata-rata halaman buku dalam perpustakaan : " +jumlahHalaman);
        System.out.println("standar deviasi halaman buku dalam perpustakaan : " + sd);
        
        garis();
        System.out.println("Jumlah buku fiksi dalam perpustakaan : " + f);
        System.out.println("Rata-rata halaman buku fiksi dalam perpustakaan : " + halamanf);
        System.out.println("standar deviasi halaman buku fiksi dalam perpustakaan : " + sdf);
        
        garis();
        System.out.println("Jumlah buku non-fiksi dalam perpustakaan : " + nf);
        System.out.println("Rata-rata halaman buku non-fiksi dalam perpustakaan : " + halamannf);
        System.out.println("standar deviasi halaman buku non-fiksi dalam perpustakaan : " + sdnf);
        System.out.println("====================================================");
                 
        Scanner input = new Scanner(System.in);
        int pilihan;
        pilihan = input.nextInt();
        
        switch(pilihan){
            case 1:
                garis();
                header("BUKUBARU.txt");
                garis();
                perpustakaan[n].judul = input.nextLine();
                System.out.println("input pengarang buku : ");
                perpustakaan[n].pengarang = input.nextLine();
                System.out.println("input halaman buku : ");
                perpustakaan[n].halaman = input.nextInt();
                break;
            case 2:
                garis();
                header("UBAHBUKU.txt");
                garis();
                System.out.println("Pilih buku yang akan diubah :");
                System.out.println("[1]."+perpustakaan[0] + "\n[2]."+perpustakaan[1] + "\n[3]." +perpustakaan[2]);
                for(int a=0; a<n; a++){
                System.out.println(perpustakaan[a].getJudul()+perpustakaan[a].getPengarang());
                }
                int x = input.nextInt(); 
                perpustakaan[x-1].judul = input.nextLine();
                perpustakaan[x-1].pengarang= input.nextLine();
                perpustakaan[x-1].halaman = input.nextInt();
                break;
            case 3:
                garis();
                header("HAPUSBUKU.txt");
                garis();
                System.out.println("Pilih buku yang akan dihapus :");
                System.out.println("[1]."+perpustakaan[0] + "\n[2]."+perpustakaan[1] + "\n[3]." +perpustakaan[2]);
                int y = input.nextInt();
                for(int b =y; b<n; b++){
                perpustakaan[y-1].setJudul(perpustakaan[y].getJudul());
                perpustakaan[y-1].setPengarang(perpustakaan[y].getJudul());
                perpustakaan[y-1].setHalaman((int) perpustakaan[y].getHalaman());
                break;     
          }
        }  
      }    
     }
    
    public static void header(String PERPUSTAKAAN) {
        File file = new File(PERPUSTAKAAN);
        String encoding = "utf-8";
        try (InputStreamReader isr = new InputStreamReader(new FileInputStream(file), encoding)) {
            int data = isr.read();
            while (data != -1) {
                System.out.print((char) data);
                data = isr.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static void garis(){
        System.out.println("---------------------------------------------------------------------------------------------");
    }
    }

