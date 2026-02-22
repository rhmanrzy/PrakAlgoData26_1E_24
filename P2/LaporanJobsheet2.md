# Laporan Praktikum Algoritma dan Struktur Data Jobsheet 2 Object

#### Nama : Rahma Aulia Nurrizky
#### NIM : 254107020168
#### Kelas : TI - 1E

## 2.1 Percobaan 1 : Deklarasi Class, Atribut dan Method

#### Code Program
![img](https://github.com/user-attachments/assets/3d14cb5a-a82f-4794-9e2c-808c079cc8f6)

#### Hasil Running
![img](https://github.com/user-attachments/assets/9c80ba44-913b-450c-b8f5-8a42893eafa8)

Pertanyaan
1. Sebutkan dua karakteristik class atau object!
   - atribut => data yang memiliki object.
   - method => aksi atau fungsi yang bisa dilakukan object.
     
2. Perhatikan class Mahasiswa pada Praktikum 1 tersebut, ada berapa atribut yang dimiliki oleh class Mahasiswa? Sebutkan apa saja atributnya!

   String nama;

   String nim;

   String kelas;

   double ipk;
   
3. Ada berapa method yang dimiliki oleh class tersebut? Sebutkan apa saja methodnya!

   ada 4, yaitu:
   
   - tampilkanInformasi()
     
   - ubahKelas(String kelasBaru)
     
   - updateIpk(double ipkBaru)
     
   - nilaiKinerja()
     
4. Perhatikan method updateIpk() yang terdapat di dalam class Mahasiswa. Modifikasi isi method tersebut sehingga IPK yang dimasukkan valid yaitu terlebih dahulu dilakukan pengecekan apakah IPK yang dimasukkan di dalam rentang 0.0 sampai dengan 4.0 (0.0 <= IPK <= 4.0). Jika IPK tidak pada rentang tersebut maka dikeluarkan pesan: "IPK tidak valid. Harus antara 0.0 dan 4.0".

   ![img](https://github.com/user-attachments/assets/159bc419-e1da-4e3c-bc51-7b4d579d4fe6)

5. Jelaskan bagaimana cara kerja method nilaiKinerja() dalam mengevaluasi kinerja mahasiswa, kriteria apa saja yang digunakan untuk menentukan nilai kinerja tersebut, dan apa yang dikembalikan (di-return-kan) oleh method nilaiKinerja() tersebut?

   menggunakan if-else untuk mengecek nilai IPK dari yang tertinggi ke terendah.
   - ipk >= 3.5 maka hasilnya "Kinerja sangat baik"
   - ipk >= 3.0 maka hasilnya "Kinerja baik"
   - ipk >= 2.0 maka hasilnya "Kinerja cukup"
   - ipk < 2.0 maka hasilnya "Kinerja kurang"

## 2.2 Percobaan 2 : Instansiasi Object, serta Mengakses Atribut dan Method

#### Code Program
![img](https://github.com/user-attachments/assets/787f6972-071a-466b-b614-7f4ec2eea6c4)

#### Hasil Running
![img](https://github.com/user-attachments/assets/d6af9f7f-3cbf-42db-9741-7adb5c3f5148)

Pertanyaan
1. Pada class MahasiswaMain, tunjukkan baris kode program yang digunakan untuk proses instansiasi! Apa nama object yang dihasilkan?

   ![img](https://github.com/user-attachments/assets/dcb123c4-ee93-455c-af3c-bb810c49feb8)

   object yang dihasilkan yaitu "mhs1".

2. Bagaimana cara mengakses atribut dan method dari suatu objek?

   atribut dan method diakses menggunakan tanda titik (.) setelah nama object.

   contoh mengakses atribut
   
   ![img](https://github.com/user-attachments/assets/b3b0f306-cf73-40c9-b51c-6b30adc97539)

   contoh mengakses method
   
   ![imh](https://github.com/user-attachments/assets/51340ea5-be03-4edd-99c6-3af0f3554e17)
  
   hasilnya
   
   ![img](https://github.com/user-attachments/assets/b7d0f089-bad9-449f-9b98-656ce7dfdbbf)

3. Mengapa hasil output pemanggilan method tampilkanInformasi() pertama dan kedua berbeda?

   karena terjadi perubahan data pada object sebelum pemanggilan kedua.

## 2.3 Percobaan 3 : Membuat Konstruktor

#### Code Program 1
![img](https://github.com/user-attachments/assets/a6d6a728-eb2c-4d84-afc1-07a4f4479d7d)

#### Code Program 2
![img](https://github.com/user-attachments/assets/871d6dad-0119-4499-8b87-da019afacd64)

#### Hasil Running 2
![img](https://github.com/user-attachments/assets/aa7f615a-5290-4ae6-8154-6fe55e411abe)

Pertanyaan
1. Pada class Mahasiswa di Percobaan 3, tunjukkan baris kode program yang digunakan untuk mendeklarasikan konstruktor berparameter!

   public Mahasiswa24(String nm, String nim, double ipk, String kls){

   }
   
2. Perhatikan class MahasiswaMain. Apa sebenarnya yang dilakukan pada baris program berikut?
   
   ![img](https://github.com/user-attachments/assets/f424e255-4858-4c4f-b6f9-3f3793070b25)

   untuk membuat object bernama mhs2 dari class Mahasiswa24 sekaligus menginisialisasi atributnya melalui konstruktor berparameter.

3. Hapus konstruktor default pada class Mahasiswa, kemudian compile dan run program. Bagaimana hasilnya? Jelaskan mengapa hasilnya demikian!

   error, karena tidak ada konstruktor.

4. Setelah melakukan instansiasi object, apakah method di dalam class Mahasiswa harus diakses secara berurutan? Jelaskan alasannya!

   tidak, method dalam class tidak harus dilakukan secara berurutan. Method dijalankan sesuai dengan urutan pemanggilan di dalam program (main). 
  
5. Buat object baru dengan nama mhs<NamaMahasiswa> menggunakan konstruktor berparameter dari class Mahasiswa!
   
   ![img](https://github.com/user-attachments/assets/f800c335-1b44-45ca-898a-a520885330c5)

   hasil
   
   ![img](https://github.com/user-attachments/assets/4a5159a4-8f81-4183-9f00-5356f0355088)

## 2.4 Latihan Praktikum

1. Diberikan class diagram dari class MataKuliah sebagai berikut :
   
   ![img](https://github.com/user-attachments/assets/4d30cbdc-eaca-45db-b0eb-0a9e254c4ba2)

   Buat program untuk mengimplementasikan class MataKuliah berdasarkan class diagram di atas, yang terdiri dari:
    - Class MataKuliah (MataKuliah<NoAbsen>.java)
    
    - Class MataKuliahMain (MataKuliahMain<NoAbsen>.java)
   
   Pada class MataKuliahMain buatlah minimal 2 objek. Gunakan konstruktor default dan konstruktor berparameter saat mengintansiasi objek. Lalu panggil semua method yang sudah dibuat pada class MataKuliah. Penjelasan dari atribut dan method pada class MataKuliah tersebut adalah sebagai berikut:
   
    a. Atribut
   
      • kodeMK (String): kode unik untuk mata kuliah.
   
      • nama (String): nama lengkap dari mata kuliah
   
      • sks (int): SKS (Satuan Kredit Semester)
   
      • jumlahJam (int): jumlah total jam pertemuan per minggu untuk mata kuliah
   
    b. Method
   
      • tampilInformasi(): method ini digunakan untuk menampilkan semua informasi yang berkaitan dengan mata kuliah.
   
      • ubahSKS(int sksBaru): method ini memungkinkan pengubahan nilai SKS untuk mata kuliah. Setelah mengubah nilai, method ini memberi tahu pengguna bahwa SKS telah diubah.
   
      • tambahJam(int jam): method ini menambahkan jumlah jam tambahan ke jumlah jam yang sudah ada untuk mata kuliah.
   
      • kurangiJam(int jam): method ini berfungsi untuk mengurangi jumlah jam dari mata kuliah. Sebelum mengurangi, method ini melakukan pengecekan untuk memastikan bahwa jumlah jam yang tersisa cukup untuk dikurangi. Jika jumlah jam tidak mencukupi (jumlah jam awal lebih kecil dari jam pengurang), method ini akan memberi tahu pengguna bahwa pengurangan tidak dapat dilakukan. Jika pengurangan berhasil, method ini mengupdate jumlah jam dan mencetak nilai jumlah jam yang baru.

    #### Code Program
    ![img](https://github.com/user-attachments/assets/678568df-fbce-4a60-96ff-cdc744f46ee4)
   
    ![img](https://github.com/user-attachments/assets/fefa68f5-8e84-46b2-b775-2a01da28c06c)

    #### Hasil Running
    ![img](https://github.com/user-attachments/assets/9e5d2be3-9c56-4f04-9a2d-b958ad81769c)

2. Diberikan class diagram dari class Dosen sebagai berikut :
   
   ![img](https://github.com/user-attachments/assets/01ecb285-8e32-42c5-a3eb-aecc75e2881f)

   Buat program untuk mengimplementasikan class Dosen berdasarkan class diagram di atas, yang terdiri dari:
    - Class Dosen (Dosen<NoAbsen>.java)
      
    - Class DosenMain (DosenMain<NoAbsen>.java)
      
   Pada class DosenMain buatlah minimal 2 objek. Gunakan konstruktor default dan konstruktor berparameter saat mengintansiasi objek. Lalu panggil semua method yang sudah dibuat pada class Dosen Penjelasan dari atribut dan method pada class Dosen tersebut adalah sebagai berikut:
    a. Atribut
   
      • idDosen (String): id unik untuk setiap dosen.
   
      • nama (String): nama lengkap dari dosen.
   
      • statusAktif (boolean): menunjukkan apakah dosen tersebut aktif (true) atau tidak aktif (false) dalam menjalankan tugasnya.
   
      • tahunBergabung (int): tahun ketika dosen mulai bergabung dengan perguruan tinggi

      • bidangKeahlian (String): bidang keahlian dosen, yang menjelaskan spesialisasi atau fokus akademik dosen

    b. Method
   
     • tampilInformasi(): method ini digunakan untuk menampilkan informasi lengkap tentang dosen
   
     • setStatusAktif(status: boolean): method ini digunakan untuk mengatur status aktif dosen. Jika parameter status diatur ke true, berarti dosen tersebut menjadi aktif. Sebaliknya, jika false, dosen tersebut dinyatakan tidak aktif.

     • hitungMasaKerja(thnSkrg: int): method ini menghitung dan mengembalikan (me-return- kan) masa kerja dosen dalam tahun, berdasarkan tahun bergabung dan tahun saat ini (thnSkrg) yang menjadi parameter input method ini. Hasil perhitungan memberikan informasi tentang lamanya dosen bekerja di perguruan tinggi.

     • ubahKeahlian(bidang: String): method ini digunakan untuk mengubah bidang keahlian dosen.

   #### Code Program
   ![img](https://github.com/user-attachments/assets/c60d2ea1-f985-4b97-92e1-b8737d0d31e1)

   ![img](https://github.com/user-attachments/assets/94a0c8b4-e720-44a7-b3c3-7e3bb0de561c)

   #### Hasil Running
   ![img](https://github.com/user-attachments/assets/dc1d4663-3c93-473c-aea9-1dd3e752467a)
