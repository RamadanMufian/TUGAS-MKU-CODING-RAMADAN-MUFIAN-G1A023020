# TUGAS-MKU-CODING-RAMADAN-MUFIAN-G1A023020
# SOAL NOMOR 1
Soal nomor satu yaitu adala pembuatan perulangan dengan forman ( your name ) sampai 100 kali
pertma  buat dulu public class mainya untuk pembuatan codingan perulangan 1-100
setelah itu gunkan variabel

        int count = 1;
        int digit = 1;
        String name = "(RAMADAN)";\
int count 1 itu menjelaskan deklarasi memiliki nilai 1 di mulai dari 1
dan int digit 1 menjelaskan memiliki nilai akhiran 1 dan kemudian string name adalah bentuk penyimpanan teks atau manipulasi ari teks tersebut

        while (count <= 100) {
            if (digit == 1) {
untuk while dan if adalah bentuk loop (pengulngan) dimana memunculkan stetmen  bahwa angka yang kurang dari 100 dan di mulai dari satu akan menimbulkann stetmen atau validasi "tru"

        else if (digit <= 9) {
                System.out.print(digit);
                digit++;
untuk else if ini adalh deklarasi dari variabel if while dimana else if dimana ini jika , digit kurang dari atau sama dengan 9 maka program akan mencetak nilai digit ke layar menggunakan System.out.print(digit);.
elanjutnya, nilai digit akan ditingkatkan dengan 1 menggunakan digit++. Ini akan mengubah nilai digit agar menjadi lebih besar sebesar 1.

        else {
                System.out.println(name);
                digit = 1;
                count++;
else ini adalah bentuk penjlan terkahir jika program if dan else if tidak benar  maka program akan menjalankan blok else. Ini berarti program akan mencetak nilai dari variabel name ke layar menggunakan System.out.println(name);.
untuk nilai digit sendiri akan kembali lagi menjadi 1
Kemudian, nilai count akan ditingkatkan dengan 1 menggunakan count++;. Ini digunakan untuk menggerakkan program ke langkah berikutnya dalam loop while
