public class Persegi extends BangunDatar {
    // Atribut 
    private double sisi;

    // Method
    public Persegi(){
        setJmlhSisi(4);
    }

    public Persegi(double sisi, String warna, String border){
        // setWarna(warna);
        // setBorder(border);
        // setJmlhSisi(4); // Atau bisa juga dengan memanggil 
        //                    constructor parent dengan keyword super
        // super(4, warna, border);
        this.jmlhSisi = 4;
        this.warna = warna;
        this.border = border;
        this.sisi = sisi;
    }

    public double getSisi(){
        return sisi;
    }

    public void setSisi(double sisi){
        this.sisi = sisi;
    }

    public double getLuas(){
        return getSisi() * getSisi();
    }

    public double getKeliling(){
        return getJmlhSisi() * getSisi();
    }
    
    public double getDiagonal(){
        return getSisi() * Math.sqrt(2);
    }

    @Override
    public void printInfo(){
        System.out.println("Jumlah Sisi: " + getJmlhSisi());
        System.out.println("Warna: " + getWarna());
        System.out.println("Border: " + getBorder());
        // Atau bisa juga dengan memanggil method parent dengan keyword super
        // super.printInfo();
        System.out.println("Sisi: " + sisi);
    }

    // public static void printCounterBangunDatar(){
    //     System.out.println("Jumlah Bangun Datar yang dibuat: " + counterBangunDatar);
    // }
    // Method static tidak bisa di override 
}
