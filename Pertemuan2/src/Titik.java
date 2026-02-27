// Nama File : Titik.java
// Deskripsi : berisi atribut dan method dalam class titik 
// Pembuat   : Hasta Putra Wildantara / 24060124130119
// Tanggal   : 2/24/2026

public class Titik {
    // Atribut
    private double absis;
    private double ordinat;
    private static int counterTitik = 0;

    // Method
    public Titik() {
        this.absis = 0;
        this.ordinat = 0;
        counterTitik++;
    }

    public Titik(double absis, double ordinat) {
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
    }

    public static int getCounterTitik() {
        return counterTitik;
    }

    public double getAbsis() {
        return absis;
    }

    public double getOrdinat() {
        return ordinat;
    }

    public void setAbsis(double a) {
        absis = a;
    }

    public void setOrdinat(double o) {
        ordinat = o;
    }

    public void geser(double a, double o) {
        absis = absis + a;
        ordinat = ordinat + o;
    }

    public int getKuadran() {
        if (absis > 0 && ordinat > 0) {
            return 1;
        } else if (absis < 0 && ordinat > 0) {
            return 2;
        } else if (absis < 0 && ordinat < 0) {
            return 3;
        } else if (absis > 0 && ordinat < 0) {
            return 4;
        } else {
            return 0;
        }
    }

    public double getJarakPusat() {
        return Math.sqrt(absis * absis + ordinat * ordinat);
    }

    public double getJarak(Titik t) {
        double dx = this.absis - t.absis;
        double dy = this.ordinat - t.ordinat;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public void refleksiX() {
        ordinat = -ordinat;
    }

    public void refleksiY() {
        absis = -absis;
    }

    public Titik getRefleksiX() {
        return new Titik(-absis, ordinat);
    }

    public Titik getRefleksiY() {
        return new Titik(absis, -ordinat);
    }

    public void printTitik() {
        System.out.println("Titik (" + absis + ", " + ordinat + ")");
    }
}