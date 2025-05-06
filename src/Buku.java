public class Buku extends Koleksi {
    private String penulis;

    public Buku(String judul, String penulis, String penerbit, int tahun){
        super(judul, penerbit, tahun);
        this.penulis = penulis;
    }

    public String info(){
        return "Buku: " + judul + " \nPenulis: " + penulis + " \nPenerbit: " + penerbit + " \nTahun: " + tahun;
    }
}
