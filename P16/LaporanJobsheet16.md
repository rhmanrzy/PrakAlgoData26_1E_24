# Laporan Praktikum Algoritma dan Struktur Data Jobsheet 16 Collection

#### Nama : Rahma Aulia Nurrizky
#### NIM : 254107020168
#### Kelas : TI - 1E

## 16.2. Kegiatan Praktikum 1

#### Code Program

![img](https://github.com/user-attachments/assets/cc444d10-14b7-4252-9154-1e63cca04932)

#### Hasil Running

![img](https://github.com/user-attachments/assets/778f1ffd-08da-417b-acf0-851c809f4ce9)

Pertanyaan
1. Perhatikan baris kode 25-36, mengapa semua jenis data bisa ditampung ke dalam sebuah Arraylist?
   
   Karena ArrayList dibuat tanpa menggunakan Generic.
   
2. Modifikasi baris kode 25-36 seingga data yang ditampung hanya satu jenis atau spesifik tipe tertentu!
   
   ![img](https://github.com/user-attachments/assets/39ceb36f-bc13-4bc1-9b76-77e532c5c63a)

   hasilnya
   
   ![img](https://github.com/user-attachments/assets/79d3590b-217d-4cbb-a15d-793bd226711d)

3. Ubah kode pada baris kode 38 menjadi seperti ini

   ![img](https://github.com/user-attachments/assets/d28e19cc-ff79-4cb3-be66-3329ac8bf608)

   ![img](https://github.com/user-attachments/assets/e8cc7125-3d7e-4b30-b0d2-ac5ea3f69631)

4. Tambahkan juga baris berikut ini, untuk memberikan perbedaan dari tampilan yang sebelumnya

   ![img](https://github.com/user-attachments/assets/27a9459b-6bb7-4905-afbe-0cca550924c5)

   ![img](https://github.com/user-attachments/assets/b041806a-5327-4a6f-a22d-fa1f140a3ca7)

5. Dari penambahan kode tersebut, silakan dijalankan dan apakah yang dapat Anda jelaskan!
    
   ![img](https://github.com/user-attachments/assets/fa5b1a4c-2ac9-4bfa-8485-1e04e17e35ac)

   Setelah program dijalankan, method push("Mei-mei") menambahkan data "Mei-mei" ke posisi paling depan LinkedList sehingga jumlah elemen bertambah dari 5 menjadi 6. Kemudian method set(0, "My kid") mengubah data pertama dari "Mei-mei" menjadi "My kid" tanpa mengubah jumlah elemen.

## 16.3. Kegiatan Praktikum 2

#### Code Program

![img](https://github.com/user-attachments/assets/c657641b-ec54-4239-b6fc-67b7305c6263)

#### Hasil Running

![img](https://github.com/user-attachments/assets/c7057c57-817e-4997-a0ac-eee41dde51de)

Pertanyaan
1. Apakah perbedaan fungsi push() dan add() pada objek fruits?

   push() digunakan untuk menambahkan elemen ke bagian atas (awal) Stack.

   add() digunakan untuk menambahkan elemen ke bagian akhir Stack.
   
2. Silakan hilangkan baris 43 dan 44, apakah yang akan terjadi? Mengapa bisa demikian?

   ![img](https://github.com/user-attachments/assets/ea87ddc9-2e74-481b-8670-446d109d5fa7)

   Jika baris 43 dan 44 dihapus, maka buah Melon dan Durian tidak akan masuk ke dalam Stack. Akibatnya, saat program dijalankan, kedua buah tersebut tidak akan muncul pada output. Hal ini karena tidak ada perintah yang menambahkan Melon dan Durian ke dalam Stack.

3. Jelaskan fungsi dari baris 46-49?

   Menampilkan seluruh elemen pada Stack menggunakan Iterator.
   
4. Silakan ganti baris kode 25, Stack<String> menjadi List<String> dan apakah yang terjadi? Mengapa bisa demikian?

   ![img](https://github.com/user-attachments/assets/fa7f7b88-20e5-4185-b596-38f78cc89935)

   Akan menghasilkan error. Karena variabel fruits bertipe List, sedangkan method push() dan pop() hanya dimiliki oleh class Stack. Jadi Java hanya mengizinkan pemanggilan method yang ada pada interface List.

5. Ganti elemen terakhir dari dari objek fruits menjadi “Strawberry”!

   ![img](https://github.com/user-attachments/assets/2bdf24ce-f1a6-4195-9c00-468cf643a3e3)

   hasilnya

   ![img](https://github.com/user-attachments/assets/88ccd29a-95eb-4f3c-a263-dcd60290e49f)

6. Tambahkan 3 buah seperti “Mango”,”guava”, dan “avocado” kemudian dilakukan sorting!

   ![img](https://github.com/user-attachments/assets/ead203ff-b877-4878-af5c-b57030ca407e)

   hasilnya

   ![img](https://github.com/user-attachments/assets/be9dd6c5-4984-4d9e-8778-a24d6aa3b348)

## 16.4. Kegiatan Praktikum 3

#### Code Program

![img](https://github.com/user-attachments/assets/79c39565-eccd-4d65-9e07-9a9d86b6ac87)

![img](https://github.com/user-attachments/assets/4521fc30-dc03-42cd-88b3-2cc469866a4d)

#### Hasil Running

![img](https://github.com/user-attachments/assets/ff69dbb9-404b-4ec0-b706-59e8c77d52e3)

Pertanyaan
1. Pada fungsi tambah() yang menggunakan unlimited argument itu menggunakan konsep apa? Dan kelebihannya apa?

   Fungsi tambah() menggunakan konsep Varargs (Variable Arguments). Varargs memungkinkan sebuah method menerima jumlah data yang berbeda-beda tanpa harus menentukan jumlahnya terlebih dahulu.

   Kelebihannya:

   - Bisa menambahkan satu atau banyak data sekaligus.
     
   -  Kode menjadi lebih sederhana.
   
   -  Lebih fleksibel karena tidak perlu membuat banyak method dengan jumlah parameter yang berbeda.
  
2. Pada fungsi linearSearch() di atas, silakan diganti dengan fungsi binarySearch() dari collection!

   ![img](https://github.com/user-attachments/assets/f5164b29-9be5-49f3-a231-510c2fe3f91e)

   hasilnya

   ![img](https://github.com/user-attachments/assets/59c2f327-9f23-4406-95e4-72676d1ae44a)

3. Tambahkan fungsi sorting baik secara ascending ataupun descending pada class tersebut!

   ![img](https://github.com/user-attachments/assets/feda92c5-ffb6-46b2-ba46-f515049a16a4)

   hasilnya

   ![img](https://github.com/user-attachments/assets/77d742be-3b85-4746-88ff-08c5ebe1dab3)
   
## 16.5. Tugas Praktikum

1. Buatlah implementasi program daftar nilai mahasiswa semester, minimal memiliki 3 class yaitu Mahasiswa, Nilai, dan Mata Kuliah. Data Mahasiswa dan Mata Kuliah perlu melalui penginputan data terlebih dahulu.

   ![img](https://github.com/user-attachments/assets/51b199bd-e474-47cc-820b-21b6620616fa)

   ![img](https://github.com/user-attachments/assets/fdf4183f-4586-494a-9859-d0f80fd14164)

   ![img](https://github.com/user-attachments/assets/f46cd42e-af2f-4697-9bce-ffea8936865c)

   ![img](https://github.com/user-attachments/assets/35f22405-d06c-47ae-be24-308ebe478076)
   
   ![img](https://github.com/user-attachments/assets/131a53a8-5a3f-4b40-bd5f-751af517ce35)

   hasilnya
   
   ![img](https://github.com/user-attachments/assets/6e06768c-30d3-47c0-a8a9-50c6afbd9c87)

   ![img](https://github.com/user-attachments/assets/1fdfb3de-c589-4753-b518-bae8769467e1)

2. Tambahkan prosedur hapus data mahasiswa melalui implementasi Queue pada collections Tugas nomor 1!

   ![img](https://github.com/user-attachments/assets/09b5805b-cf76-4ecf-a003-3b5b7416d58a)

   ![img](https://github.com/user-attachments/assets/506e7b1a-6784-4c32-93a8-dbcede368aae)
