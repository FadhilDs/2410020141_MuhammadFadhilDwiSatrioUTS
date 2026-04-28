package BUKU;

public class buku {
    private int id;
    private String judul;
    private String penulis;
    private int tahun;
    private Penerbit penerbit;

    public buku(int id, String judul, String penulis, int tahun, Penerbit penerbit) {
        this.id = id;
        this.judul = judul;
        this.penulis = penulis;
        this.tahun = tahun;
        this.penerbit = penerbit;
    }

    // METHOD CRUD
    public void index() {
        System.out.println("SELECT * FROM buku;");
    }

    public void store() {
        System.out.println("INSERT INTO buku (id, judul, penulis, tahun, penerbit_id) VALUES (" 
                + id + ", '" + judul + "', '" + penulis + "', " + tahun + ", " 
                + penerbit.getId() + ");");
    }

    public void update() {
        System.out.println("UPDATE buku SET judul='" + judul + "', penulis='" + penulis 
                + "', tahun=" + tahun + ", penerbit_id=" + penerbit.getId() 
                + " WHERE id=" + id + ";");
    }

    public void destroy() {
        System.out.println("DELETE FROM buku WHERE id=" + id + ";");
    }
}