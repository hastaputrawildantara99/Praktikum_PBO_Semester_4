import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public abstract class Pegawai {
    // Atribut
    private String nip;
    private String nama;
    private LocalDate tanggalLahir;
    private LocalDate tmt;
    private double gajiPokok;
    private static final Locale LOCALE_ID = new Locale("id", "ID");

    // Method
    Pegawai() {
        nip = "";
        nama = "";
        tanggalLahir = LocalDate.now();
        tmt = LocalDate.now();
        gajiPokok = 0;
    }

    Pegawai(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok) {
        this.nip = nip;
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
        this.tmt = tmt;
        this.gajiPokok = gajiPokok;
    }

    public String getNip() {
        return nip;
    }

    public String getNama() {
        return nama;
    }

    public LocalDate getTanggalLahir() {
        return tanggalLahir;
    }

    public LocalDate getTmt() {
        return tmt;
    }

    public double getGajiPokok() {
        return gajiPokok;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setTanggalLahir(LocalDate tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public void setTmt(LocalDate tmt) {
        this.tmt = tmt;
    }

    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    public int getMasaKerjaTahun() {
        Period periodeKerja = Period.between(tmt, LocalDate.now());
        return Math.max(0, periodeKerja.getYears());
    }

    public int getMasaKerjaBulan() {
        Period periodeKerja = Period.between(tmt, LocalDate.now());
        return Math.max(0, periodeKerja.getMonths());
    }

    public String getMasaKerja() {
        return getMasaKerjaTahun() + " tahun " + getMasaKerjaBulan() + " bulan";
    }

    public LocalDate getTanggalPensiun(int bup) {
        LocalDate tanggalBup = tanggalLahir.plusYears(bup);
        return tanggalBup.withDayOfMonth(1).plusMonths(1);
    }

    public String formatTanggal(LocalDate tanggal) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy", LOCALE_ID);
        return tanggal.format(formatter);
    }

    public String formatRupiah(double nominal) {
        DecimalFormatSymbols simbol = new DecimalFormatSymbols(LOCALE_ID);
        simbol.setGroupingSeparator('.');
        simbol.setDecimalSeparator(',');
        DecimalFormat format = new DecimalFormat("#,##0.00", simbol);
        return "Rp " + format.format(nominal);
    }

    protected void printBaris(String label, String value) {
        System.out.printf("%-24s: %s%n", label, value);
    }

    public abstract String getJabatan();
    public abstract double getTunjangan();
    public abstract void printInfo();
}
