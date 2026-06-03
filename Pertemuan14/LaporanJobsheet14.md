# Laporan Praktikum Algoritma dan Struktur Data Jobsheet 14 Tree

#### Nama : Rahma Aulia Nurrizky
#### NIM : 254107020168
#### Kelas : TI - 1E

## 14.2 Implementasi Binary Search Tree menggunakan Linked List

#### Code Program

![img](https://github.com/user-attachments/assets/181c8a6c-4a61-4c0d-ae80-4ee73363f424)

![img](https://github.com/user-attachments/assets/01efd6d5-4545-4e8e-9c71-4eb49f05225b)

![img](https://github.com/user-attachments/assets/982bb887-5b04-43a8-8e95-e3b50a2cd165)

![img](https://github.com/user-attachments/assets/17c99374-5ddc-43c6-9ce4-092c1cb0625a)

![img](https://github.com/user-attachments/assets/929b9893-8d91-495e-8b32-6835e838fb3e)

#### Hasil Running

![img](https://github.com/user-attachments/assets/6821cc1a-771b-4e33-b786-26f9d30f1756)

14.2.2 Pertanyaan Percobaan
1. Mengapa dalam binary search tree proses pencarian data bisa lebih efektif dilakukan dibanding binary tree biasa?

   Binary search tree lebih efektif karena data yang ada pada binary search tree tersusun secara urut, sehingga proses pencarian tidak perlu mengecek semua node dan pencarian lebih cepat.

2. Untuk apakah di class Node, kegunaan dari atribut left dan right?

   Left dan right untuk menyimpan anak kiri (lebih kecil) dan anak kanan (lebih besar).

3. a. Untuk apakah kegunaan dari atribut root di dalam class BinaryTree?

   Root digunakan sebagai titik awal (node utama) dalam sebuah binary tree.
   
   b. Ketika objek tree pertama kali dibuat, apakah nilai dari root?

   Saat tree pertama kali dibuat, nilai root adalah null karena belum ada node/data.

4. Ketika tree masih kosong, dan akan ditambahkan sebuah node baru, proses apa yang akan terjadi?

   Saat tree kosong dan ditambahkan node baru, node tersebut langsung menjadi root.

5. Perhatikan method add(), di dalamnya terdapat baris program seperti di bawah ini. Jelaskan secara detil untuk apa baris program tersebut?

   ![img](https://github.com/user-attachments/assets/620e56e7-b377-44f8-bff8-f01a8a26a53f)

   parent = current; = menyimpan node saat ini sebagai induk (parent) sebelum pindah ke node berikutnya.

   if (mahasiswa24.ipk24 < current.mahasiswa24.ipk24) = data baru lebih kecil dari node sekarang, maka diarahkan ke kiri.

   current = current.left24; = berpindah ke anak kiri untuk mencari posisi kosong.

   if (current == null) {
   
    parent.left24 = newNode;
   
    return;
   
   } = sudah menemukan tempat kosong di kiri, node baru dimasukkan sebagai anak kiri dari parent (induk).

   current = current.right24; = berpindah ke anak kanan.

   if (current == null) {
   
    parent.right24 = newNode;
   
    return;
   
   } = node baru dimasukkan sebagai anak kanan dari parent (induk).

6. Jelaskan langkah-langkah pada method delete() saat menghapus sebuah node yang memiliki dua anak. Bagaimana method getSuccessor() membantu dalam proses ini?

    Pada penghapusan node dengan 2 anak, node tidak langsung dihapus, tetapi diganti dengan inorder successor (nilai terkecil di subtree kanan). Method getSuccessor() digunakan untuk mencari node pengganti tersebut agar struktur Binary Search Tree tetap benar.

## 14.3 Implementasi Binary Tree dengan Array

#### Code Program

![img](https://github.com/user-attachments/assets/15526ff0-8951-419a-aaea-81937e598d5b)

![img](https://github.com/user-attachments/assets/85ea0d16-e561-4138-9d27-63894f468009)

#### Hasil Running

![img](https://github.com/user-attachments/assets/23828ff8-ce46-43c1-b944-c6bcbdd95245)

14.3.2 Pertanyaan Percobaan
1. Apakah kegunaan dari atribut data dan idxLast yang ada di class BinaryTreeArray?
   
   Data digunakan untuk menyimpan node - node binary tree dalam bentuk array.

   IdxLast digunakan untuk menyimpan indeks terakhir yang berisi data pada array.
   
2. Apakah kegunaan dari method populateData()?

   Method populateData() digunakan untuk mengisi data binary tree ke dalam array dan menentukan indeks terakhir yang berisi data.
   
3. Apakah kegunaan dari method traverseInOrder()?

   Method traverseInOrder() digunakan untuk menampilkan data tree dengan urutan : anak kiri ke root ke anak kanan.

4. Jika suatu node binary tree disimpan dalam array indeks 2, maka di indeks berapakah posisi left child dan right child masing-masing?

   Left child = 2 * idxStart + 1, maka (2 * 2) + 1 = 5

   Right child = 2 * idxStart + 2, maka (2 * 2) + 2 = 6
   
   Jadi, left child berada di indeks 5 dan right child berada di indeks 6.

5. Apa kegunaan statement int idxLast = 6 pada praktikum 2 percobaan nomor 4?

   Int idxLast = 6 menunjukkan data terakhir yang terisi berada pada indeks ke-6. Dengan begitu, program mengetahui batas data yang tersimpan dalam array dan tidak memproses indeks yang masih kosong.
   
6. Mengapa indeks 2*idxStart+1 dan 2*idxStart+2 digunakan dalam pemanggilan rekursif, dan apa kaitannya dengan struktur pohon biner yang disusun dalam array?

    Karena binary tree disimpan dalam bentuk array, posisi anak kiri dan anak kanan ditentukan berdasarkan indeks induknya. Rumus 2 * idxStart + 1 digunakan untuk mencari posisi anak kiri, dan 2 * idxStart + 2 digunakan untuk mencari posisi anak kanan. Dengan cara ini, hubungan antara induk dan anak dalam pohon tetap terjaga meskipun data disimpan dalam array.

14.4 Tugas Praktikum
1. Buat method di dalam class BinaryTree00 yang akan menambahkan node dengan cara rekursif (addRekursif()).
2. Buat method di dalam class BinaryTree00 untuk menampilkan data mahasiswa dengan IPK paling kecil dan IPK yang paling besar (cariMinIPK() dan cariMaxIPK()) yang ada di dalam binary search tree.
3. Buat method dalam class BinaryTree00 untuk menampilkan data mahasiswa dengan IPK di atas suatu batas tertentu, misal di atas 3.50 (tampilMahasiswaIPKdiAtas(double ipkBatas)) yang ada di dalam binary search tree.
4. Modifikasi class BinaryTreeArray00 di atas, dan tambahkan :
• method add(Mahasiswa data) untuk memasukkan data ke dalam binary tree
• method traversePreOrder()

#### Code Program

Binary Tree

![img](https://github.com/user-attachments/assets/1c05630b-27ba-4c07-a4e9-fc4f3f9a6ddf)

![img](https://github.com/user-attachments/assets/3896529b-fe62-442a-bfef-624bf660c287)

Binary Tree Array

![img](https://github.com/user-attachments/assets/504f0a7b-8ef3-4719-a001-addbbdb47a21)

![img](https://github.com/user-attachments/assets/b8ac0ab9-552a-4c3f-8b8b-ed023e7abe50)

#### Hasil Running

Binary Tree Array

![img](https://github.com/user-attachments/assets/a9af0f83-9bc6-411d-aa51-6deaa97c6d39)

Binary Tree

![img](https://github.com/user-attachments/assets/2507abd6-a9dc-481d-b3e5-91bce604c62b)
