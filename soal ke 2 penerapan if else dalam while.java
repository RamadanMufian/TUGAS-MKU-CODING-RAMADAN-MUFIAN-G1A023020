import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Meminta pengguna untuk memasukkan bilangan
        System.out.print("Masukkan sebuah bilangan: ");
        int bilangan = input.nextInt();

        // Mengecek apakah bilangan genap atau ganjil
        while (bilangan != 0) {
            if (bilangan % 2 == 0) {
                System.out.println(bilangan + " adalah bilangan genap.");
            } else {
                System.out.println(bilangan + " adalah bilangan ganjil.");
            }

            // Meminta pengguna untuk memasukkan bilangan selanjutnya atau 0 untuk keluar
            System.out.print("Masukkan bilangan lain atau 0 untuk keluar: ");
            bilangan = input.nextInt();
        }

        System.out.println("Terima kasih! Program berakhir.");
        input.close();
    }
}
