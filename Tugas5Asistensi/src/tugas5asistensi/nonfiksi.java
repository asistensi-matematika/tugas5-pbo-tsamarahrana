package tugas5asistensi;

/**
 *
 * @author tsamarahrana
 */
public class nonfiksi extends buku{
    private String jenisbuku;

    public nonfiksi(){
        super();
        jenisbuku = "fiksi";
    }
    
    public nonfiksi(String jenisbuku, String judul, String pengarang, String jenis, int halaman){
        super(judul,pengarang,jenis,halaman);
        this.jenisbuku=this.jenisbuku;
    }
    public String getJenisbuku() {
        return jenisbuku;
    }

    public void setJenisbuku(String jenisbuku) {
        this.jenisbuku = jenisbuku;
    }
    
}
