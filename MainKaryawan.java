
import java.util.Scanner;

public class MainKaryawan {
    
    public static void main(String[] args) {
        int gapok, gol, hrlembur, glembur, totalgaji;
        String nama, nik;
        Scanner sc = new Scanner(System.in);
        MainKaryawan k = new MainKaryawan();
        
        System.out.print("Masuka Nama :");
        nama = sc.next();
        System.out.print("Masukan Nik :");
        nik = sc.next();
        System.out.print("Masukan Gol :");
        gol = sc.nextInt();
        System.out.print("Banyak Hari Lembur :");
        hrlembur = sc.nextInt();
        gapok = k.pilihGolongan(gol);
        glembur= k.hitLembur(hrlembur);
        totalgaji = k.totalGaji(gapok,glembur);
        Pembukaan c = new Pembukaan();
        KaryawanXyz p = new KaryawanXyz(nama, nik, gapok, gol, hrlembur, glembur, totalgaji);
        
        p.tampil();
    }
    
    private int pilihGolongan(int gol){
        int gapok;
        if (gol == 1){
            gapok = 10000;
        }else if(gol == 2){
            gapok = 13000;
        } else if (gol == 3){
            gapok = 15000;
        }else{
            gapok = 8000;
        }
        return gapok;
    }
    
     int hitLembur(int hrlembur){
        int glembur;
        return glembur= hrlembur * 20;
    }
     
    int totalGaji(int gapok, int glembur){
        return gapok + glembur;
    }
}

