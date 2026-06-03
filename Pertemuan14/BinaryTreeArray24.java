package Pertemuan14;

public class BinaryTreeArray24 {
    Mahasiswa24[] dataMahasiswa24;
    int idxLast24;

    public BinaryTreeArray24() {
        this.dataMahasiswa24 = new Mahasiswa24[10];
    }

    void populateData(Mahasiswa24 dataMhs[], int idxLast) {
        this.dataMahasiswa24 = dataMhs;
        this.idxLast24 = idxLast;
    }

    void traverseInOrder(int idxStart24) {
        if (idxStart24 <= idxLast24) {
            if (dataMahasiswa24[idxStart24] != null) {
                traverseInOrder(2 * idxStart24 + 1);
                dataMahasiswa24[idxStart24].tampilInformasi();
                traverseInOrder(2 * idxStart24 + 2);
            }
        }
    }

    void add(Mahasiswa24 dataMhs) {
        if (idxLast24 < dataMahasiswa24.length - 1) {
            idxLast24++;
            dataMahasiswa24[idxLast24] = dataMhs;
        } else {
            System.out.println("Array sudah penuh, tidak dapat menambahkan data.");
        }
    }

    void traversePreOrder(int idxStart24) {
        if (idxStart24 <= idxLast24) {
            if (dataMahasiswa24[idxStart24] != null) {
                dataMahasiswa24[idxStart24].tampilInformasi();
                traversePreOrder(2 * idxStart24 + 1);
                traversePreOrder(2 * idxStart24 + 2);
            }
        }
    }
}