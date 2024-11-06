import java.util.Scanner;

public class SIAKAD21 {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jmlMahasiswa = sc.nextInt();
        System.out.print("Masukkan jumlah mata kuliah: ");
        int jmlMatkul = sc.nextInt();

        int [][] nilai = new int[jmlMahasiswa][jmlMatkul];

        for (int i = 0; i < jmlMahasiswa; i++) {
            System.out.println("Input nilai mahasiswa ke-" + (i + 1));
            double totalPerSiswa = 0;

            for (int j = 0; j < jmlMatkul; j++) {
                System.out.print("Nilai mata kuliah " + (j + 1) + ": ");
                nilai[i][j] = sc.nextInt();
                totalPerSiswa += nilai[i][j];
            }
            System.out.println("Nilai rata-rata mahasiswa ke-" + (i + 1) + ": " + totalPerSiswa / jmlMatkul);
        }

        System.out.println("\n=============================");
        System.out.println("Rata-rata Nilai setiap Mata Kuliah:");
        
        for (int j = 0; j < jmlMatkul; j++) {
            double totalPerMatkul = 0;

            for (int i = 0; i < jmlMahasiswa; i++) {
                totalPerMatkul += nilai[i][j];
            }
            System.out.println("Mata Kuliah " + (j + 1) + ": " + totalPerMatkul / jmlMahasiswa);   
        }
    }
}
