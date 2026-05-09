package Pertemuan12.AntrianLayananUnitKemahasiswaan;

public class LinkedList24 {
    Node24 front;
    Node24 rear;
    int size = 0;
    int max = 10;

    boolean isEmpty() {
        return front == null;
    }

    boolean isFull() {
        return size == max;
    }

    public void enqueue(Mahasiswa24 mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh");
            return;
        }
        Node24 baru = new Node24(mhs);
        if (isEmpty()) {
            front = baru;
            rear = baru;
        } else {
            rear.next = baru;
            rear = baru;
        }
        size++;
        System.out.println(mhs.nama + " berhasil masuk antrian");
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return;
        }
        System.out.println("Mahasiswa dipanggil : ");
        front.data.tampilkanData();
        front = front.next;
        size--;
        if (front == null) {
            rear = null;
        }
    }

    public void peekFront() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            System.out.println("Antrian terdepan : ");
            front.data.tampilkanData();
        }
    }

    public void peekRear() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            System.out.println("Antrian terakhir : ");
            rear.data.tampilkanData();
        }
    }

    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            Node24 temp = front;
            System.out.println("Daftar antrian : ");
            while (temp != null) {
                temp.data.tampilkanData();
                temp = temp.next;
            }
        }
    }

    public void clear() {
        front = null;
        rear = null;
        size = 0;
        System.out.println("Antrian berhasil dikosongkan");
    }

    public void jumlahAntrian() {
        System.out.println("Jumlah mahasiswa yang masih mengantri : " + size);
    }
}