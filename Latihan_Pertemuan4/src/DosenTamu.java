import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DosenTamu extends Dosen {
    // Atribut
    private String nidk;
    private LocalDate tanggalBerakhirKontrak;

    // Method
    DosenTamu() {
        super();
        nidk = "";
        tanggalBerakhirKontrak = LocalDate.now();
    }

    DosenTamu(String nip, String nidk, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok,
            String fakultas, LocalDate tanggalBerakhirKontrak) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok, fakultas);
        this.nidk = nidk;
        this.tanggalBerakhirKontrak = tanggalBerakhirKontrak;
    }

    public String getNidk() {
        return nidk;
    }

    public LocalDate getTanggalBerakhirKontrak() {
        return tanggalBerakhirKontrak;
    }

    public void setNidk(String nidk) {
        this.nidk = nidk;
    }

    public void setTanggalBerakhirKontrak(LocalDate tanggalBerakhirKontrak) {
        this.tanggalBerakhirKontrak = tanggalBerakhirKontrak;
    }

    public long getSisaMasaKontrakBulan() {
        long selisihBulan = ChronoUnit.MONTHS.between(LocalDate.now(), tanggalBerakhirKontrak);
        return Math.max(0, selisihBulan);
    }

    @Override
    public String getJabatan() {
        return "Dosen Tamu";
    }

    @Override
    public double getTunjangan() {
        return 0.025 * getGajiPokok();
    }

    @Override
    public void printInfo() {
        printBaris("NIP", getNip());
        printBaris("NIDK", nidk);
        printBaris("Nama", getNama());
        printBaris("Tanggal Lahir", formatTanggal(getTanggalLahir()));
        printBaris("TMT", formatTanggal(getTmt()));
        printBaris("Jabatan", getJabatan());
        printBaris("Fakultas", getFakultas());
        printBaris("Masa Kerja", getMasaKerja());
        printBaris("Tanggal Akhir Kontrak", formatTanggal(tanggalBerakhirKontrak));
        printBaris("Sisa Kontrak", getSisaMasaKontrakBulan() + " bulan");
        printBaris("Gaji Pokok", formatRupiah(getGajiPokok()));
        printBaris("Tunjangan", "2,5% x " + formatRupiah(getGajiPokok()) + " = " + formatRupiah(getTunjangan()));
    }
}
