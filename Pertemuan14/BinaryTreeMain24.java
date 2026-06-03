package Pertemuan14;

public class BinaryTreeMain24 {
    public static void main(String[] args) {
        BinaryTree24 bst = new BinaryTree24();

        bst.add(new Mahasiswa24("244160121", "Ali", "A", 3.57));
        bst.add(new Mahasiswa24("244160221", "Badar", "B", 3.85));
        bst.add(new Mahasiswa24("244160185", "Candra", "C", 3.21));
        bst.add(new Mahasiswa24("244160220", "Dewi", "D", 3.54));

        System.out.println("\nDaftar semua mahasiswa (in order traversal) : ");
        bst.traverseInOrder(bst.root24);
        
        System.out.println("\nPencarian data mahasiswa : ");
        System.out.print("Cari mahasiswa dengan ipk : 3.54 : ");
        String hasilCari = bst.find(3.54) ? "Ditemukan" : "Tidak Ditemukan";
        System.out.println(hasilCari);

        System.out.print("Cari mahasiswa dengan ipk : 3.22 : ");
        hasilCari = bst.find(3.22) ? "Ditemukan" : "Tidak Ditemukan";
        System.out.println(hasilCari);

        bst.add(new Mahasiswa24("244160131", "Devi", "A", 3.72));
        bst.add(new Mahasiswa24("244160205", "Ehsan", "D", 3.37));
        bst.add(new Mahasiswa24("244160170", "Fizi", "B", 3.46));
        System.out.println("\nDaftar semua mahasiswa setelah penambahan 3 mahasiswa : ");
        System.out.println("In order traversal : ");
        bst.traverseInOrder(bst.root24);
        System.out.println("\nPre order traversal : ");
        bst.traversePreOrder(bst.root24);
        System.out.println("\nPost order traversal : ");
        bst.traversePostOrder(bst.root24);

        System.out.println("\nPenghapusan data mahasiswa");
        bst.delete(3.57);
        System.out.println("\nDaftar semua mahasiswa setelah penghapusan 1 mahasiswa dengan (in order traversal) : ");
        bst.traverseInOrder(bst.root24);

        System.out.println("\nMahasiswa dengan IPK paling kecil : ");
        bst.cariMinIPK();
        System.out.println("\nMahasiswa dengan IPK paling besar : ");
        bst.cariMaxIPK();
        System.out.println("\nMahasiswa dengan IPK di atas 3.50 : ");
        bst.tampilMahasiswaIPKDiAtas(3.50);
    }
}