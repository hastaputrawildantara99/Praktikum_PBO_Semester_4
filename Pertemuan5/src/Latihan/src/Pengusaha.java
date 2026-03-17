// Nama File : Pengusaha.java
// Deskripsi : Kelas Pengusaha turunan Manusia yang mengimplementasi Pajak
// Pembuat : Hasta Putra Wildantara - 24060124130119
// Tanggal : 17 Maret 2026

import java.time.LocalDate;

public class Pengusaha extends Manusia implements Pajak {
    private String npwp;
    private static int counterPengusaha = 0;
    private static final int B = 1;

    public Pengusaha(String nama, LocalDate tglMulaiKerja, String alamat, double pendapatan, String npwp) {
        super(nama, tglMulaiKerja, alamat, pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }

    public String getNpwp() {
        return npwp;
    }

    public void setNpwp(String npwp) {
        this.npwp = npwp;
    }

    public static int getCounterPengusaha() {
        return counterPengusaha;
    }

    @Override
    public int hitungMasaKerja() {
        return selisihTahunKerja() + B;
    }

    @Override
    public double hitungPajak() {
        return 0.15 * pendapatan;
    }

    @Override
    public void cetakInfo() {
        System.out.println("=== Pengusaha ===");
        super.cetakInfo();
        System.out.println("NPWP            : " + npwp);
        System.out.println("Pajak           : " + hitungPajak());
        System.out.println("Masa Kerja      : " + hitungMasaKerja());
        System.out.println();
    }
}
