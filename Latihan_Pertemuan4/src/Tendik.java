import java.time.LocalDate;

public class Tendik extends Pegawai {
    // Atribut
    private String bidang;
    private static final int BUP = 55;

    // Method
    Tendik() {
        super();
        bidang = "";
    }

    Tendik(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok, String bidang) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok);
        this.bidang = bidang;
    }

    public String getBidang() {
        return bidang;
    }

    public void setBidang(String bidang) {
        this.bidang = bidang;
    }

    public LocalDate getTanggalPensiun() {
        return super.getTanggalPensiun(BUP);
    }

    @Override
    public String getJabatan() {
        return "Tenaga Kependidikan";
    }

    @Override
    public double getTunjangan() {
        return 0.01 * getMasaKerjaTahun() * getGajiPokok();
    }

    @Override
    public void printInfo() {
        printBaris("NIP", getNip());
        printBaris("Nama", getNama());
        printBaris("Tanggal Lahir", formatTanggal(getTanggalLahir()));
        printBaris("TMT", formatTanggal(getTmt()));
        printBaris("Jabatan", getJabatan());
        printBaris("Bidang", bidang);
        printBaris("Masa Kerja", getMasaKerja());
        printBaris("Tanggal Pensiun", formatTanggal(getTanggalPensiun()));
        printBaris("Gaji Pokok", formatRupiah(getGajiPokok()));
        printBaris(
                "Tunjangan",
                "1% x " + getMasaKerjaTahun() + " x "
                        + formatRupiah(getGajiPokok()) + " = " + formatRupiah(getTunjangan()));
    }
}
