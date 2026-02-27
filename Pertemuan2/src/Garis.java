// Nama File : Garis.java
// Deskripsi : berisi atribut dan method dalam class garis 
// Pembuat   : Hasta Putra Wildantara / 24060124130119
// Tanggal   : 2/24/2026

public class Garis {
    // Atribut
    Titik titikAwal;
    Titik titikAkhir;
    static int counterGaris = 0;

    // Method
    Garis() {
        titikAwal = new Titik(0, 0);
        titikAkhir = new Titik(1, 1);
        counterGaris++;
    }

    Garis(Titik t1, Titik t2) {
        titikAwal = t1;
        titikAkhir = t2;
        counterGaris++;
    }

    Titik getTitikAwal() {
        return titikAwal;
    }

    Titik getTitikAkhir() {
        return titikAkhir;
    }

    void setTitikAwal(Titik t1) {
        titikAwal = t1;
    }

    void setTitikAkhir(Titik t2) {
        titikAkhir = t2;
    }

    static int getCounterGaris() {
        return counterGaris;
    }

    double PanjangGaris() {
        return Math.sqrt(Math.pow(titikAkhir.getAbsis() - titikAwal.getAbsis(), 2)
                + Math.pow(titikAkhir.getOrdinat() - titikAwal.getOrdinat(), 2));
    }

    double GradienGaris() {
        return (titikAkhir.getOrdinat() - titikAwal.getOrdinat()) / (titikAkhir.getAbsis() - titikAwal.getAbsis());
    }

    Titik getTitikTengah() {
        double absis = (titikAwal.getAbsis() + titikAkhir.getAbsis()) / 2;
        double ordinat = (titikAwal.getOrdinat() + titikAkhir.getOrdinat()) / 2;
        return new Titik(absis, ordinat);
    }

    boolean isSejajar(Garis g) {
        return this.GradienGaris() == g.GradienGaris();
    }

    void printGaris() {
        System.out.println("Garis (" + titikAwal.getAbsis() + ", " + titikAwal.getOrdinat() + ") -> ("
                + titikAkhir.getAbsis() + ", " + titikAkhir.getOrdinat() + ")");
    }

    String getPersamaanGaris() {
        double m = GradienGaris();
        double c = titikAwal.getOrdinat() - m * titikAwal.getAbsis();
        return "y = " + m + "x + " + c;
    }
}
