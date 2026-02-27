// Nama File : MGaris.java
// Deskripsi : berisi main function untuk class Garis
// Pembuat   : Hasta Putra Wildantara / 24060124130119
// Tanggal   : 2/24/2026

public class MGaris {
    public static void main(String[] args) {
        Garis g1 = new Garis();
        Garis g2 = new Garis(new Titik(1, 2), new Titik(3, 4));
        g1.printGaris();
        g2.printGaris();
        System.out.println("Panjang g1: " + g1.PanjangGaris());
        System.out.println("Panjang g2: " + g2.PanjangGaris());
        System.out.println("Gradien g1: " + g1.GradienGaris());
        System.out.println("Gradien g2: " + g2.GradienGaris());
        System.out.println("Titik tengah g1: ");
        g1.getTitikTengah().printTitik();
        System.out.println("Titik tengah g2: ");
        g2.getTitikTengah().printTitik();
        System.out.println("Garis g1 dan g2 sejajar: " + g1.isSejajar(g2));
        System.out.println("Persamaan g1: " + g1.getPersamaanGaris());
        System.out.println("Persamaan g2: " + g2.getPersamaanGaris());
    }
}
