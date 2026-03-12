# Laporan Praktikum Algoritma dan Struktur Data Jobsheet 3 Array of Object

#### Nama : Rahma Aulia Nurrizky
#### NIM : 254107020168
#### Kelas : TI - 1E

## 5.2 Menghitung Nilai Faktorial dengan Algoritma Brute Force dan Divide and Conquer

#### Code Program
![img](https://github.com/user-attachments/assets/6cf9e733-7b47-45a5-94c9-d20d3b8aea60)

#### Hasil Running
![img](https://github.com/user-attachments/assets/6c52d0e0-bfcb-43be-8215-0f0968668a82)

Pertanyaan
1. Pada base line Algoritma Divide Conquer untuk melakukan pencarian nilai faktorial, jelaskan perbedaan bagian kode pada penggunaan if dan else!

   if (n==1) = kondisi berhenti pada rekursi, maka faktorialnya langsung 1 = 1

   else = menghitung faktorial dengan memanggil fungsi yang sama secara rekursif
   
2. Apakah memungkinkan perulangan pada method faktorialBF() diubah selain menggunakan for? Buktikan!

   bisa, menggunakan while
   
   ![img](https://github.com/user-attachments/assets/0d8af772-d16b-458b-bc9a-ff874e5cbde6)

3. Jelaskan perbedaan antara fakto *= i; dan int fakto = n * faktorialDC(n-1); !

   fakto *= i => nilai fakto dikalikan dengan i setiap perulangan

   fakto = n * faktorialDC(n-1) => Method memanggil dirinya sendiri untuk menghitung faktorial
   
4. Buat Kesimpulan tentang perbedaan cara kerja method faktorialBF() dan faktorialDC()!

   faktorialBF() menggunakan perulangan (loop) seperti for atau while.

   faktorialDC() menggunakan rekursi, yaitu method memanggil dirinya sendiri.
   
## 5.3 Menghitung Hasil Pangkat dengan Algoritma Brute Force dan Divide and Conquer

#### Code Program
![img](https://github.com/user-attachments/assets/fe3eefd7-5c44-400e-a872-ecb769cf5c65)

![img](https://github.com/user-attachments/assets/22a7f1b0-5028-44ce-9b4d-9be8063d027a)

#### Hasil Running
![img](https://github.com/user-attachments/assets/499dd680-e227-4648-a01e-cb077ca491e5)

Pertanyaan
1. Jelaskan mengenai perbedaan 2 method yang dibuat yaitu pangkatBF() dan pangkatDC()!

   pangkatBF() = menggunakan perulangan

   pangkatDC() = menggunakan rekursi
   
2. Apakah tahap combine sudah termasuk dalam kode tersebut?Tunjukkan!

   sudah ada

   ![img](https://github.com/user-attachments/assets/5b74a87b-2643-467e-a5e7-a598b51549dc)

3. Pada method pangkatBF()terdapat parameter untuk melewatkan nilai yang akan dipangkatkan dan pangkat berapa, padahal di sisi lain di class Pangkat telah ada atribut nilai dan pangkat, apakah menurut Anda method tersebut tetap relevan untuk memiliki parameter? Apakah bisa jika method tersebut dibuat dengan tanpa parameter? Jika bisa, seperti apa method pangkatBF() yang tanpa parameter?

   tidak harus, karena di dalam class sudah ada atribut : nilai dan pangkat
   
4. Tarik tentang cara kerja method pangkatBF() dan pangkatDC()!

   pangkatBF() menggunakan perulangan (loop) seperti for atau while.

   pangkatDC() menggunakan rekursi, yaitu method memanggil dirinya sendiri.

## 5.4 Menghitung Sum Array dengan Algoritma Brute Force dan Divide and Conquer

#### Code Program
![img](https://github.com/user-attachments/assets/25292de0-f8c9-44b4-8a8f-3aeef7beed7a)

![img](https://github.com/user-attachments/assets/d616c290-82cd-4ae2-beba-a412440ee8be)

#### Hasil Running
![img](https://github.com/user-attachments/assets/00e5a7e7-fec9-4d7d-8901-d33eebf3d3f1)

Pertanyaan
1. Kenapa dibutuhkan variable mid pada method TotalDC()?

   variabel mid digunakan untuk menentukan titik tengah array

   tujuannya agar data bisa dibagi menjadi dua bagian, yaitu bagian kiri dan bagian kanan

   dengan begitu program bisa menghitung jumlah data sedikit demi sedikit
   
2. Untuk apakah statement di bawah ini dilakukan dalam TotalDC()?

   ![img](https://github.com/user-attachments/assets/2ff62442-04df-4adb-9f33-24e4de78b53e)

   kode ini digunakan untuk menghitung jumlah data pada dua bagian
   
   lsum = menghitung jumlah bagian kiri

   rsum = menghitung jumlah bagian kanan

   lalu kedua kode tersebut digabungkan
   
4. Kenapa diperlukan penjumlahan hasil lsum dan rsum seperti di bawah ini?

   ![img](https://github.com/user-attachments/assets/f9ff5496-7ed2-4943-9395-fe5a5169503e)

   karena total semua data adalah jumlah dari bagian kiri dan bagian kanan.

   jadi kedua hasil tersebut harus dijumlahkan agar mendapatkan total keseluruhan.
   
5. Apakah base case dari totalDC()?

   totalDC() = jika hanya ada satu data, maka langsung dikembalikan nilainya.
   
6. Tarik Kesimpulan tentang cara kerja totalDC()

   metode ini membagi masalah menjadi bagian kecil lalu menggabungkan hasilnya

## 4.5 Latihan Praktikum

1. Sebuah kampus memiliki daftar nilai mahasiswa dengan data sesuai tabel di bawah ini
   
![img](https://github.com/user-attachments/assets/a94bf6ae-8e97-41b4-aeb9-b4242c09e478)

Tentukan:
a) Nilau UTS tertinggi tertinggi menggunakan Divide and Conquer!
b) Nilai UTS terendah menggunakan Divide and Conquer!
c) Rata-rata nilai UAS dari semua mahasiswa menggunakan Brute Force!

#### Code Program
![img](https://github.com/user-attachments/assets/8e4b1d4c-ad80-40d2-ab03-4cf300fc42c8)

![img](https://github.com/user-attachments/assets/2602fe44-ac56-4807-88a9-dae8def079fb)

#### Hasil Running
![img](https://github.com/user-attachments/assets/4485b728-a3f3-4f71-900f-851798193461)

