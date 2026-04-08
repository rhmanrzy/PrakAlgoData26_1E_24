# Laporan Praktikum Algoritma dan Struktur Data Jobsheet 6 SEARCHING

#### Nama : Rahma Aulia Nurrizky
#### NIM : 254107020168
#### Kelas : TI - 1E

## 6.2 Searching/Pencarian Menggunakan Algoritma Sequential Search

#### Code Program
![img](https://github.com/user-attachments/assets/eeeb5d62-da9c-4483-8dee-721a9bbb669f)

![img](https://github.com/user-attachments/assets/5972c2a3-57d5-4fbd-a6f0-f61b3b80b6f7)

![img](https://github.com/user-attachments/assets/f4d2d559-2445-415f-926f-1fb9b75ae9c1)

#### Hasil Running
![img](https://github.com/user-attachments/assets/676208a1-e9d6-4d76-9c2d-0b461b00f38a)

Pertanyaan
1. Jelaskan perbedaan metod tampilDataSearch dan tampilPosisi pada class MahasiswaBerprestasi!

   tampilPosisi = menampilkan posisi/indeks
   
   tampilDataSearch = menampilkan isi data mahasiswa (nim, nama, kelas, ipk)
   
2. Jelaskan fungsi break pada kode program di bawah ini!

   ![img](https://github.com/user-attachments/assets/0e490883-3219-453b-a3e6-6c13df94a9f5)

   untuk menghentikan perulangan (loop) saat data telah ditemukan

3. Apa fungsi variabel pos atau indeks hasil pencarian dalam program sequential search?

   untuk menyimpan posisi/indeks data yang ditemukan, apabila -1 maka data tidak ditemukan, selain -1 maka data ditemukan di indeks tersebut
   
4. Jika terdapat lebih dari satu data dengan nilai yang sama, hasil pencarian sequential search yang dibuat di atas akan menampilkan data ke berapa? Jelaskan.

   maka akan menampilkan data pertama, karena sequential search mencari data dari awal hingga akhir dan apabila bertemu dengan break maka langsung berhenti
   
5. Berkaitan dengan pertanyaan nomor 2 di atas, apa yang terjadi jika perintah break dihapus dari kode di atas?

   maka yang diambil adalah data terakhir, karena loop terus berjalan sampai akhir dan posisi terus diperbarui

## 6.3 Searching/Pencarian Menggunakan Algoritma Binary Search

#### Code Program
![img](https://github.com/user-attachments/assets/dde3192e-760a-491c-8492-cbd2ab0817e1)

![img](https://github.com/user-attachments/assets/1e3c3e44-1729-413b-a21f-d7d688cf5c74)

#### Hasil Running
![img](https://github.com/user-attachments/assets/2b9998c8-4b8b-4887-b3d3-b61202897e89)

Pertanyaan
1. Tunjukkan pada kode program yang mana proses divide dijalankan!

   ![img](https://github.com/user-attachments/assets/f72bea6b-45c7-4f45-a59d-f39cf2c3f078)

2. Tunjukkan pada kode program yang mana proses conquer dijalankan!

   ![img](https://github.com/user-attachments/assets/115817a1-25aa-49f4-8ec9-932e0e2e84e4)

3. Apa fungsi left, right, dan mid?

   left = posisi kiiri data

   right = posisi kanan data

   mid = posisi tengah data
   
4. Jika data IPK yang dimasukkan tidak urut. Apakah program masih dapat berjalan? Mengapa demikian?

   Program berjalan tidak urut, karena binary search hanya bisa digunakan pada data yang sudah terurut
   
5. Jika IPK yang dimasukkan dari IPK terbesar ke terkecil (misal: 3.8, 3.7, 3.5, 3.4, 3.2) dan elemen yang dicari adalah 3.2. Bagaimana hasil dari binary search? Apakah sesuai? Jika tidak sesuai maka ubahlah kode program binary seach agar hasilnya sesuai

   Maka hasilnya tidak sesuai (bisa ketemu/bisa salah) karena algoritma menganggap data urut naik

   Perbaikan :

   ![img](https://github.com/user-attachments/assets/732823be-f645-479e-a1d3-317451e3f388)

6. Jelaskan bagaimana binary search menentukan bahwa data yang dicari tidak ditemukan di dalam array.
    
    if(right < left){
    
     return -1 ;
    
    }
    
    Jika batas kanan sudah lebih kecil dari kiri, berarti semua data sudah dicek dan data yang dicari tidak ditemukan
    
7. Modifikasi program di atas yang mana jumlah mahasiswa yang diinputkan sesuai dengan masukan dari keyboard.

    ![img](https://github.com/user-attachments/assets/524f94c9-7e16-4f6d-a054-5955e75bf849)




