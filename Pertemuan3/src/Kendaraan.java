public class Kendaraan {
    // Atribut
    private String noPlat;
    private String jenis;

    // Method
    Kendaraan(){
        noPlat = " ";
        jenis = " ";
    }

    Kendaraan(String noPlat, String jenis){
        this.noPlat = noPlat;
        this.jenis = jenis;
    }

    public String getNoPlat() {
        return noPlat;
    }

    public String getJenis() {
        return jenis;
    }

    public void setNoPlat(String noPlat) {
        this.noPlat = noPlat;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }
}
