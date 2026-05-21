package CM2;

public class DoubleLinkedListPesanan24 {
    NodePesanan24 head24;
    NodePesanan24 tail24;

    public DoubleLinkedListPesanan24() {
        head24 = null;
        tail24 = null;
    }

    public boolean isEmpty() {
        return head24 == null;
    }

    public void addLast(Pesanan24 data24) {
        NodePesanan24 newNode = new NodePesanan24(null, data24, null);
        if (isEmpty()) {
            head24 = tail24 = newNode;
        } else {
            tail24.next24 = newNode;
            newNode.prev24 = tail24;
            tail24 = newNode;
        }
    }

    public void sortByNamaPesanan() {
        if (isEmpty()) {
            return;
        }
        NodePesanan24 current = head24;
        while (current != null) {
            NodePesanan24 index = current.next24;
            while (index != null) {
                if (current.data24.namaPesanan24.compareToIgnoreCase(index.data24.namaPesanan24) > 0) {
                    Pesanan24 temp = current.data24;
                    current.data24 = index.data24;
                    index.data24 = temp;
                }
                index = index.next24;
            }
            current = current.next24;
        }
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Belum ada pesanan");
            return;
        }
        NodePesanan24 current = head24;
        System.out.println("======================================================");
        System.out.println("           Laporan Pesanan (Urut Nama Pesanan)        ");
        System.out.println("======================================================");
        System.out.printf("%-15s %-20s %-10s%n","Kode", "Nama Pesanan", "Harga");
        System.out.println("======================================================");
        while (current != null) {
            System.out.printf("%-15d %-20s %-10d%n", current.data24.kodePesanan24, current.data24.namaPesanan24, current.data24.harga24);
            current = current.next24;
        }
        System.out.println("======================================================");
    }
}