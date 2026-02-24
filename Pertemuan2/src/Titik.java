// Nama File : Titik.java
// Deskripsi : berisi atribut dan method dalam class titik 
// Pembuat   : Hasta Putra Wildantara / 24060124130119
// Tanggal   : 2/24/2026

public class Titik{
    // Atribut
    double absis;
    double ordinat;
    static int counterTitik = 0; 

    // Method
    Titik(){
        absis = 0;
        ordinat = 0;
        counterTitik++;
    }

    Titik(double absis, double ordinat){
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
    }

    static int getCounterTitik(){
        return counterTitik;
    }

    double getAbsis(){
        return absis;
    }

    double getOrdinat(){
        return ordinat;
    }

    void setAbsis(double a){
        absis = a;
    }

    void setOrdinat(double o){
        ordinat = o;
    }

    void geser(double a, double o){
        absis = absis + a;
        ordinat = ordinat + o;
    }

    int getKuadran(){
        if(absis>0 && ordinat>0){
            return 1;
        } else if(absis<0 && ordinat>0){
            return 2;
        } else if(absis<0 && ordinat<0){
            return 3;
        } else if(absis>0 && ordinat<0){
            return 4;
        } else{
            return 0;
        }
    }

    void printTitik(){
        System.out.println("Titik (" + absis + ", " + ordinat + ")");
    }
}