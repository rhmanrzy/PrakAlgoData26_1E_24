package CM2;

public class DoubleLinkedListPembeli24 {
    NodePembeli24 head24;
    NodePembeli24 tail24;

    public DoubleLinkedListPembeli24() {
        head24 = null;
        tail24 = null;
    }

    public boolean isEmpty() {
        return head24 == null;
    }

    public void addLast(Pembeli24 data24) {
        NodePembeli24 newNode = new NodePembeli24(null, data24, null);
        if (isEmpty()) {
            head24 = tail24 = newNode;
        } else {
            tail24.next24 = newNode;
            newNode.prev24 = tail24;
            tail24 = newNode;
        }
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return;
        }
        NodePembeli24 current = head24;
        System.out.println("==============================================");
        System.out.println("             DAFTAR ANTRIAN PEMBELI           ");
        System.out.println("==============================================");
        System.out.printf("%-15s %-15s %-15s%n","No Antrian", "Nama", "No HP");
        System.out.println("==============================================");
        while (current != null) {
            System.out.printf("%-15d %-15s %-15s%n", current.data24.noAntrian24, current.data24.namaPembeli24, current.data24.noHp24);
            current = current.next24;
        }
        System.out.println("==============================================");
    }

    public Pembeli24 removeFirst() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return null;
        }
        Pembeli24 dataHapus = head24.data24;
        if (head24 == tail24) {
            head24 = null;
            tail24 = null;
        } else {
            head24 = head24.next24;
            head24.prev24 = null;
        }
        return dataHapus;
    }
}