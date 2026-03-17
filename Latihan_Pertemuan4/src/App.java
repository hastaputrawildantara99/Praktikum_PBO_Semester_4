import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        DosenTetap dosenTetap = new DosenTetap(
                "9545647548",
                "78647324",
                "Andi",
                LocalDate.of(1990, 5, 5),
                LocalDate.of(2015, 1, 1),
                5000000,
                "Fakultas Sains dan Matematika");

        DosenTamu dosenTamu = new DosenTamu(
                "197812202010122001",
                "88890123",
                "Rina",
                LocalDate.of(1985, 12, 20),
                LocalDate.of(2022, 2, 1),
                6500000,
                "Fakultas Teknik",
                LocalDate.of(2027, 12, 31));

        Tendik tendik = new Tendik(
                "198807152012041002",
                "Budi",
                LocalDate.of(1988, 7, 15),
                LocalDate.of(2012, 4, 1),
                4200000,
                "Akademik");

        System.out.println("=== Informasi Dosen Tetap ===");
        dosenTetap.printInfo();
        System.out.println();

        System.out.println("=== Informasi Dosen Tamu ===");
        dosenTamu.printInfo();
        System.out.println();

        System.out.println("=== Informasi Tendik ===");
        tendik.printInfo();
    }
}
