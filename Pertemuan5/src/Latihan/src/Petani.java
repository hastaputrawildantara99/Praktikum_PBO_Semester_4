// Nama File : Petani.java
// Deskripsi : Kelas Petani turunan Manusia yang mengimplementasi Pajak
// Pembuat : Hasta Putra Wildantara - 24060124130119
// Tanggal : 17 Maret 2026

import java.time.LocalDate;

public class Petani extends Manusia implements Pajak {
    private String asalKota;
    private static int counterPetani = 0;
    private static final int C = 1;

    public Petani(String nama, LocalDate tglMulaiKerja, String alamat, double pendapatan, String asalKota) {
        super(nama, tglMulaiKerja, alamat, pendapatan);
        this.asalKota = asalKota;
        counterPetani++;
    }

    public String getAsalKota() {
        return asalKota;
    }

    public void setAsalKota(String asalKota) {
        this.asalKota = asalKota;
    }

    public static int getCounterPetani() {
        return counterPetani;
    }

    @Override
    public int hitungMasaKerja() {
        return selisihTahunKerja() + C;
    }

    @Override
    public double hitungPajak() {
        return 0;
    }

    @Override
    public void cetakInfo() {
        System.out.println("=== Petani ===");
        super.cetakInfo();
        System.out.println("Asal Kota       : " + asalKota);
        System.out.println("Pajak           : " + hitungPajak());
        System.out.println("Masa Kerja      : " + hitungMasaKerja());
        System.out.println();
    }
}
