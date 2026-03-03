import java.util.ArrayList;

public class Dosen {
    // Atribut
    private String nip;
    private String nama;
    private String Prodi;

    // Method
    Dosen(){
        nip = " ";
        nama = " ";
        Prodi = " ";
    }

    Dosen(String nip, String nama, String Prodi){
        this.nip = nip;
        this.nama = nama;
        this.Prodi = Prodi;
    }

    public String getNip() {
        return nip;
    }

    public String getNama(){
        return nama;
    }

    public String getProdi(){
        return Prodi;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setProdi(String Prodi) {
        this.Prodi = Prodi;
    }
}

