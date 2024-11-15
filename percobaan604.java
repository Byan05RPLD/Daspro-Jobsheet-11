import java.util.Scanner;
public class percobaan604 {
  
    static int hitungLuas(int panjang, int lebar) {
        return panjang * lebar;
    }
    static int hitungVolume(int tinggi, int panjang, int lebar) {
        int luas = hitungLuas(panjang, lebar);
        return luas * tinggi;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan panjang: ");
        int p = input.nextInt();
        System.out.print("Masukkan lebar: ");
        int l = input.nextInt();
        System.out.print("Masukkan tinggi: ");
        int t = input.nextInt();
        int luas = hitungLuas(p, l);
        int volume = hitungVolume(t, p, l);
        System.out.println("Luas persegi panjang adalah: " + luas);
        System.out.println("Volume balok adalah: " + volume);

        input.close();
    }
}

