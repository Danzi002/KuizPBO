
public class KaryawanXyz {
    int gapok, gol, jkerja, hrlembur, glembur,totalgaji;
    String nama, nik;
    
    public KaryawanXyz(String nama, String nik, 
                       int gapok, int gol, int hrlembur,
                       int glembur, int totalgaji){
        this.nama = nama;
        this.nik = nik;
        this.gol = gol;
        this.gapok = gapok;
        this.hrlembur = hrlembur;
        this.glembur = glembur;
        this.totalgaji = totalgaji;
    }
     
    
   void tampil(){
       System.out.println("Nama : "+ this.nama);
       System.out.println("Nik : "+ this.nik);
       System.out.println("Golongan :"+ this.gol);
       System.out.println("Gaji Pokok : "+ this.gapok);
       System.out.println("Gaji Lembur : "+ this.glembur);
       System.out.println("Total Gaji : "+ this.totalgaji);
   }
}

