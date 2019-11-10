package tugas5asistensi;

public class buku extends perpustakaan{
    String judul, pengarang,jenis;
    double halaman;

    public buku(){
        judul ="kosong";
        pengarang = "kosong";
        jenis = "kosong";
        halaman = 0;
    }
    
    public buku(String judul, String pengarang, String jenis, int halaman ){
        this.judul=judul;
        this.pengarang=pengarang;
        this.jenis=jenis;
        this.halaman=halaman;
    }
    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
       this.judul=judul;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
       this.jenis=jenis;
    }

    public String getPengarang() {
        return pengarang;
    }

    public void setPengarang(String pengarang) {
        this.pengarang=pengarang;
            }

    public double getHalaman() {
        return halaman;
    }

    public void setHalaman(int halaman) {
         this.halaman=halaman;
    }
}
