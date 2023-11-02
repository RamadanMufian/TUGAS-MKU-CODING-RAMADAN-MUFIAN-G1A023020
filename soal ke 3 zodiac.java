import java.util.Scanner;

public class ZodiacSign {
    public static void main(String[] args) {
        // Membuat kamus zodiak
        String[] zodiacSigns = {
                "Aquarius", "Pisces", "Aries ", "Taurus", "Gemini", "Cencer",
                "Leo", "Virgo", "libra", "Scorpio", "sagitarius", "Capricorn"
        };

        int[] startDates = { 20, 19, 21, 20, 21, 21, 23, 23, 23, 23, 23, 22 };
        int[] endDates = { 18, 20, 19, 20, 20, 22, 22, 22, 21, 22, 21, 19 };

        // Meminta pengguna memasukkan bulan dan tanggal lahir
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan bulan kelahiran (dalam angka): ");
        int month = scanner.nextInt();
        System.out.print("Masukkan hari kelahiran: ");
        int day = scanner.nextInt();

        // Mencari zodiak yang sesuai dengan tanggal lahir
        String zodiacSign = null;
        for (int i = 0; i < zodiacSigns.length; i++) {
            if ((month == i + 1 && day >= startDates[i]) || (month == i + 2 && day <= endDates[i])) {
                zodiacSign = zodiacSigns[i];
                break;
            }
        }

        // Menampilkan zodiak
        if (zodiacSign != null) {
            System.out.println("Zodiak Anda adalah " + zodiacSign + ".");
        } else {
            System.out.println("Tanggal lahir tidak valid.");
        }

        scanner.close();
    }
}