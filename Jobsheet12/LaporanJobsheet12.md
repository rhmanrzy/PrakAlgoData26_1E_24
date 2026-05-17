# Laporan Praktikum Algoritma dan Struktur Data Jobsheet 12 DOUBLE LINKED LIST

#### Nama : Rahma Aulia Nurrizky
#### NIM : 254107020168
#### Kelas : TI - 1E

## 12.2 Percobaan 1: Operasi Penambahan pada Double Linked List

#### Code Program

![img](https://github.com/user-attachments/assets/3fe342a1-35e6-4e00-9056-37722b04e9c8)

![img](https://github.com/user-attachments/assets/2bf8ea15-e7d5-44d1-8fb6-6ab1dd200823)

![img](https://github.com/user-attachments/assets/cd45a5b1-1a3f-4b00-8eb6-39ea2af3dfe4)

![img](https://github.com/user-attachments/assets/09f17baf-66a8-4977-915d-9ee77a060698)

#### Hasil Running

![img](https://github.com/user-attachments/assets/58460428-0373-4ce1-ad3e-5e73eba2ef51)

Pertanyaan
1. Jelaskan perbedaan struktur dan mekanisme traversal antara Single Linked List dan Double Linked List!

   - Single linked list :

     Setiap node hanya memiliki satu pointer yaitu next, Traversal memiliki satu arah hanya bisa dilakukan dari depan ke belakang, Lebih hemat memori, setiap node menyimpan 1 pointer, Kurang fleksibel untuk operasi yang membutuhkan akses mundur, Tidak bisa traversal mundur (ke node sebelumnya), Implementasi lebih sederhana.

   - Double linked list :

     Setiap node memiliki dua pointer yaitu next dan prov, Traversal memiliki dua arah bisa dilakukan dari depan ke belakang maupun ke depan, Lebih boros memori, setiap node menyimpan 2 pointer, Lebih fleksibel untuk operasi insert, hapus, dan traversal dua arah, Bisa traversal mundur (ke node sebelumnya), Implementasi lebih kompleks, perlu update prev dan tidak boleh salah pointer.

2. Perhatikan class Node, di dalamnya terdapat atribut next dan prev. Jelaskan fungsi masing-masing atribut tersebut pada proses traversal dan manipulasi node!

   - Next berfungsi menyimpan referensi ke node berikutnya.

   - Prev berfungsi menyimpan referensi ke node sebelumnya.

3. Perhatikan konstruktor pada class DoubleLinkedList. Jelaskan fungsi konstruktor tersebut terhadap kondisi awal linked list!

   Konstruktor berfungsi untuk membuat linked list dalam kondisi kosong saat program mulai dijalankan.

4. Perhatikan potongan kode berikut:

   if (isEmpty()) {

   head = tail = newNode;

   }

   Mengapa head dan tail harus menunjuk node yang sama ketika linked list masih kosong?

   Karena saat linked list masih kosong dan data pertama dimasukkan, maka head menjadi node pertama dan tail menjadi node terakhir. Oleh karena itu, head dan tail harus menunjuk node yang sama karena hanya ada satu node di dalam linked list.
  
5. Modifikasi method print() agar menampilkan pesan "Linked List masih kosong" ketika tidak terdapat data pada linked list!

   ![img](https://github.com/user-attachments/assets/b2b06ab8-21de-4cb9-b453-df008e8dbbb6)

6. Modifikasi kode program dengan menambahkan method printReverse() untuk menampilkan seluruh data pada Double Linked List secara terbalik, dimulai dari node tail menuju head!

   ![img](https://github.com/user-attachments/assets/5621bf26-0d9b-4721-82b6-bcbeca5bff10)

   ![img](https://github.com/user-attachments/assets/b7e35e96-b785-4125-81bf-0f2f5eb30e1a)

   ![img](https://github.com/user-attachments/assets/b44b71fc-bb0a-48d2-887f-d07c1767d2eb)

## 12.3 Percobaan 2: Operasi Penghapusan pada Double Linked List

#### Code Program

![img](https://github.com/user-attachments/assets/711b79af-8edd-426a-826c-2ae754463271)

#### Hasil Running

![img](https://github.com/user-attachments/assets/e31fe518-4e8a-4b8f-835f-1d3d41c03be4)

Pertanyaan Percobaan
1. Perhatikan potongan kode berikut pada method removeFirst():

   head = head.next;

   head.prev = null;

   Jelaskan fungsi masing-masing statement tersebut pada proses penghapusan node!

   head = head.next; berfungsi untuk memindahkan head ke node berikutnya sehingga node pertama sebelumnya tidak lagi menjadi bagian dari linked list.

   head.prev = null; berfungsi untuk menghapus hubungan node baru dengan node sebelumnya agar node pertama yang lama benar-benar terlepas dari linked list.
   
2. Modifikasi method removeFirst() dan removeLast() agar program menampilkan data yang berhasil dihapus!

   ![img](https://github.com/user-attachments/assets/b9034d71-0e43-4723-8660-72fa9b6b5033)

## Tugas Praktikum

1. Tambahkan method add(int index, Mahasiswa data) untuk menambahkan node pada indeks tertentu!

2. Tambahkan method removeAfter() untuk menghapus node setelah node yang memiliki data key tertentu!

3. Tambahkan method remove(int index) untuk menghapus node pada indeks tertentu!

4. Tambahkan method:

   a. getFirst()

   b. getLast()

   c. getIndex()

   untuk menampilkan data pada node pertama, node terakhir, dan node pada indeks tertentu.

5. Tambahkan atribut dan method untuk menghitung jumlah data (size) pada Double Linked List.

#### Code Program

![img](https://github.com/user-attachments/assets/3ae1b3e1-7fe2-45ae-bede-6df5039a7609)

![img](https://github.com/user-attachments/assets/e32d96d8-6567-4dbe-8993-4b73a52a94a0)

![img](https://github.com/user-attachments/assets/2b9aa6d7-3e12-47f5-afbc-83b839903b3c)

![img](https://github.com/user-attachments/assets/42813da8-2dd1-455e-b725-da0dac4b9d24)

#### Hasil Running

![img](https://github.com/user-attachments/assets/021a8b2d-3ef5-434b-9eb4-4b1fb530de75)

![img](https://github.com/user-attachments/assets/f915fe58-cc05-44ee-b267-43b51629dc8f)

![img](https://github.com/user-attachments/assets/2714cd49-f09f-4eb1-8f95-47efd1f56951)

![img](https://github.com/user-attachments/assets/1bd3e7ad-fbd3-46ca-9ccb-f5b44bd4381b)

![img](https://github.com/user-attachments/assets/da2d3ba1-a9dd-48b5-9f1e-ff540abefe8a)
