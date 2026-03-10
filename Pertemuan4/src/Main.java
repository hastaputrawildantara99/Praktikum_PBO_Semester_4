public class Main {
    public static void main(String[] args) {
        // Attribut
        Persegi persegi1 = new Persegi(4, "Merah", "Solid");
        Lingkaran lingkaran1 = new Lingkaran(10, 1, "Biru", "Dashed");

        // Method
        System.out.println("Persegi:");
        persegi1.printInfo();
        System.out.println("Luas: " + persegi1.getLuas());
        System.out.println("Keliling: " + persegi1.getKeliling());
        System.out.println("Diagonal: " + persegi1.getDiagonal());

        System.out.println("\nLingkaran:");
        lingkaran1.printInfo();
        System.out.println("Luas: " + lingkaran1.getLuas());
        System.out.println("Keliling: " + lingkaran1.getKeliling());
    }
}
