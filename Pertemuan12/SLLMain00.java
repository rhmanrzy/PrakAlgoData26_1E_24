package Pertemuan12;

public class SLLMain00 {
    public static void main(String[] args) {
        SingleLinkedList00 sll = new SingleLinkedList00();

        Mahasiswa00 mhs1 = new Mahasiswa00("2201", "Budi", "SIB-1B", 3.8);
        Mahasiswa00 mhs2 = new Mahasiswa00("2202", "Lia", "TI-1E", 3.9);
        Mahasiswa00 mhs3 = new Mahasiswa00("2203", "Raka", "SIB-1A", 3.5);
        Mahasiswa00 mhs4 = new Mahasiswa00("2204", "Rahma", "TI-1B", 3.8);

        sll.addLast(mhs1);
        sll.addLast(mhs2);
        sll.addLast(mhs3);
        sll.addLast(mhs4);

        System.out.println("data index 1 : ");
        sll.getData(1);

        System.out.println("data mahasiswa an Raka berada pada index : " + sll.indexOf("Raka"));
        System.out.println();

        sll.removeFirst();
        sll.removeLast();
        sll.print();
        sll.removeAt(0);
        sll.print();
    }
}