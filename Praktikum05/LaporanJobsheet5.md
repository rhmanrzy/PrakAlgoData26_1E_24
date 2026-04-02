# Laporan Praktikum Algoritma dan Struktur Data Jobsheet 5 SORTING (BUBBLE, SELECTION, DAN INSERTION SORT)

#### Nama : Rahma Aulia Nurrizky
#### NIM : 254107020168
#### Kelas : TI - 1E

## 5.2 Praktikum 1 - Mengimplementasikan Sorting menggunakan object

#### Code Program
![img](https://github.com/user-attachments/assets/ebc6f586-9f0a-490f-9732-bdddf1580e70)

![img](https://github.com/user-attachments/assets/f38b64d7-f091-4b1f-9556-98fc691bb316)

#### Hasil Running
![img](https://github.com/user-attachments/assets/ad30d00b-1bd7-490f-9c85-9fd2d258345f)

Pertanyaan!
1. Jelaskan fungsi kode program berikut

   ![img](https://github.com/user-attachments/assets/378020ef-5cba-4eb9-8edf-f3ad48172fd5)

   Untuk menukar (swap) dua nilai dalam array jika urutannya salah

2. Tunjukkan kode program yang merupakan algoritma pencarian nilai minimum pada selection sort!

   ![img](https://github.com/user-attachments/assets/f85734e0-cf02-40b9-835e-044882a0dab3)

3. Pada Insertion sort , jelaskan maksud dari kondisi pada perulangan

   ![img](https://github.com/user-attachments/assets/a5be3f9a-e5fc-429b-8abb-7d5d8cc842a1)

   Perulangan akan terus berjalan selama :

   j >= 0 => index masih dalam batas array

   data[j] > temp => nilai di kiri lebih besar dari nilai yang mau dimasukkan

4. Pada Insertion sort, apakah tujuan dari perintah

   ![img](https://github.com/user-attachments/assets/ffd5eb08-05a9-4861-bb37-0c78257d8001)

   Menggeser nilai ke kanan

## 5.3 Praktikum 2- (Sorting Menggunakan Array of Object)

#### Code Program
![img](https://github.com/user-attachments/assets/7d14be58-f2a1-450b-9a19-0b9cb46ff648)

![img](https://github.com/user-attachments/assets/22922244-2653-4d7f-af5e-46b4ec9ac41e)

![img](https://github.com/user-attachments/assets/2f86e71d-9b9b-4808-a4fa-332a84799f0c)

#### Hasil Running
![img](https://github.com/user-attachments/assets/fb8ab3c4-f0c1-4b14-b248-45339e8c533f)

![img](https://github.com/user-attachments/assets/4182cae2-0e51-4fbd-9e7a-0872c8b259b3)

Pertanyaan
1. Perhatikan perulangan di dalam bubbleSort() di bawah ini:
   
   ![img](https://github.com/user-attachments/assets/c28bc288-d21f-4fa2-964b-79dd48061b7e)

  a. Mengapa syarat dari perulangan i adalah i<listMhs.length-1 ?
     Karena setiap langkah sudah ada satu data yang berada di posisi benar, jadi cukup dilakukan sebanyak jumlah data dikurangi satu.
     
  b. Mengapa syarat dari perulangan j adalah j<listMhs.length-i ?
     Karena bagian belakang array sudah rapi, sehingga tidak perlu dicek lagi
     
  c. Jika banyak data di dalam listMhs adalah 50, maka berapakali perulangan i akan berlangsung? Dan ada berapa Tahap bubble sort yang ditempuh?
     Jika data ada 50, maka perulangan i terjadi sebanyak 49 kali dan tahap Bubble Sort juga ada 49 tahap
     
2. Modifikasi program diatas dimana data mahasiswa bersifat dinamis (input dari keyborad) yang terdiri dari nim, nama, kelas, dan ipk!

   ![img](https://github.com/user-attachments/assets/6ce9ecbd-173f-4c7b-8134-dd527545b7d4)

   ![img](https://github.com/user-attachments/assets/0a61956e-5c27-450f-b26a-a16358db0f91)

## 5.3.5 Mengurutkan Data Mahasiswa Berdasarkan IPK (Selection Sort)

#### Code Program
![img](https://github.com/user-attachments/assets/b228159c-ee9c-4fd0-ab8b-791f8432d26b)

![img](https://github.com/user-attachments/assets/6b0745b0-3792-47db-86ce-66c9cd169196)

#### Hasil Running
![img](https://github.com/user-attachments/assets/5b80cb0e-955f-4234-aad1-7a61986e194e)

![img](https://github.com/user-attachments/assets/8a64f44d-bd75-4fbc-bebf-376ab1bb4944)

Pertanyaan
Di dalam method selection sort, terdapat baris program seperti di bawah ini:

![img](https://github.com/user-attachments/assets/5bf43f77-8601-4425-bb22-21d317f6bf93)

Untuk apakah proses tersebut, jelaskan!

Untuk mencari posisi nilai terkecil (minimum) dalam array, dimulai dari indeks ke-i. Awalnya, idxMin = i dianggap sebagai nilai paling kecil. Kemudian perulangan j digunakan untuk membandingkan elemen setelahnya. Jika ditemukan nilai yang lebih kecil (listMhs[j].ipk < listMhs[idxMin].ipk), maka idxMin akan diperbarui

## 5.4 Mengurutkan Data Mahasiswa Berdasarkan IPK Menggunakan Insertion Sort

#### Code Program
![img](https://github.com/user-attachments/assets/c47c5e5e-f495-421c-b9c4-498f64be5024)

![img](https://github.com/user-attachments/assets/35765021-2419-4cde-a7f2-9d5d2e0c60ff)

#### Hasil Running
![img](https://github.com/user-attachments/assets/02d254ed-3427-48ad-b1e0-e2969da8982e)

![img](https://github.com/user-attachments/assets/1f5c0d0b-a308-4683-acc5-d3c1c79272fe)

Pertanyaan
Ubahlah fungsi pada InsertionSort sehingga fungsi ini dapat melaksanakan proses sorting dengan cara descending.

![img](https://github.com/user-attachments/assets/a47bcc02-eeed-42b1-89c8-02e8b17559a5)

## 5.5 Latihan Praktikum

![img](https://github.com/user-attachments/assets/d85a25d8-6979-4315-aea4-3a96966c21ab)

Berdasarkan class diagram diatas buatlah menu dikelas main dengan pilihan menu:
1. Tambah data digunakan untuk menambahkan data dosen

2. Tampil data digunakan untuk menampilkan data seluruh dosen

3. Sorting ASC digunakan untuk mengurutkan data dosen berdasarkan usia dimulai dari dosen termuda ke dosen tertua menggunakan bublle Sort.

4. Sorting DSC digunakan untuk mengurutkan data dosen berdasarkan usia dimulai dari tertua ke dosen termuda dapat menggunakan algoritma selection sort atau insertion sort.

#### Code Program
![img](https://github.com/user-attachments/assets/e23ec816-807b-458a-b32b-9229cfaf63df)

![img](https://github.com/user-attachments/assets/e167de60-9175-43fd-bde3-da0321f9118b)

![img](https://github.com/user-attachments/assets/76624e16-e1dd-4974-9c4e-8a8ba53adb86)

#### Hasil Running
![img](https://github.com/user-attachments/assets/9d8a2685-d751-47f7-848e-2dbf0c23f3f1)

![img](https://github.com/user-attachments/assets/cbb39fbc-df22-4a9e-9b7e-4b89b6d2391f)
