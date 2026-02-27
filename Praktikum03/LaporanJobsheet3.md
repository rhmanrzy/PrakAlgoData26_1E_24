# Laporan Praktikum Algoritma dan Struktur Data Jobsheet 3 Array of Object

#### Nama : Rahma Aulia Nurrizky
#### NIM : 254107020168
#### Kelas : TI - 1E

## 3.2 Membuat Array dari Object, Mengisi dan Menampilkan

#### Code Program
![img](https://github.com/user-attachments/assets/fe3eefd7-5c44-400e-a872-ecb769cf5c65)

![img](https://github.com/user-attachments/assets/414ccf8a-a22d-45b2-8f2a-95ac28f2f483)

#### Hasil Running
![img](https://github.com/user-attachments/assets/46f4b458-88df-4381-8925-2f286bfac653)

Pertanyaan
1. Berdasarkan uji coba 3.2, apakah class yang akan dibuat array of object harus selalu memiliki atribut dan sekaligus method? Jelaskan!

   Tidak. Class boleh hanya memiliki atribut saja. Method tidak wajib, tetapi biasanya ditambahkan agar pengolahan data lebih rapi.
   
2. Apa yang dilakukan oleh kode program berikut?
   
   ![img](https://github.com/user-attachments/assets/3de6efb5-3fed-4016-a10b-08914c8b9a52)
   
   Program membuat array yang bisa menampung 3 objek bertipe Mahasiswa24.
   
3. Apakah class Mahasiswa memiliki konstruktor? Jika tidak, kenapa bisa dilakukan pemanggilan konstruktur pada baris program berikut?
   
   ![img](https://github.com/user-attachments/assets/9bdf98ba-e96f-4859-9098-136f7853b1e0)
   
   Ya, class Mahasiswa tetap memiliki konstruktor, meskipun kita tidak menuliskannya secara langsung. Kalau di dalam class tidak dibuat konstruktor sama sekali, maka Java otomatis membuatkan konstruktor default (konstruktor kosong).

4. Apa yang dilakukan oleh kode program berikut?
   
   ![img](https://github.com/user-attachments/assets/b5807ec0-c52a-4918-8d28-865a710981a8)

   Kode tersebut membuat satu objek Mahasiswa24 pada indeks 0, lalu mengisi semua data atributnya (nim, nama, kelas, dan ipk).
   
5. Mengapa class Mahasiswa dan MahasiswaDemo dipisahkan pada uji coba 3.2?

   Class Mahasiswa dan MahasiswaDemo dipisahkan supaya program lebih rapi dan terstruktur. Kalau digabung jadi satu, memang bisa, tapi kurang rapi.

   Mahasiswa untuk model datanya, MahasiswaDemo untuk menjalankan programnya.

## 3.3 Menerima Input Isian Array Menggunakan Looping

#### Code Program
![img](https://github.com/user-attachments/assets/aaba19d6-177f-4812-bda9-2960d7f14873)

#### Hasil Running
![img](https://github.com/user-attachments/assets/355f0e10-2233-4e41-bb68-d940fef692b1)

Pertanyaan
1. Tambahkan method cetakInfo() pada class Mahasiswa kemudian modifikasi kode program pada langkah no 3.

   ![img](https://github.com/user-attachments/assets/5f998548-2e8f-45e4-a753-fd11821d1491)

   ![img](https://github.com/user-attachments/assets/3fd5d2d3-a00f-4099-86cd-5b39e00dfa6a)

2. Misalkan Anda punya array baru bertipe array of Mahasiswa dengan nama myArrayOfMahasiswa. Mengapa kode berikut menyebabkan error?

   ![img](https://github.com/user-attachments/assets/8389d791-e5c3-4311-b916-a8f0a58f4520)

   Kode tersebut akan error (NullPointerException). Karena baris pertama hanya membuat wadah array, bukan membuat objek Mahasiswanya.

## 3.4 Constructor Berparameter

#### Code Program
![img](https://github.com/user-attachments/assets/db939fe4-419e-4d79-a531-0e1f352be764)

![img](https://github.com/user-attachments/assets/2f77d84c-82e2-447e-82ea-5dacb8f5760d)

#### Hasil Running
![img](https://github.com/user-attachments/assets/fab8b801-0222-4a06-ad71-c16ad539ac84)

Pertanyaan
1. Apakah suatu class dapat memiliki lebih dari 1 constructor? Jika iya, berikan contohnya

   Iya, dapat.

   Contohnya:

   ![img](https://github.com/user-attachments/assets/8fcbf344-02d5-4bc2-9be8-7de8b8b30014)

2. Tambahkan method tambahData() pada class Matakuliah, kemudian gunakan method tersebut di class MatakuliahDemo untuk menambahkan data Matakuliah

   ![img](https://github.com/user-attachments/assets/af3ee0d0-810a-4b9e-87ab-08643f64b0c6)

   ![img](https://github.com/user-attachments/assets/f7a74bee-0905-4d43-8303-62947063a542)

3. Tambahkan method cetakInfo() pada class Matakuliah, kemudian gunakan method tersebut di class MatakuliahDemo untuk menampilkan data hasil inputan di layar

   ![img](https://github.com/user-attachments/assets/0adefb87-b44e-4fc4-812f-1ee7a41ad5b9)

   ![img](https://github.com/user-attachments/assets/193f5fc2-c78a-408e-bfec-43a64b93f2c1)

4. Modifikasi kode program pada class MatakuliahDemo agar panjang (jumlah elemen) dari array of object Matakuliah ditentukan oleh user melalui input dengan Scanner

   ![img](https://github.com/user-attachments/assets/b0928c5b-23ea-4a8e-8607-30c9def71415)

## 3.5 Tugas

1. Buatlah program untuk menampilkan informasi tentang dosen.

   Program dapat menerima input semua informasi terkait dosen dan menampilkanya kembali ke layar.

   Program ini terdiri dari class Dosen<NoPresensi> dengan attribute/property sebagai berikut;

   String kode

   String nama

   Boolean jenisKelamin

   int usia

   dengan methode constructor sebagai berikut :

   public dosen(String kode, String nama, Boolean jenisKelamin, int usia) {

   …………….;

   …………….;

   }

   Kemudian buatlah class DosenDemo<NoPresensi> untuk proses input dan menampilkan data beberapa dosen. Gunakan looping dengan FOR untuk pembuatan array of object. Gunakan looping dengan FOREACH untuk menampilkan data ke layar.

   #### Code Program
   ![img](https://github.com/user-attachments/assets/6a6021b0-c485-4827-8994-660d558c5c0a)

   ![img](https://github.com/user-attachments/assets/9de59de1-3c46-431c-b5f7-e1d75591172a)

   #### Hasil Running
   ![img](https://github.com/user-attachments/assets/97d7dd61-1d2e-4c54-bf7a-a86e4615ffce)

2. Tambahkan class baru DataDosen<NoPresensi> dengan beberapa method berikut :
  
   a. dataSemuaDosen(Dosen[] arrayOfDosen)untuk menampilkan data semua dosen

   b. jumlahDosenPerJenisKelamin(Dosen[] arrayOfDosen) untuk menampilkan data jumlah dosen per jenis kelamin (Pria / Wanita)

   c. rerataUsiaDosenPerJenisKelamin(Dosen[] arrayOfDosen) untuk menampilkan rata-rata usia dosen per jenis kelamin (Pria / Wanita)

   d. infoDosenPalingTua(Dosen[] arrayOfDosen) untuk menampilkan data dosen paling tua

   e. infoDosenPalingMuda(Dosen[] arrayOfDosen) untuk menampilkan data dosen paling muda

   Semua method tersebut harus bisa dipanggil/ditest dari class DosenDemo

   #### Code Program
   ![img](https://github.com/user-attachments/assets/627a0842-d718-4bd6-aa0e-292f07bdcb79)

   ![img](https://github.com/user-attachments/assets/47389b1b-c443-4e20-8d05-98074d4658e5)

   #### Hasil Running
   ![img](https://github.com/user-attachments/assets/72d19a08-20d7-4a0b-9f90-df6bbd019bbf)
