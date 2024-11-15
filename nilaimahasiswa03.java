import java.util.Scanner;

public class nilaimahasiswa03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = scanner.nextInt();
        System.out.print("Masukkan jumlah minggu: ");
        int jumlahMinggu = scanner.nextInt();

        String[] mahasiswa = new String[jumlahMahasiswa];
        int[][] nilai = new int[jumlahMahasiswa][jumlahMinggu];

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Masukkan nama mahasiswa ke-" + (i + 1) + ": ");
            mahasiswa[i] = scanner.next();
        }


        inputDataNilai(mahasiswa, nilai, scanner);

        tampilkanNilai(mahasiswa, nilai);

        cariMingguTertinggi(nilai);

        tampilkanMahasiswaTertinggi(mahasiswa, nilai);
    }

    public static void inputDataNilai(String[] mahasiswa, int[][] nilai, Scanner scanner) {
        for (int i = 0; i < mahasiswa.length; i++) {
            System.out.println("Masukkan nilai untuk " + mahasiswa[i] + ": ");
            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print("Minggu ke-" + (j + 1) + ": ");
                nilai[i][j] = scanner.nextInt();
            }
        }
    }

    public static void tampilkanNilai(String[] mahasiswa, int[][] nilai) {
        System.out.println("\nNilai Mahasiswa:");
        for (int i = 0; i < mahasiswa.length; i++) {
            System.out.print(mahasiswa[i] + ": ");
            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print(nilai[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void cariMingguTertinggi(int[][] nilai) {
        int[] totalNilaiMinggu = new int[nilai[0].length];

        for (int j = 0; j < nilai[0].length; j++) {
            for (int i = 0; i < nilai.length; i++) {
                totalNilaiMinggu[j] += nilai[i][j];
            }
        }

        int mingguTertinggi = 0;
        for (int i = 1; i < totalNilaiMinggu.length; i++) {
            if (totalNilaiMinggu[i] > totalNilaiMinggu[mingguTertinggi]) {
                mingguTertinggi = i;
            }
        }

        System.out.println("\nMinggu dengan nilai tertinggi adalah Minggu ke-" + (mingguTertinggi + 1));
    }

    public static void tampilkanMahasiswaTertinggi(String[] mahasiswa, int[][] nilai) {
        int nilaiTertinggi = 0;
        String mahasiswaTertinggi = "";

        for (int i = 0; i < mahasiswa.length; i++) {
            int totalNilai = 0;
            for (int j = 0; j < nilai[i].length; j++) {
                totalNilai += nilai[i][j];
            }

            if (totalNilai > nilaiTertinggi) {
                nilaiTertinggi = totalNilai;
                mahasiswaTertinggi = mahasiswa[i];
            }
        }

        System.out.println("\nMahasiswa dengan nilai tertinggi adalah " + mahasiswaTertinggi + " dengan total nilai " + nilaiTertinggi);
    }
}