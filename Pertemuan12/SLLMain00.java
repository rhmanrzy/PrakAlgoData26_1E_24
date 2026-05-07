package Pertemuan12;

public class SLLMain00 {
    public static void main(String[] args) {
        SingleLinkedList00 sll = new SingleLinkedList00();

        Mahasiswa00 mhs1 = new Mahasiswa00("2201", "Budi", "SIB-1B", 3.8);
        Mahasiswa00 mhs2 = new Mahasiswa00("2202", "Lia", "TI-1E", 3.9);
        Mahasiswa00 mhs3 = new Mahasiswa00("2203", "Raka", "SIB-1A", 3.5);
        Mahasiswa00 mhs4 = new Mahasiswa00("2204", "Rahma", "TI-1B", 3.8);

        sll.print();
        sll.addFirst(mhs4);
        sll.print();
        sll.addLast(mhs1);
        sll.print();
        sll.insertAfter("Budi", mhs3);
        sll.insertAt(2, mhs2);
        sll.print();
    }
}