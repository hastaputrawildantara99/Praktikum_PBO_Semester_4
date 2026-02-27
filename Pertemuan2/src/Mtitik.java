// Nama File : Mtitik.java
// Deskripsi : berisi main function untuk class titik 
// Pembuat   : Hasta Putra Wildantara / 24060124130119
// Tanggal   : 2/24/2026

public class Mtitik {
    public static void main(String[] args) {
        Titik t1 = new Titik();
        System.out.println("Titik t1: ");
        t1.printTitik();
        System.out.println("\nSet titik t1 menjadi x=2, y=3: ");
        t1.setAbsis(2);
        t1.setOrdinat(3);
        t1.printTitik();
        System.out.println("\nGeser titik t1 1 langkah ke kanan dan ke atas: ");
        t1.geser(1, 1);
        t1.printTitik();
        System.out.println("\nKuadran t1: " + t1.getKuadran());
        System.out.println("Jarak pusat ke t1: " + t1.getJarakPusat());

        Titik T2 = new Titik(9, 12);
        System.out.println("\nTitik T2: ");
        T2.printTitik();
        System.out.println("\nJarak t1 ke T2: " + t1.getJarak(T2));
        System.out.println("\nRefleksi Titik t1 terhadap X");
        t1.refleksiX();
        t1.printTitik();
        System.out.println("\nRefleksi Titik t1 terhadap Y");
        t1.refleksiY();
        t1.printTitik();
        System.out.println("\nFungsi Refleksi X t1 (Titik baru): ");
        t1.getRefleksiX().printTitik();
        System.out.println("\nFungsi Refleksi Y t1 (Titik Baru): ");
        t1.getRefleksiY().printTitik();
        System.out.println("\nJumlah Titik: " + Titik.getCounterTitik());
    }
}
