# Laporan Praktikum Algoritma dan Struktur Data Jobsheet 10 QUEUE

#### Nama : Rahma Aulia Nurrizky
#### NIM : 254107020168
#### Kelas : TI - 1E

## 2.1 Percobaan 1 : Operasi Dasar Queue

#### Code Program

![img](https://github.com/user-attachments/assets/d3bb23c8-4c5d-47bd-ad1a-96c6a9b84090)

![img](https://github.com/user-attachments/assets/b01afad9-d498-4445-a47e-6b9253a58b05)

![img](https://github.com/user-attachments/assets/2b0f9de9-32b4-4c62-b9cd-d717ea771482)

#### Hasil Running

![img](https://github.com/user-attachments/assets/2869b7dc-5a4e-4e9d-848b-9b818b24ba96)

 Pertanyaan
1. Pada konstruktor, mengapa nilai awal atribut front dan rear bernilai -1, sementara atribut size bernilai 0?
   
   atribut front dan rear bernilai -1 untuk menandakan queue masih kosong (belum ada data)

   size = 0 menunjukkan jumlah data dalam queue belum ada

2. Pada method Enqueue, jelaskan maksud dan kegunaan dari potongan kode berikut!
   ![img](https://github.com/user-attachments/assets/13f59787-2666-4937-8039-606acd02537f)

   kode ini digunakan agar queue bisa berputar (circular), jika rear sudah sampai di indeks akhir array (max - 1) maka akan kembali ke indeks 0 agar bisa mengisi tempat yang kosong didepan

3. Pada method Dequeue, jelaskan maksud dan kegunaan dari potongan kode berikut!
   ![img](https://github.com/user-attachments/assets/e6335b2e-daed-494b-bb4d-d852e618d302)

   kode ini berfungsi agar front juga bisa berputar (circular), jika front sudah sampai di indeks akhir array (max - 1) maka akan kembali ke indeks 0 agar proses pengambilan data tetap berjalan

4. Pada method print, mengapa pada proses perulangan variabel i tidak dimulai dari 0 (int i=0), melainkan int i=front?

   karena data pertama dalam queue tidak selalu di indeks 0, tetapi berada di posisi front, maka perulangan harus dimulai dari front agar yang ditampilkan hanya data yang valid/benar

5. Perhatikan kembali method print, jelaskan maksud dari potongan kode berikut!
   ![img](https://github.com/user-attachments/assets/0e074afa-3195-4863-9a07-88957e666ec2)

   kode ini membuat perulangan berjalan secara melingkar (circular), jika sudah sampai di indeks akhir array maka akan kembali ke indeks 0

6. Tunjukkan potongan kode program yang merupakan queue overflow!
   ![img](https://github.com/user-attachments/assets/3d67e056-622b-442b-bb29-1be6a974daf6)

7. Pada saat terjadi queue overflow dan queue underflow, program tersebut tetap dapat berjalan dan hanya menampilkan teks informasi. Lakukan modifikasi program sehingga pada saat terjadi queue overflow dan queue underflow, program dihentikan!
   ![img](https://github.com/user-attachments/assets/5fc46aa7-31d3-4edb-a84e-259f6f21eee8)

   menambahkan System.exit(1) pada kondisi overflow dan underflow sehingga program akan langsung berhenti ketika terjadi kesalahan

## 2.2. Percobaan 2 : Antrian Layanan Akademik

#### Code Program

![img](https://github.com/user-attachments/assets/cb23a651-5683-4742-90ff-2c1748850b62)

![img](https://github.com/user-attachments/assets/dfe32e12-74cd-46e5-be9e-b42c3286fe82)

![img](https://github.com/user-attachments/assets/5add3456-c978-43e1-8eab-2746b93b6eaf)

![img](https://github.com/user-attachments/assets/dbb92df6-d9ba-43de-b9e8-ed0f0bb8d546)

#### Hasil Running

![img](https://github.com/user-attachments/assets/d0e62d0f-89e2-46af-8ea9-eae158cdea0b)

![img](https://github.com/user-attachments/assets/7d594ba8-e299-440c-b2aa-67db44cfcb44)

Pertanyaan

Lakukan modifikasi program dengan menambahkan method baru bernama LihatAkhir pada class AntrianLayanan yang digunakan untuk mengecek antrian yang berada di posisi belakang. Tambahkan pula daftar menu 6. Cek Antrian paling belakang pada class LayananAkademikSIAKAD sehingga method LihatAkhir dapat dipanggil!

#### Code Program

![img](https://github.com/user-attachments/assets/daa3a23e-beb9-4e89-8c62-25b1ac0a0497)

![img](https://github.com/user-attachments/assets/ac1bf369-ef8e-4ec3-8e1f-8c0981ab1511)

![img](https://github.com/user-attachments/assets/a82e86bc-7a4a-4ef9-b105-c61eb7aa2323)

#### Hasil Running

![img](https://github.com/user-attachments/assets/3d563d80-b564-424f-a341-9327d9bb3d97)

## 2.3 Tugas

Buatlah program antrian untuk mengilustasikan antrian persetujuan Kartu Rencana Studi (KRS) Mahasiswa oleh Dosen Pembina Akademik (DPA). Ketika seorang mahasiswa akan mengantri, maka dia harus mendaftarkan datanya (data mahasiswa seperti pada praktikum 2). Gunakan class untuk antrian seperti pada Praktikum 1 dan 2, dengan method-method yang berfungsi :

• Cek antrian kosong, Cek antrian penuh, Mengosongkan antrian.

• Menambahkan antrian, Memanggil antrian untuk proses KRS – setiap 1x panggilan terdiri dari 2 mahasiswa (pada antrian no 1 dan 2)

• Menampilkan semua antrian, Menampilkan 2 antrian terdepan, Menampilkan antrian paling akhir.

• Cetak jumlah antrian, Cetak jumlah yang sudah melakukan proses KRS

• Jumlah antrian maximal 10, jumlah yang ditangani masing-masing DPA 30 mahasiswa, cetak jumlah mahasiswa yang belum melakukan proses KRS.

Gambarkan Diagram Class untuk antriannya. Implementasikan semua method menggunakan menu pilihan pada fungsi main.

#### Code Program

![img](https://github.com/user-attachments/assets/27d4b73d-842f-46b9-87a1-3df9d5abf9ab)

![img](https://github.com/user-attachments/assets/7866bc42-f009-49c4-93e8-413676315300)

![img](https://github.com/user-attachments/assets/0e3fd260-e84a-4ee1-976a-9348ae0acefa)

![img](https://github.com/user-attachments/assets/ddd4b381-a438-4687-8025-a1fe45cefb52)

#### Hasil Running

![img](https://github.com/user-attachments/assets/428da34d-adb2-4417-bb49-cdef4a73f6b3)

![img](https://github.com/user-attachments/assets/acf55aac-a2b4-4a25-b746-d490fb38133e)

![img](https://github.com/user-attachments/assets/a11eddbf-2eee-4932-8d6f-fd997ae74669)
