public class MataKuliah {
    // Attribut
    private String idMatKul;
    private String namaMatKul;
    private int sks;

    // Method
    MataKuliah(){
        idMatKul = " ";
        namaMatKul = " ";
        sks = 0;
        // atau this(0,0,0);
    }

    MataKuliah(String idMatKul, String namaMatKul, int sks){
        this.idMatKul = idMatKul;
        this.namaMatKul = namaMatKul;
        this.sks = sks;
    }

    public String getIdMatKul() {
        return idMatKul;
    }

    public String getNamaMatKul() {
        return namaMatKul;
    }

    public int getSks() {
        return sks;
    }

    public void setIdMatKul(String idMatKul) {
        this.idMatKul = idMatKul;
    }

    public void setNamaMatKul(String namaMatKul) {
        this.namaMatKul = namaMatKul;
    }

    public void setSks(int sks) {
        this.sks = sks;
    }
}
