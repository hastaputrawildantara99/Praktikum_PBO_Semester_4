// Nama File : Main.java
// Deskripsi : Kelas Main
// Pembuat : Hasta Putra Wildantara - 24060124130119
// Tanggal : 17 Maret 2026

public class Main {
    public static void tampilkanInfo(String namaObjek, BangunDatar objek) {
        System.out.println("== " + namaObjek + " ==");
        objek.printInfo();
        System.out.println("Luas: " + objek.getLuas());
        System.out.println("Keliling: " + objek.getKeliling());
        System.out.println();
    }

    public static void main(String[] args) {
        Persegi persegi = new Persegi(5, "Merah", "Tebal");
        Lingkaran lingkaran = new Lingkaran(14, 1, "Biru", "Tipis");

        IResize resizePersegi = persegi;
        IResize resizeLingkaran = lingkaran;

        System.out.println("Sebelum resize:");
        tampilkanInfo("Persegi", persegi);
        tampilkanInfo("Lingkaran", lingkaran);

        System.out.println("Setelah zoomIn() 10%:");
        resizePersegi.zoomIn();
        resizeLingkaran.zoomIn();
        tampilkanInfo("Persegi", persegi);
        tampilkanInfo("Lingkaran", lingkaran);

        System.out.println("Setelah zoomOut() 10%:");
        resizePersegi.zoomOut();
        resizeLingkaran.zoomOut();
        tampilkanInfo("Persegi", persegi);
        tampilkanInfo("Lingkaran", lingkaran);

        System.out.println("Setelah zoom(150):");
        resizePersegi.zoom(150);
        resizeLingkaran.zoom(150);
        tampilkanInfo("Persegi", persegi);
        tampilkanInfo("Lingkaran", lingkaran);
    }
}
