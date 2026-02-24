// Nama File : Titik.java
// Deskripsi : berisi atribut dan method dalam class titik 
// Pembuat   : Hasta Putra Wildantara / 24060124130119
// Tanggal   : 2/24/2026

public class Mtitik {
    public static void main(String[] args) {
        Titik t1 = new Titik();
        t1.printTitik();
        t1.setAbsis(2);
        t1.setOrdinat(3);
        t1.printTitik();
        t1.geser(3, 4);
        t1.printTitik();

        Titik T2 = t1;
        T2.printTitik();
        t1.setAbsis(10);
        t1.setOrdinat(10);
        T2.printTitik();
        t1.getKuadran();
        System.out.println(Titik.getCounterTitik());
    }
}
