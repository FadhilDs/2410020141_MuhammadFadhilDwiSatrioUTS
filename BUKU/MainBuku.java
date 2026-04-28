package BUKU;

public class MainBuku {
    public static void main(String[] args) {

        
        User user = new User(1, "mfadhildwisatrio@email.com", "12345");

       
        Penerbit penerbit = new Penerbit(1, "Gramedia", "BANJARBARU");

       
        buku buku = new buku(1, "Belajar python", "Muhammad Fadhil dwi Satrio", 2026, penerbit);

        
        System.out.println("=== USER ===");
        user.index();
        user.store();
        user.update();
        user.destroy();

        System.out.println("\n=== PENERBIT ===");
        penerbit.index();
        penerbit.store();
        penerbit.update();
        penerbit.destroy();

        System.out.println("\n=== BUKU ===");
        buku.index();
        buku.store();
        buku.update();
        buku.destroy();
    }
}