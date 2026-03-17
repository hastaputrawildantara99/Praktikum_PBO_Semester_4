// Nama File : Lingkaran.java
// Deskripsi : Kelas Lingkaran
// Pembuat : Hasta Putra Wildantara - 24060124130119
// Tanggal : 17 Maret 2026

public class Lingkaran extends BangunDatar implements IResize {
    // Atribut
    private double jari;

    // Method
    public Lingkaran() {
        setJmlhSisi(1);
    }

    public Lingkaran(double diameter, int jmlhSisi, String warna, String border) {
        this.jari = diameter / 2;
        setJmlhSisi(jmlhSisi);
        setWarna(warna);
        setBorder(border);
    }

    public double getJari() {
        return jari;
    }

    public void setJari(double jari) {
        this.jari = jari;
    }

    public double getLuas() {
        return Math.PI * getJari() * getJari();
    }

    public double getKeliling() {
        return 2 * Math.PI * getJari();
    }

    @Override
    public void zoomIn() {
        jari = jari * 1.1;
    }

    @Override
    public void zoomOut() {
        jari = jari * 0.9;
    }

    @Override
    public void zoom(int percent) {
        jari = jari * percent / 100.0;
    }

    @Override
    public void printInfo() {
        System.out.println("Jumlah Sisi: " + getJmlhSisi());
        System.out.println("Warna: " + getWarna());
        System.out.println("Border: " + getBorder());
        // Atau bisa juga dengan memanggil method parent dengan keyword super
        // super.printInfo();
        System.out.println("Jari-jari: " + jari);
    }
}
