// Nama File : Garis.java
// Deskripsi : berisi atribut dan method dalam class garis 
// Pembuat   : Hasta Putra Wildantara / 24060124130119
// Tanggal   : 2/24/2026

public class Garis {
    // Atribut
    private Titik titikAwal;
    private Titik titikAkhir;
    private static int counterGaris = 0;

    // Method
    public Garis() {
        titikAwal = new Titik(0, 0);
        titikAkhir = new Titik(1, 1);
        counterGaris++;
    }

    public Garis(Titik t1, Titik t2) {
        titikAwal = t1;
        titikAkhir = t2;
        counterGaris++;
    }

    public Titik getTitikAwal() {
        return titikAwal;
    }

    public Titik getTitikAkhir() {
        return titikAkhir;
    }

    public void setTitikAwal(Titik t1) {
        titikAwal = t1;
    }

    public void setTitikAkhir(Titik t2) {
        titikAkhir = t2;
    }

    public static int getCounterGaris() {
        return counterGaris;
    }

    public double PanjangGaris() {
        return Math.sqrt(Math.pow(titikAkhir.getAbsis() - titikAwal.getAbsis(), 2)
                + Math.pow(titikAkhir.getOrdinat() - titikAwal.getOrdinat(), 2));
    }

    public double GradienGaris() {
        return (titikAkhir.getOrdinat() - titikAwal.getOrdinat()) / (titikAkhir.getAbsis() - titikAwal.getAbsis());
    }

    public Titik getTitikTengah() {
        double absis = (titikAwal.getAbsis() + titikAkhir.getAbsis()) / 2;
        double ordinat = (titikAwal.getOrdinat() + titikAkhir.getOrdinat()) / 2;
        return new Titik(absis, ordinat);
    }

    public boolean isSejajar(Garis g) {
        return this.GradienGaris() == g.GradienGaris();
    }

    public void printGaris() {
        System.out.println("Garis (" + titikAwal.getAbsis() + ", " + titikAwal.getOrdinat() + ") -> ("
                + titikAkhir.getAbsis() + ", " + titikAkhir.getOrdinat() + ")");
    }

    public String getPersamaanGaris() {
        double m = GradienGaris();
        double c = titikAwal.getOrdinat() - m * titikAwal.getAbsis();
        return "y = " + m + "x + " + c;
    }
}
