# Laporan Praktikum Algoritma dan Struktur Data Jobsheet XIV Collection

#### Nama : Rahma Aulia Nurrizky
#### NIM : 254107020168
#### Kelas : TI - 1E

## 13.2 Persiapan

Class customer

![img](https://github.com/user-attachments/assets/e3bdd424-d6a5-445a-bfae-8a334dfa69cd)

Class book

![img](https://github.com/user-attachments/assets/bc5a69b8-a2db-4d38-8d71-8b244866ccef)

## 13.3 Praktikum - Implementasi ArrayList

1. Pada fungsi main(), instansiasi collection baru dengan nama customers bertipe ArrayList of Customer dengan size 2. Selanjutnya, buat object customer1 dan customer2 kemudian tambahkan ke dalam ArrayList customers dengan method add.

![img](https://github.com/user-attachments/assets/392c7304-fd33-42d5-bf5a-8843725c5460)

2. Gunakan looping dengan foreach untuk mencetak data customers.

![img](https://github.com/user-attachments/assets/c4e4c832-80b4-41f1-a0a5-460ec48b4748)

3. Cobalah tambahkan object customer baru ke dalam customers. Apakah object dapat ditambahkan meskipun melebihi kapasitas? Bisa, karena ArrayList memiliki ukuran yang fleksibel (dinamis). Saat kapasitas awal penuh, ArrayList akan menambah kapasitasnya secara otomatis sehingga data baru tetap dapat masuk.

![img](https://github.com/user-attachments/assets/58734b64-3902-4da8-9ca1-2ac440a9e2d2)

4. Compile dan run kode program, di mana object yang baru ditambahkan? Di awal, di tengah, atau di akhir collection? Di akhir collection.

![img](https://github.com/user-attachments/assets/b2b80405-211b-4e17-84fc-48ecd0e5cfc7)

5. Untuk menambahkan object baru pada index tertentu, lakukan sebagai berikut.

![img](https://github.com/user-attachments/assets/36f575c3-337d-4e22-bed6-9071c7910b6d)

6. Compile dan run kode program. Index pada ArrayList dimulai dari 0 atau 1? Dimulai dari 0.

![img](https://github.com/user-attachments/assets/d6e38f9a-832c-48e6-b9fe-9da809bb1631)

7. Untuk mengetahui posisi dari suatu objek, gunakan method indexOf().

![img](https://github.com/user-attachments/assets/c17dadbe-4ac0-40f9-a314-12b44736c318)

8. Untuk mengembalikan object pada index tertentu, gunakan method get().

![img](https://github.com/user-attachments/assets/c18a1a2c-f3dd-4724-bfe1-b4069dd8c3b4)

9. Cobalah hapus angka 2 saat instansiasi object customers. Apakah ArrayList dapat diinstansiasi tanpa harus menentukan size di awal? Bisa, size di awal ArrayList tidak wajib ditentukan. Java mengatur secara otomatis kapasitasnya ketika data ditambahkan.

![img](https://github.com/user-attachments/assets/0f57f2a1-1683-4c95-a8a0-77fb07e1d91c)

10. Anda juga dapat menambahkan sekumpulan customer baru ke dalam ArrayList secara sekaligus. Misalnya terdapat ArrayList newCustomers. Tambahkan seluruh object customer sekaligus ke dalam customers.

![img](https://github.com/user-attachments/assets/d6332164-42ab-406b-a30a-d60465cc04fa)

11. Karena sudah menyediakan method toString(), pengecekan data customers untuk proses debugging juga dapat dilakukan lebih sederhana dengan cara berikut

![img](https://github.com/user-attachments/assets/4df3ede8-1340-46c8-ba9f-1c97505d8d40)

## 13.4 Praktikum - Implementasi Stack

1. Instansiasi object books bertipe Stack of Book kemudian tambahkan object yang sudah dibuat ke dalamnya menggunakan method push().

![img](https://github.com/user-attachments/assets/336ee3d2-c216-4617-a408-54b4666964a3)

2. Class Stack juga sudah memiliki method pop() dan peek() seperti yang Anda diimpelementasikan secara manual pada praktikum sebelumnya.

![img](https://github.com/user-attachments/assets/8a951b16-06d2-4dd2-a64c-17517b396820)

3. Mengapa perlu ada pengecekan (temp != null)? Agar tidak mengalami error. Digunakan untuk memastikan data yang akan dijalankan program memang ada. Jika nilainya null (kosong), program bisa mengalami kesalahan saat dijalankan.

4. Lakukan looping untuk mencetak data buku pada stack.

![img](https://github.com/user-attachments/assets/1dce4287-9c41-47ff-b350-322fe904471c)

5. Jika diperlukan pada proses debugging, books juga dapat dicetak dengan cara berikut.

![img](https://github.com/user-attachments/assets/6452e128-2ff8-41d7-bdaa-b702449f156b)

6. Bagaimana cara melakukan pencarian elemen pada stack menggunakan method search()? Method search() akan mencari data yang kita inginkan. Jika data ditemukan, program akan menampilkan posisi data tersebut di dalam Stack. Jika data tidak ditemukan, hasilnya adalah -1.

## 13.4 Praktikum - Implementasi Stack

1. Tambahkan fungsi main() kemudian instansiasi object TreeSet of String. Tambahkan beberapa nilai bertipe String ke dalam TreeSet.

![img](https://github.com/user-attachments/assets/e23fe831-e5b7-4e46-bb8a-28f42688ac0f)

2. Cetak data pada ts dengan looping

![img](https://github.com/user-attachments/assets/7392ab10-039e-419a-93db-dac6ff90392a)

3. Compile dan run program. Mengapa urutan yang ditampilkan berbeda dengan urutan penambahan data ke dalam TreeSet fruits? Karena TreeSet mengurutkan data secara otomatis. Walaupun data dimasukkan secara acak, TreeSet akan menyimpannya dalam urutan yang teratur (berdasarkan abjad).

![img](https://github.com/user-attachments/assets/91b19c21-3b68-4668-9358-bbae4900c014)

4. Tambahkan kode program sebagai berikut :

![img](https://github.com/user-attachments/assets/72257189-8817-4829-a787-0ffae7d0c6ce)

5. Apa yang dilakukan oleh method first(), last(), remove(), pollFirst(), dan pollLast()?
- first() = Mengambil data yang berada di urutan pertama.
- last() = Mengambil data yang berada di urutan terakhir.
- remove() = Menghapus data tertentu dari TreeSet.
- pollFirst() = Mengambil sekaligus menghapus data pertama.
- pollLast() = Mengambil sekaligus menghapus data terakhir.

## 13.6 Praktikum – Sorting

Selain pencarian data menggunakan method get() atau search(), Java Collection Framework juga menyediakan fungsi untuk melakukan pengurutan data. Untuk melakukan pengurutan data String, int, atau primitive data type lain, Anda dapat melakukan cara berikut :

Class sortingstring

![img](https://github.com/user-attachments/assets/6f2f77bd-91bd-45b8-81e6-437c5d915ba4)

Khusus untuk collection of objects, pengurutan data harus menentukan berdasarkan atribut mana pengurutan dilakukan. Misalnya ingin dilakukan pengurutan data customer pada praktikum di atas berdasarkan atribut name. Gunakan kode program berikut (berikan nama variabel c1 dan c2 secara random. Anda bisa menggunakan nama variabel lainnya)

Class sortingcustomer

![img](https://github.com/user-attachments/assets/008b5e37-a176-49e2-8105-7df29c9c15a6)

Kedua cara di atas dapat digunakan untuk mengurutkan data pada jenis collection lain yang tidak melakukan pengurutan secara otomatis seperti TreeSet.
