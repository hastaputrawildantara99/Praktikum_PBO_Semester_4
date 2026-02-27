// Nama File : Titik.java
// Deskripsi : berisi atribut dan method dalam class titik 
// Pembuat   : Hasta Putra Wildantara / 24060124130119
// Tanggal   : 2/24/2026

public class Titik {
    // Atribut
    double absis;
    double ordinat;

    // Method
    Titik() {
        absis = 0;
        ordinat = 0;
    }

    double getAbsis() {
        return absis;
    }

    double getOrdinat() {
        return ordinat;
    }

    void setAbsis(double a) {
        absis = a;
    }

    void setOrdinat(double o) {
        ordinat = o;
    }

    void geser(double a, double o) {
        absis = absis + a;
        ordinat = ordinat + o;
    }

    void printTitik() {
        System.out.println("Titik (" + absis + ", " + ordinat + ")");
    }
}