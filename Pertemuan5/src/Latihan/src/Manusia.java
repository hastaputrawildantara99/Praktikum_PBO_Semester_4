// Nama File : Manusia.java
// Deskripsi : Kelas abstrak Manusia sebagai induk dari PNS, Pengusaha, dan Petani
// Pembuat : Hasta Putra Wildantara - 24060124130119
// Tanggal : 17 Maret 2026

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public abstract class Manusia {
    protected String nama;
    protected LocalDate tglMulaiKerja;
    protected String alamat;
    protected double pendapatan;
    protected static int counterMns = 0;

    public Manusia(String nama, LocalDate tglMulaiKerja, String alamat, double pendapatan) {
        this.nama = nama;
        this.tglMulaiKerja = tglMulaiKerja;
        this.alamat = alamat;
        this.pendapatan = pendapatan;
        counterMns++;
    }

    public Manusia(String nama, LocalDate tglMulaiKerja, double pendapatan) {
        this(nama, tglMulaiKerja, "-", pendapatan);
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public LocalDate getTglMulaiKerja() {
        return tglMulaiKerja;
    }

    public void setTglMulaiKerja(LocalDate tglMulaiKerja) {
        this.tglMulaiKerja = tglMulaiKerja;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public double getPendapatan() {
        return pendapatan;
    }

    public void setPendapatan(double pendapatan) {
        this.pendapatan = pendapatan;
    }

    public static int getCounterMns() {
        return counterMns;
    }

    protected int selisihTahunKerja() {
        return Period.between(tglMulaiKerja, LocalDate.now()).getYears();
    }

    public void cetakInfo() {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println("Nama            : " + nama);
        System.out.println("Tgl Mulai Kerja : " + tglMulaiKerja.format(fmt));
        System.out.println("Alamat          : " + alamat);
        System.out.println("Pendapatan      : " + pendapatan);
    }

    public abstract int hitungMasaKerja();
}
