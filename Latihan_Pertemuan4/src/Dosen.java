import java.time.LocalDate;

public abstract class Dosen extends Pegawai {
    // Atribut
    private String fakultas;

    // Method
    Dosen() {
        super();
        fakultas = "";
    }

    Dosen(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok, String fakultas) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok);
        this.fakultas = fakultas;
    }

    public String getFakultas() {
        return fakultas;
    }

    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }
}
