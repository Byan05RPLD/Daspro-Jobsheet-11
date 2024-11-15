import java.util.Scanner;
public class percobaan604 {
  
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Menghitung luas persegi panjang
        System.out.print("Masukkan panjang: ");
        int p = input.nextInt();
        System.out.print("Masukkan lebar: ");
        int l = input.nextInt();
        int luas = p * l;
        System.out.println("Luas persegi panjang adalah: " + luas);

        // Menghitung volume balok
        System.out.print("Masukkan tinggi: ");
        int t = input.nextInt();
        int volume = luas * t;
        System.out.println("Volume balok adalah: " + volume);

        input.close();
    }
}


