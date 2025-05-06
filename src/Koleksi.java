abstract class Koleksi {
    public String judul, penerbit;
    public int tahun;

    public Koleksi(String judul,  String penerbit, int tahun){
        this.judul = judul;
        this.penerbit = penerbit;
        this.tahun = tahun;
    }
    abstract String info();

    public static void main(String[] args) {
        Buku b = new Buku("The rock and John Boyet", "Mark Bozelny", "Jakarta Sinar", 2001);
        Majalah m = new Majalah("Tech Today", "Edisi 5", "TechMedia", 2022);
        Skripsi s = new Skripsi("23081010242", "Mike tyson","AI learning", "Sinar Bandung", 2021);
        System.out.println(b.info());
        System.out.println(m.info());
        System.out.println(s.info());

    }
}
