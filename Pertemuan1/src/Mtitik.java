// Nama File : Mtitik.java
// Deskripsi : berisi main function untuk class titik 
// Pembuat   : Hasta Putra Wildantara / 24060124130119
// Tanggal   : 2/24/2026

public class Mtitik {
    public static void main(String[] args) {
        Titik t1 = new Titik();
        System.out.println("absis t1: " + t1.absis);
        System.out.println("ordinat t1: " + t1.ordinat);
        t1.printTitik();
        t1.setAbsis(2);
        t1.setOrdinat(3);
        t1.printTitik();
        t1.geser(1, 2);
        t1.printTitik();
    }
}
