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

![img](https://github.com/user-attachments/assets/3224a038-4339-4c22-a772-e4e2bc4b1937)

![img](https://github.com/user-attachments/assets/f9e07944-3110-4967-8168-977644ad161b)

![img](https://github.com/user-attachments/assets/11cd3fe5-8867-471c-b5ef-bde47bc927db)

![img](https://github.com/user-attachments/assets/2658b356-2cc8-4153-bf7e-6be83619e760)

#### Hasil Running

![img](https://github.com/user-attachments/assets/54265218-578b-46e4-a811-a243e1d65588)

![img](https://github.com/user-attachments/assets/58457628-6100-471b-8fa6-4569a9db07be)

![img](https://github.com/user-attachments/assets/01ac1be8-5197-4d01-9374-f3a666d2dcf1)

![img](https://github.com/user-attachments/assets/1bd5cfac-1aba-450c-a63e-0ddb344793c7)

![img](https://github.com/user-attachments/assets/f41affa4-62c1-4e5b-8101-1c7caa8264a8)

![img](https://github.com/user-attachments/assets/f9461b8d-273c-46b3-9563-e8cdc386bec2)
