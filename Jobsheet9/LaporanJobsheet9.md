# Laporan Praktikum Algoritma dan Struktur Data Jobsheet 9 STACK

#### Nama : Rahma Aulia Nurrizky
#### NIM : 254107020168
#### Kelas : TI - 1E

## 2.1 Percobaan 1: Mahasiswa Mengumpulkan Tugas

#### Code Program
![img](https://github.com/user-attachments/assets/6ca1d91c-0e12-47f4-8234-f5f49a5d98e6)

![img](https://github.com/user-attachments/assets/50c796e1-20c4-41d9-bda2-0097602c3f43)

![img](https://github.com/user-attachments/assets/198c878e-e99e-42a3-9214-74749bb70ec8)

#### Hasil Running
![img](https://github.com/user-attachments/assets/b46212fb-b185-48e5-b52f-56696836c6df)

Pertanyaan
1. Lakukan perbaikan pada kode program, sehingga keluaran yang dihasilkan sama dengan verifikasi hasil percobaan! Bagian mana yang perlu diperbaiki?

   ![img](https://github.com/user-attachments/assets/70c41233-2eb3-4f41-b493-59f6e06cc81b)

2. Berapa banyak data tugas mahasiswa yang dapat ditampung di dalam Stack? Tunjukkan potongan kode programnya!

   banyak data yang dapat ditampung = 5

   ![img](https://github.com/user-attachments/assets/65aa9165-9f05-48f1-acf5-0e67d06b7fde)

   ![img](https://github.com/user-attachments/assets/594d4820-a6d6-4b38-bcec-1f0fd3618263)

3. Mengapa perlu pengecekan kondisi !isFull() pada method push? Kalau kondisi if-else tersebut dihapus, apa dampaknya?

   perlu mengecek kondisi !isFull() karena untuk mencegah stackoverflow (data melebihi kapasitas array)

   if-else dihapus maka akan error (ArrayIndexOutOfBoundsException) karena top melebihi batas array
   
4. Modifikasi kode program pada class MahasiswaDemo dan StackTugasMahasiswa sehingga pengguna juga dapat melihat mahasiswa yang pertama kali mengumpulkan tugas melalui operasi lihat tugas terbawah!

   StackTugasMahasiswa
   
   ![img](https://github.com/user-attachments/assets/4ed00f8e-e4c6-44cd-86c6-1cf3553995f8)

   MahasiswaDemo
   
   ![img](https://github.com/user-attachments/assets/c3250ec6-6a03-4b25-8dee-545bd9a29b0f)

   ![img](https://github.com/user-attachments/assets/3c3b3a59-e546-4b59-b063-76bec8d39275)

   ![img](https://github.com/user-attachments/assets/e19cd1cb-c281-4082-9753-0b2b6477d6ab)

5. Tambahkan method untuk dapat menghitung berapa banyak tugas yang sudah dikumpulkan saat ini, serta tambahkan operasi menunya!

   StackTugasMahasiswa
   
   ![img](https://github.com/user-attachments/assets/e5add401-281b-40d3-8dbd-914f3fd62a62)

   MahasiswaDemo
   
   ![img](https://github.com/user-attachments/assets/11edb2f2-235b-4b4f-bdf3-47bbf9197bf9)

   ![img](https://github.com/user-attachments/assets/ef62db06-6221-4816-bb15-5c3ce21bd98d)

   ![img](https://github.com/user-attachments/assets/858dbdac-2076-43be-8fa3-67a565e7c091)

## 2.2 Percobaan 2: Konversi Nilai Tugas ke Biner

#### Code Program
![img](https://github.com/user-attachments/assets/428d2c38-8423-4dc4-bd0f-be555975259b)

![img](https://github.com/user-attachments/assets/231d1982-bc1f-4418-80f2-ca87a11d9f5d)

![img](https://github.com/user-attachments/assets/adf393b6-bb23-497e-8d48-8dafa223cf7e)

#### Hasil Running
![img](https://github.com/user-attachments/assets/a9faa93b-285f-41c2-a02b-bc9059555c55)

Pertanyaan
1. Jelaskan alur kerja dari method konversiDesimalKeBiner!

   buat stack
   ![img](https://github.com/user-attachments/assets/b5e01fd3-9fb9-4c41-9971-7d316322d7b1)

   proses pembagian berulang
   ![img](https://github.com/user-attachments/assets/9f4b32ec-7007-4948-928e-943550faf4fd)

   ambil sisa
   ![img](https://github.com/user-attachments/assets/4ea0742e-6066-4fa1-8d28-f991dc862ee3)

   simpan ke stack
   ![img](https://github.com/user-attachments/assets/708d7a1e-4f86-48c1-b6bc-577e4116f4a5)

   bagi 2
   ![img](https://github.com/user-attachments/assets/2bbd9655-1098-4f3c-bb33-e258cfa7cd46)

   ambil hasil dari stack
   ![img](https://github.com/user-attachments/assets/eb1872a1-22f4-457f-8868-e8638c162867)

   return hasil
   ![img](https://github.com/user-attachments/assets/1574cd4a-ffd9-48d0-bca7-e8ea7512c33e)

2. Pada method konversiDesimalKeBiner, ubah kondisi perulangan menjadi while (kode != 0), bagaimana hasilnya? Jelaskan alasannya!
   jika kondisi perulangan diubah menjadi while (kode != 0) maka program akan error karena variabel kode tidak ada
   
## 2.4 Latihan Praktikum

![img](https://github.com/user-attachments/assets/1e34c893-93fb-4033-9f6b-9a7d9beeaef9)

1. Terima Surat Izin untuk memasukkan data surat

2. Proses Surat Izin untuk memproses atau memverifikasi surat

3. Lihat Surat Izin Terakhir untuk melihat surat teratas

4. Cari Surat untuk mencari ada atau tidaknya surat izin berdasarkan nama mahasiswa

#### Code Program
![img](https://github.com/user-attachments/assets/6b2fe718-d722-4767-8191-ce52aa0d283b)

![img](https://github.com/user-attachments/assets/099066bb-23d1-48df-bca1-e5708ec5c83f)

![img](https://github.com/user-attachments/assets/afbc73af-4e9c-4d3f-b0a5-375213e1aa28)

#### Hasil Running
![img](https://github.com/user-attachments/assets/309c550f-6918-49a8-80da-695f571cf0bd)
