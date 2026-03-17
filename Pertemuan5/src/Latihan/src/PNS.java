// Nama File : PNS.java
// Deskripsi : Kelas PNS turunan Manusia yang mengimplementasi Pajak
// Pembuat : Hasta Putra Wildantara - 24060124130119
// Tanggal : 17 Maret 2026

import java.time.LocalDate;

public class PNS extends Manusia implements Pajak {
    private String nip;
    private static int counterPNS = 0;
    private static final int A = 9;

    public PNS(String nama, LocalDate tglMulaiKerja, String alamat, double pendapatan, String nip) {
        super(nama, tglMulaiKerja, alamat, pendapatan);
        this.nip = nip;
        counterPNS++;
    }

    public PNS(String nama, LocalDate tglMulaiKerja, double pendapatan, String nip) {
        super(nama, tglMulaiKerja, pendapatan);
        this.nip = nip;
        counterPNS++;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public static int getCounterPNS() {
        return counterPNS;
    }

    @Override
    public int hitungMasaKerja() {
        return selisihTahunKerja() + A;
    }

    @Override
    public double hitungPajak() {
        return 0.10 * pendapatan;
    }

    @Override
    public void cetakInfo() {
        System.out.println("=== PNS ===");
        super.cetakInfo();
        System.out.println("NIP             : " + nip);
        System.out.println("Pajak           : " + hitungPajak());
        System.out.println("Masa Kerja      : " + hitungMasaKerja());
        System.out.println();
    }
}
