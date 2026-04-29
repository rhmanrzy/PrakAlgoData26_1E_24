package TugasJobsheet10;

public class AntrianKRS {
    Mahasiswa[] data;
    int front;
    int rear;
    int size;
    int max;
    int sudahKRS;
    int totalDaftar;
    int maxPerDPA = 30;

    public AntrianKRS(int max){
        this.max = max;
        this.data = new Mahasiswa[max];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
        this.sudahKRS = 0;
        this.totalDaftar = 0;
    }

    public boolean IsEmpty(){
        return size == 0;
    }

    public boolean IsFull(){
        return size == max;
    }

    public void clear(){
        if (IsEmpty()) {
            System.out.println("Antrian sudah kosong.");
        } else{
            front = 0;
            rear = -1;
            size = 0;
            System.out.println("Antrian berhasil dikosongkan.");
        }
    }

    public void tambahAntrian(Mahasiswa mhs){
        if (IsFull()) {
            System.out.println("Antrian penuh");
            return;
        }
        if (sudahKRS >= maxPerDPA) {
            System.out.println("DPA sudah menangani " + maxPerDPA + " mahasiswa. Sesi selesai.");
            return;
        }
        rear = (rear + 1) % max;
        data[rear] = mhs;
        size++;
        totalDaftar++;
        System.out.println(mhs.nama + " berhasil masuk antrian. " + "Nomor antrian : " + size);
    }

    public void panggilAntrian(){
        if (IsEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("=== Memanggil Antrian untuk Proses KRS ===");
        int jumlahDipanggil = 0;
        while (!IsEmpty() && jumlahDipanggil < 2) {
            Mahasiswa mhs = data[front];
            front = (front + 1) % max;
            size--;
            sudahKRS++;
            jumlahDipanggil++;
            System.out.print("Mahasiswa : " + jumlahDipanggil + ": ");
            mhs.tampilkanData();
            System.out.println(mhs.nama + " sedang melakukan proses KRS.");
        }
        System.out.println("Total dipanggil sesi ini : " + jumlahDipanggil + " mahasiswa.");
    }

    public void tampilkanSemua(){
        if (IsEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("Daftar Antrian KRS : ");
        System.out.println("NIM - NAMA - PRODI - KELAS");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % max;
            System.out.print((i + 1) + ". ");
            data[index].tampilkanData();
        }
    }

    public void tampilkan2Depan(){
        if (IsEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("2 Mahasiswa Terdepan : ");
        System.out.println("NIM - NAMA - PRODI - KELAS");
        int tampil = Math.min(2, size);
        for (int i = 0; i < tampil; i++) {
            int index = (front + i) % max;
            System.out.print((i + 1) + ". ");
            data[index].tampilkanData();
        }
    }

    public void LihatAkhir(){
        if (IsEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("Mahasiswa paling akhir dalam antrian : ");
        data[rear].tampilkanData();
    }

    public int getJumlah(){
        return size;
    }

    public int getSudahKRS(){
        return sudahKRS;
    }

    public int getBelumKRS(){
        return totalDaftar - sudahKRS;
    }
}