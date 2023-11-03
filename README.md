# TUGAS-MKU-CODING-RAMADAN-MUFIAN-G1A023020
# SOAL NOMOR 1
Soal nomor satu yaitu adala pembuatan perulangan dengan forman ( your name ) sampai 100 kali
1. pertma  buat dulu public class mainya untuk pembuatan codingan perulangan 1-100
2. setelah itu gunkan variabel

        int count = 1;
        int digit = 1;
        String name = "(RAMADAN)";\
int count 1 itu menjelaskan deklarasi memiliki nilai 1 di mulai dari 1
dan int digit 1 menjelaskan memiliki nilai akhiran 1 dan kemudian string name adalah bentuk penyimpanan teks atau manipulasi ari teks tersebut

 3.       while (count <= 100) {
            if (digit == 1) {
untuk while dan if adalah bentuk loop (pengulngan) dimana memunculkan stetmen  bahwa angka yang kurang dari 100 dan di mulai dari satu akan menimbulkann stetmen atau validasi "tru"

            
4.        else if (digit <= 9) {
        System.out.print(digit);
        digit++;
untuk else if ini adalh deklarasi dari variabel if while dimana else if dimana ini jika , digit kurang dari atau sama dengan 9 maka program akan mencetak nilai digit ke layar menggunakan System.out.print(digit);.
elanjutnya, nilai digit akan ditingkatkan dengan 1 menggunakan digit++. Ini akan mengubah nilai digit agar menjadi lebih besar sebesar 1.
5.
        else {
                System.out.println(name);
                digit = 1;
                count++;
else ini adalah bentuk penjlan terkahir jika program if dan else if tidak benar  maka program akan menjalankan blok else. Ini berarti program akan mencetak nilai dari variabel name ke layar menggunakan System.out.println(name);.
untuk nilai digit sendiri akan kembali lagi menjadi 1
Kemudian, nilai count akan ditingkatkan dengan 1 menggunakan count++;. Ini digunakan untuk menggerakkan program ke langkah berikutnya dalam loop while

6.gambar hasil dari penjlanan program
![Screenshot (112)](https://github.com/RamadanMufian/TUGAS-MKU-CODING-RAMADAN-MUFIAN-G1A023020/assets/147229546/86da5d8d-b409-4a7a-96bf-bd835063ffcf)

# soal nomor 2
pada soal ini terdapat penerapan if else dalam perulangan while 


1  
        while (bilangan != 0) {

        
while (bilangan != 0): Ini adalah bagian dari loop while. Ini berarti loop akan terus berjalan selama "bilangan" tidak sama dengan 0. Ketika "bilangan" menjadi 0, loop akan berhenti.

2
       
        if (bilangan % 2 == 0) {
                System.out.println(bilangan + " adalah bilangan genap."
                
Di dalam loop while, ada pernyataan if-else yang digunakan untuk memeriksa apakah "bilangan" adalah genap atau ganjil.
if (bilangan % 2 == 0): Ini adalah pernyataan if yang menguji apakah "bilangan" habis dibagi (modulus) dengan 2 dan memiliki sisa 0. Jika hasilnya 0, maka "bilangan" adalah genap.        
Jika kondisi if benar (artinya, "bilangan" adalah genap), maka program akan mencetak pesan "bilangan adalah bilangan genap." ke layar.

3
    
        else {
                System.out.println(bilangan + " adalah bilangan ganjil.");
ika kondisi if tidak benar (artinya, "bilangan" bukan genap), maka program akan menjalankan pernyataan dalam blok else. Di dalam blok else, program mencetak pesan "bilangan adalah bilangan ganjil." ke layar.
contoh penjalanan pogram yang menggunkan penerapan if else dalam loop (perulangan) while

#soal nomor 3
dalam soal ini di perintahkan membuar program zodiak dengan menggunakan fitur input

