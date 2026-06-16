package P16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;

public class ListMahasiswa {
    List<Mahasiswa> mahasiswas = new ArrayList<>();

    public void tambah(Mahasiswa... mahasiswa) {
        mahasiswas.addAll(Arrays.asList(mahasiswa));
    }

    public void hapus(int index) {
        mahasiswas.remove(index);
    }

    public void update(int index, Mahasiswa mhs) {
        mahasiswas.set(index, mhs);
    }

    public void tampil() {
        mahasiswas.stream().forEach(mhs -> {
            System.out.println("" + mhs.toString());
        });
    }

    public int binarySearch(String nim) {
        Collections.sort(mahasiswas, java.util.Comparator.comparing(m -> m.nim));
        Mahasiswa key = new Mahasiswa(nim, "", "");
        return Collections.binarySearch(mahasiswas, key, Comparator.comparing(m -> m.nim));
    }

    public void sortingAsc() {
        Collections.sort(mahasiswas, (a, b) -> a.nama.compareTo(b.nama));
    }

    public void sortingDesc() {
        Collections.sort(mahasiswas, (a, b) -> b.nama.compareTo(a.nama));
    }

    public static void main(String[] args) {
        ListMahasiswa lm = new ListMahasiswa();
        Mahasiswa m = new Mahasiswa("201234", "Noureen", "021xx1");
        Mahasiswa m1 = new Mahasiswa("201235", "Akhleema", "021xx2");
        Mahasiswa m2 = new Mahasiswa("201236", "Shannum", "021xx3");
        lm.tambah(m, m1, m2);
        lm.tampil();
        lm.update(lm.binarySearch("201235"), new Mahasiswa("201235", "Akhleema Lela", "021xx2"));
        System.out.println("");
        lm.tampil();;
        System.out.println("\nData setelah sorting ascending: ");
        lm.sortingAsc();
        lm.tampil();
        System.out.println("\nData setelah sorting descending: ");
        lm.sortingDesc();
        lm.tampil();
    }
}