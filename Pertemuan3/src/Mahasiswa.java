import java.util.ArrayList;

public class Mahasiswa {
    // Atribut
    private String nim;
    private String nama;
    private String Prodi;
    private ArrayList<MataKuliah> listMatKul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;

    // Method
    Mahasiswa(){
        nim = " ";
        nama = " ";
        Prodi = " ";
        listMatKul = new ArrayList<>();
        dosenWali = new Dosen();
        kendaraan = new Kendaraan();
    }

    Mahasiswa(String nim, String nama, String Prodi){
        this();
        this.nim = nim;
        this.nama = nama;
        this.Prodi = Prodi;
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public String getProdi() {
        return Prodi;
    }

    public ArrayList<MataKuliah> getListMatKul() {
        return listMatKul;
    }

    public Dosen getDosenWali() {
        return dosenWali;
    }

    public Kendaraan getKendaraan() {
        return kendaraan;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setProdi(String Prodi) {
        this.Prodi = Prodi;
    }

    public void setListMatKul(ArrayList<MataKuliah> listMatKul) {
        this.listMatKul = listMatKul;
    }

    public void setDosenWali(Dosen dosenWali) {
        this.dosenWali = dosenWali;
    }

    public void setKendaraan(Kendaraan kendaraan) {
        this.kendaraan = kendaraan;
    }

    public void addMatKul(MataKuliah newMatKul){
        listMatKul.add(newMatKul);
    }

    public int getJumlahSks(){
        int totalSks = 0;
        for(MataKuliah matKul : listMatKul){
            totalSks += matKul.getSks();
        }
        return totalSks;
    }

    public int getJumlahMatKul(){
        return listMatKul.size();
    }

    public void printMhs(){
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + Prodi);
    }

    public void printDetailMhs(){
        System.out.println("Nim: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + Prodi);
        int i;
        for (i=0;i<listMatKul.size();i++){
            System.out.println(listMatKul.get(i).getNamaMatKul());
        }
    }
}
