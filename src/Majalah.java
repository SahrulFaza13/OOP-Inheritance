public class Majalah extends Koleksi {
    private String edisi;

    public Majalah(String judul, String edisi, String penerbit, int tahun) {
        super(judul, penerbit, tahun);
        this.edisi = edisi;
    }

    public String info(){
        return "Majalah: " + judul + "\nEdisi: " + edisi + " \nPenerbit: " + penerbit + "\nTahun: " + tahun;
    }
}
