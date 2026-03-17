// Nama File : IResize.java
// Deskripsi : Interface untuk objek yang dapat di-resize
// Pembuat : Hasta Putra Wildantara - 24060124130119
// Tanggal : 17 Maret 2026

public interface IResize {
    // menambah ukuran menjadi 10% lebih besar
    public void zoomIn();

    // mengurangi ukuran menjadi 10% lebih kecil
    public void zoomOut();

    // menskalakan ukuran sesuai input persen
    public void zoom(int percent);
}
