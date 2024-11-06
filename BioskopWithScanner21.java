import java.util.Scanner;

public class BioskopWithScanner21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String[][] penonton = new String[4][2]; 
        String nama;
        int pilihan, baris, kolom;
        boolean adaPenonton = false;

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Input data penonton");
            System.out.println("2. Lihat daftar penonton");
            System.out.println("3. Keluar");
            System.out.print("Masukkan pilihan 1/2/3: ");
            pilihan = sc.nextInt();
            sc.nextLine();  

            if (pilihan == 1) {
                System.out.print("Masukkan nama penonton: ");
                nama = sc.nextLine();
                
                while (true) {
                    System.out.print("Masukkan nomor baris (1-4): ");
                    baris = sc.nextInt();
                    System.out.print("Masukkan nomor kolom (1-2): ");
                    kolom = sc.nextInt();
                    sc.nextLine();

                    if (baris < 1 || baris > 4 || kolom < 1 || kolom > 2) {
                        System.out.println("Nomor baris atau kolom kursi tidak tersedia, coba lagi.");
                    } else {
                        if (penonton[baris - 1][kolom - 1] != null) {
                            System.out.println("Kursi ini sudah ditempati, silakan pilih kursi lain.");
                        } else {
                            penonton[baris - 1][kolom - 1] = nama;
                            System.out.println("Penonton berhasil ditambahkan");
                            break;
                        }
                    }
                }
            } else if (pilihan == 2) {
                System.out.println("Daftar penonton yang daftar:");
                adaPenonton = false;

                for (int i = 0; i < 4; i++) {
                    for (int j = 0; j < 2; j++) {
                        if (penonton[i][j] == null) {
                            System.out.println("Baris " + (i + 1) + ", Kolom " + (j + 1) + ": ***");
                        } else {
                            System.out.println("Baris " + (i + 1) + ", Kolom " + (j + 1) + ": " + penonton[i][j]);
                            adaPenonton = true;
                        }
                    }
                } 
                if (!adaPenonton) {
                    System.out.println("Belum ada penonton yang daftar");
                }
            } else if (pilihan == 3) {
                System.out.println("Terima kasih telah menggunakan aplikasi ini!");
                break;
            } else {
                System.out.println("Pilihan tidak tersedia, coba lagi.");
            }
        }
    }
}
