// Nama File : BangunDatar.java
// Deskripsi : Kelas Bangun Datar
// Pembuat : Hasta Putra Wildantara - 24060124130119
// Tanggal : 17 Maret 2026

public abstract class BangunDatar {
    // Atribut
    protected int jmlhSisi;
    protected String warna;
    protected String border;
    private static int counterBangunDatar = 0;

    // Method
    public BangunDatar() {
        counterBangunDatar++;
    }

    public BangunDatar(int jmlhSisi, String warna, String border) {
        this.jmlhSisi = jmlhSisi;
        this.warna = warna;
        this.border = border;
        counterBangunDatar++;
    }

    public static void printCounterBangunDatar() {
        System.out.println("Jumlah Bangun Datar yang dibuat: " + counterBangunDatar);
    }

    public int getJmlhSisi() {
        return jmlhSisi;
    }

    public void setJmlhSisi(int jmlhSisi) {
        this.jmlhSisi = jmlhSisi;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getBorder() {
        return border;
    }

    public void setBorder(String border) {
        this.border = border;
    }

    public void printInfo() {
        System.out.println("Jumlah Sisi: " + jmlhSisi);
        System.out.println("Warna: " + warna);
        System.out.println("Border: " + border);
    }

    public abstract double getLuas();

    public abstract double getKeliling();

    public boolean isEqualLuas(BangunDatar X){
        return this.getLuas() == X.getLuas();
    }

    public boolean isEqualKeliling(BangunDatar X){
        return this.getKeliling() == X.getKeliling();
    }
}
