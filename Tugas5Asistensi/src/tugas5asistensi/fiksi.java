package tugas5asistensi;

/**
 *
 * @author tsamarahrana
 */
public class fiksi extends buku{
    private String jenisbuku;
    
    public fiksi(){
        super();
        jenisbuku = "fiksi";
    }
    
    public fiksi(String jenisbuku, String judul, String pengarang, String jenis, int halaman){
        super(judul,pengarang,jenis,halaman);
        this.jenisbuku=this.jenisbuku;
    }

    public String getJenisbuku() {
        return jenisbuku;
    }

    public void setJenis(String fiksi) {
        this.jenisbuku = jenisbuku;
    }
    
}
