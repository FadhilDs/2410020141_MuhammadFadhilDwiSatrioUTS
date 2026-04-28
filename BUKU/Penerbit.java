package BUKU;

public class Penerbit {
    private int id;
    private String namaPenerbit;
    private String alamatPenerbit;

    public Penerbit(int id, String namaPenerbit, String alamatPenerbit) {
        this.id = id;
        this.namaPenerbit = namaPenerbit;
        this.alamatPenerbit = alamatPenerbit;
    }

    public int getId() {
        return id;
    }

    public String getNamaPenerbit() {
        return namaPenerbit;
    }

  
    public void index() {
        System.out.println("SELECT * FROM penerbit;");
    }

    public void store() {
        System.out.println("INSERT INTO penerbit (id, namaPenerbit, alamatPenerbit) VALUES (" 
                + id + ", '" + namaPenerbit + "', '" + alamatPenerbit + "');");
    }

    public void update() {
        System.out.println("UPDATE penerbit SET namaPenerbit='" + namaPenerbit 
                + "', alamatPenerbit='" + alamatPenerbit + "' WHERE id=" + id + ";");
    }

    public void destroy() {
        System.out.println("DELETE FROM penerbit WHERE id=" + id + ";");
    }
}