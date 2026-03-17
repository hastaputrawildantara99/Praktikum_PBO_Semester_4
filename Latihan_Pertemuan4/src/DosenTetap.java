import java.time.LocalDate;

public class DosenTetap extends Dosen {
    // Atribut
    private String nidn;
    private static final int BUP = 65;

    // Method
    DosenTetap() {
        super();
        nidn = "";
    }

    DosenTetap(String nip, String nidn, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok,
            String fakultas) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok, fakultas);
        this.nidn = nidn;
    }

    public String getNidn() {
        return nidn;
    }

    public void setNidn(String nidn) {
        this.nidn = nidn;
    }

    public LocalDate getTanggalPensiun() {
        return super.getTanggalPensiun(BUP);
    }

    @Override
    public String getJabatan() {
        return "Dosen Tetap";
    }

    @Override
    public double getTunjangan() {
        return 0.02 * getMasaKerjaTahun() * getGajiPokok();
    }

    @Override
    public void printInfo() {
        printBaris("NIP", getNip());
        printBaris("NIDN", nidn);
        printBaris("Nama", getNama());
        printBaris("Tanggal Lahir", formatTanggal(getTanggalLahir()));
        printBaris("TMT", formatTanggal(getTmt()));
        printBaris("Jabatan", getJabatan());
        printBaris("Fakultas", getFakultas());
        printBaris("Masa Kerja", getMasaKerja());
        printBaris("Tanggal Pensiun", formatTanggal(getTanggalPensiun()));
        printBaris("Gaji Pokok", formatRupiah(getGajiPokok()));
        printBaris(
                "Tunjangan",
                "2% x " + getMasaKerjaTahun() + " x "
                        + formatRupiah(getGajiPokok()) + " = " + formatRupiah(getTunjangan()));
    }
}
