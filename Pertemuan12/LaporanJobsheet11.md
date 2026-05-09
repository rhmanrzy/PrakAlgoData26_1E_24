# Laporan Praktikum Algoritma dan Struktur Data Jobsheet 11 LINKED LIST

#### Nama : Rahma Aulia Nurrizky
#### NIM : 254107020168
#### Kelas : TI - 1E

## 2.1 Pembuatan Single Linked List

#### Code Program

![img](https://github.com/user-attachments/assets/2967ecb5-60ee-45cb-a5a8-5744ba4e3e44)

![img](https://github.com/user-attachments/assets/05e79192-0fea-4814-b0f2-0f88f924e594)

![img](https://github.com/user-attachments/assets/c6444a8a-3672-4d73-b8e9-63779bb5f929)

![img](https://github.com/user-attachments/assets/c2ec3d22-80db-406f-bffd-09482649c0bf)

#### Hasil Running

![img](https://github.com/user-attachments/assets/9ec1e03c-0c2b-4fcb-811e-8fa26675c1ef)

Pertanyaan

1. Mengapa hasil compile kode program di baris pertama menghasilkan “Linked List Kosong”?

   karena pada awal program belum ada node atau data yang dimasukkan ke dalam linked lish, sehingga nilai head masih null dan program menampilkan pesan "Linked List Kosong".
   
2. Jelaskan kegunaan variable temp secara umum pada setiap method!

   variabel temp digunakan sebagai penunjuk semestara untuk menelusuri node pada linked list tanpa mengubah posisi head.
   
3. Lakukan modifikasi agar data dapat ditambahkan dari keyboard!

   ![img](https://github.com/user-attachments/assets/5cc4b8a0-eb83-4a72-b93f-eadd5ef5d7bc)

## 2.2 Modifikasi Elemen pada Single Linked List

#### Code Program

![img](https://github.com/user-attachments/assets/083a8fef-7b86-4eb8-bb04-d08be199011b)

![img](https://github.com/user-attachments/assets/64d24a91-8461-440e-95bc-5beeca8d8676)

![img](https://github.com/user-attachments/assets/4bcbaab0-ab26-436a-b96e-c6de91c8d7be)

#### Hasil Running

![img](https://github.com/user-attachments/assets/13e127ea-f452-49d6-bec1-f51d3abf077a)

Pertanyaan

1. Mengapa digunakan keyword break pada fungsi remove? Jelaskan!

   keyword break digunakan untuk menghentikan perulangan setelah data berhasil ditemukan dan dihapus, sehingga program tidak melanjutkan pencarian yang tidak diperlukan.
   
2. Jelaskan kegunaan kode dibawah pada method remove

   ![img](https://github.com/user-attachments/assets/789f0df6-c16c-4560-8de0-2c1bc3675bf3)

   temp.next = temp.next.next;

   digunakan untuk menghapus node dengan cara melewati node yang akan dihapus, sehingga node tersebut tidak lagi terhubung pada linked list.

   if (temp.next == null) {
   tail = temp;
   }

   digunakan untuk mengecek apakah node yang dihapus adalah node terakhir. jika iya, maka tail dipindahkan ke node sebelumnya agar penunjuk akhir linked list tetap benar.
   
## Tugas

Buatlah implementasi program antrian layanan unit kemahasiswaan sesuai dengan berikut ini :

a. Implementasi antrian menggunakan Queue berbasis Linked List!

b. Program merupakan proyek baru bukan modifikasi dari percobaan

c. Ketika seorang mahasiswa akan mengantri, maka dia harus mendaftarkan datanya

d. Cek antrian kosong, Cek antrian penuh, Mengosongkan antrian.

e. Menambahkan antrian

f. Memanggil antrian

g. Menampilkan antrian terdepan dan antrian paling akhir

h. Menampilkan jumlah mahasiswa yang masih mengantre.
