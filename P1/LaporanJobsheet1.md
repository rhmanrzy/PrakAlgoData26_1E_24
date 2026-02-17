# Laporan Praktikum Algoritma dan Struktur Data Jobsheet 1 Konsep Dasar Pemrograman

#### Nama  : Rahma Aulia Nurrizky
#### NIM   : 254107020168
#### Kelas : TI-1E

## 2.2.1 Praktikum Pemilihan
Pertanyaan
1. Buatlah program untuk menghitung nilai akhir dari mahasiswa dengan ketentuan 20% nilai tugas, 20% dari nilai kuis, 30% nilai UTS, dan 40% nilai UAS.
   Setiap nilai yang dimasukkan mempunyai batas nilai 0 ‐ 100.
   Ketika pengguna memasukkan di luar rentang tersebut maka akan keluar output “nilai tidak valid”.
   Ketika nilai akhir sudah didapatkan selanjutnya lakukan konversi nilai dengan ketentuan sebagai berikut :
   
   <img width="568" height="290" alt="image" src="https://github.com/user-attachments/assets/2935e575-7801-4f72-9c86-1c016f2803af" />
   
   Jika Nilai Huruf yang didapatkan adalah A, B+, B, C+, C maka LULUS, jika nilai huruf D dan E maka TIDAK LULUS.
    • Input dari program berupa komponen nilai tugas, kuis, UTS, UAS
    • Otuput dari program “nilai tidak valid” jika nilai yang dimasukkan diluar ketentuan
    • Output dari program berupa hasil nilai akhir, nilai huruf, dan keterangan LULUS/TIDAK LULUS

   #### Code Program
   <img width="1185" height="988" alt="image" src="https://github.com/user-attachments/assets/a62d7f78-753c-4463-ade9-914b623950bf" />

   #### Output
   <img width="188" height="143" alt="image" src="https://github.com/user-attachments/assets/7177e8eb-c4c9-4144-8c96-908c0c24e8e6" />

   <img width="196" height="172" alt="image" src="https://github.com/user-attachments/assets/9e3d8399-c0bc-453d-80aa-2192c5547e4c" />

## 2.3.1 Praktikum Perulangan
Pertanyaan
1. Buatlah program yang dapat menampilkan deretan bilangan dari angka 1 sampai n, dengan n = 2-digit terakhir NIM Anda. Berikut Adalah ketentuan untuk mencetak deretnya : 
   a. Bilangan kelipatan 3 dicetak dengan simbol #
   b. Bilangan genap selain kelipatan 3 dicetak sesuai angkanya
   c. Bilangan ganjil dicetak dengan simbol *
   d. Bilangan 10 dan 15 tidak dicetak
   
   ##### *bila n<10 maka tambahkan 10 (n+=10)
   ##### Contoh 1:
   ##### Input NIM: 2541720102 maka n=12
   ##### Output: * 2 # 4 * # * 8 # * #
   
   ##### Contoh 2:
   ##### Input NIM: 2541720120 maka n=20
   ##### Output: * 2 # 4 * # * 8 # * # * 14 16 * # * 20

   #### Code Program
   <img width="561" height="561" alt="image" src="https://github.com/user-attachments/assets/291aa8af-23a4-42d9-8488-b69319d03581" />

   #### Output
   <img width="138" height="33" alt="image" src="https://github.com/user-attachments/assets/eb258745-b1f5-4aaa-bd8d-5b47147a98e2" />

## 2.4.1 Praktikum Array
Pertanyaan
1. Buatlah program untuk menghitung IP Semester dari mata kuliah yang Anda tempuh semester lalu. Formula untuk menghitung IP semester sebagai berikut :
   
   <img width="419" height="67" alt="image" src="https://github.com/user-attachments/assets/94611c70-37c3-4478-8f89-4d3868e022da" />
   
   Nilai setara didapatkan dari tabel konversi berikut ini :
   
   <img width="575" height="289" alt="image" src="https://github.com/user-attachments/assets/978d589f-036a-4998-af7a-0c72ed459952" />
   
   Input dari program berupa nama mata kuliah, bobot SKS, serta nilai huruf dari mata kuliah tersebut.

   #### Code Program
   <img width="616" height="632" alt="image" src="https://github.com/user-attachments/assets/c10f35c9-b9a4-4737-8228-a5faadbf5a48" />

   <img width="501" height="587" alt="image" src="https://github.com/user-attachments/assets/f1f8f3f7-0d02-4222-bcae-089a19ac45fa" />

   #### Output
   <img width="455" height="325" alt="image" src="https://github.com/user-attachments/assets/824af043-93f0-446e-bf25-f9598728f0c3" />

## 2.5.1 Praktikum Fungsi
Pertanyaan
1. RoyalGarden adalah toko bunga yang memiliki banyak cabang. Setiap hari Stock Bunga dan bunga-bunga yang dijual selalu dicatat dengan rincian seperti berikut ini :
   
   <img width="784" height="231" alt="image" src="https://github.com/user-attachments/assets/bc535038-e1ac-48bd-8b7f-12441d0aa76e" />
   
   1. Buatlah fungsi untuk menampilkan pendapatan setiap cabang jika semua bunga habis terjual.
   2. Tampilkan status dari setiap cabang dengan ketentuan sebagai berikut ini :
      a. Jika pendapatan cabang > Rp1.500.000, maka cabang tersebut mendapat status “Sangat Baik”
      b. Jika pendapatan ≤ Rp1.500.000, status “Perlu Evaluasi”.

      #### Code Program
      <img width="774" height="622" alt="image" src="https://github.com/user-attachments/assets/0ba49aff-6922-422b-a395-80fc074513fd" />

      #### Output
      <img width="196" height="209" alt="image" src="https://github.com/user-attachments/assets/7da88d3e-1f1c-4362-ae3c-7279e1f9dde8" />

## TUGAS
#### Tugas 1
Susun program untuk membuat dua buah array berikut isinya sebagai berikut.

Array pertama adalah array satu dimensi char KODE[10], berisi kode plat mobil.

Array kedua, array dua dimensi char KOTA[10][12] berisi nama kota yang berpasangan dengan kode plat mobil.

Ilustrasi tampilan array tersebut adalah sebagai berikut :

<img width="694" height="353" alt="image" src="https://github.com/user-attachments/assets/78967c43-021a-4ef3-8bd6-90bcbef5ad76" />

Ketika pengguna memberikan input kode plat nomor maka program akan mengeluarkan nama kota dari kode plat nomor tersebut.

#### Code Program
<img width="537" height="558" alt="image" src="https://github.com/user-attachments/assets/1258e262-532a-4f27-8d7a-a7361622dbc3" />

#### Output
<img width="215" height="30" alt="image" src="https://github.com/user-attachments/assets/128bac1c-5371-41b1-91e7-590a31347ca7" />

#### Tugas 2
Sebuah program digunakan untuk menyimpan dan mengelola jadwal kuliah mahasiswa.

Data jadwal disimpan dalam array 2 dimensi bertipe string, dengan ketentuan

• Baris menyatakan jadwal ke-i

• Kolom menyatakan informasi jadwal : Nama Mata Kuliah, Ruang, Hari Kuliah, Jam Kuliah. Contoh :

jadwal[0][0] = "Pemrograman Dasar"

jadwal[0][1] = "Lab Komputasi 1"

jadwal[0][2] = "Senin"

jadwal[0][3] = "08.00–10.00"

• Jumlah jadwal kuliah sebanyak n, diinputkan oleh pengguna.

Buatkan fungsi untuk

a. Menginput data jadwal kuliah ke dalam array 2 dimensi

b. Menampilkan seluruh jadwal kuliah dalam bentuk tabel

c. Menampilkan jadwal kuliah berdasarkan hari tertentu

d. Menampilkan jadwal kuliah berdasarkan nama mata kuliah tertentu

#### Code Program
<img width="615" height="729" alt="image" src="https://github.com/user-attachments/assets/1eca4a69-a81c-4b84-893f-ca028167462b" />

<img width="518" height="591" alt="image" src="https://github.com/user-attachments/assets/a08224dc-7356-4c49-b4a3-87cb5df4662a" />

#### Output
<img width="355" height="394" alt="image" src="https://github.com/user-attachments/assets/2671b2e7-74a7-4076-9013-a6dcf0b84654" />
