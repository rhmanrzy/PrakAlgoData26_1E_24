package Pertemuan14;

public class BinaryTree24 {
    Node24 root24;

    public BinaryTree24() {
        root24 = null;
    }

    public boolean isEmpty() {
        return root24 == null;
    }

    public void add(Mahasiswa24 mahasiswa24) {
        Node24 newNode = new Node24(mahasiswa24);

        if (isEmpty()) {
            root24 = newNode;
        } else {
            Node24 current = root24;
            Node24 parent = null;

            while (true) {
                parent = current;

                if (mahasiswa24.ipk24 < current.mahasiswa24.ipk24) {
                    current = current.left24;

                    if (current == null) {
                        parent.left24 = newNode;
                        return;
                    }
                } else {
                    current = current.right24;

                    if (current == null) {
                        parent.right24 = newNode;
                        return;
                    }
                }
            }
        }
    }

    boolean find(double ipk24) {
        boolean result = false;
        Node24 current = root24;

        while (current != null) {
            if (current.mahasiswa24.ipk24 == ipk24) {
                result = true;
                break;
            } else if (ipk24 < current.mahasiswa24.ipk24) {
                current = current.right24;
            } else {
                current = current.left24;
            }
        }

        return result;
    }

    void traversePreOrder(Node24 node24) {
        if (node24 != null) {
            node24.mahasiswa24.tampilInformasi();
            traversePreOrder(node24.left24);
            traversePreOrder(node24.right24);
        }
    }

    void traverseInOrder(Node24 node24) {
        if (node24 != null) {
            traverseInOrder(node24.left24);
            node24.mahasiswa24.tampilInformasi();
            traverseInOrder(node24.right24);
        }
    }

    void traversePostOrder(Node24 node24) {
        if (node24 != null) {
            traversePostOrder(node24.left24);
            traversePostOrder(node24.right24);
            node24.mahasiswa24.tampilInformasi();
        }
    }

    Node24 getSuccessor(Node24 delNode) {
        Node24 successor = delNode.right24;
        Node24 successorParent = delNode;

        while (successor.left24 != null) {
            successorParent = successor;
            successor = successor.left24;
        }

        if (successor != delNode.right24) {
            successorParent.left24 = successor.right24;
            successor.right24 = delNode.right24;
        }

        return successor;
    }

    void delete(double ipk24) {
        if (isEmpty()) {
            System.out.println("Binary tree kosong");
            return;
        }
        Node24 parent = root24;
        Node24 current = root24;
        boolean isLeftChild = false;
        while (current != null) {
            if (current.mahasiswa24.ipk24 == ipk24) {
                break;
            } else if (ipk24 < current.mahasiswa24.ipk24) {
                parent = current;
                current = current.left24;
                isLeftChild = true;
            } else if (ipk24 > current.mahasiswa24.ipk24) {
                parent = current;
                current = current.right24;
                isLeftChild = false;
            }
        }
        if (current == null) {
            System.out.println("Data tidak ditemukan");
            return;
        } else {
            if (current.left24 == null && current.right24 == null) {
                if (current == root24) {
                    root24 = null;
                } else {
                    if (isLeftChild) {
                        parent.left24 = null;
                    } else {
                        parent.right24 = null;
                    }
                }
            } else if (current.left24 == null) {
                if (current == root24) {
                    root24 = current.right24;
                } else {
                    if (isLeftChild) {
                        parent.left24 = current.right24;
                    } else {
                        if (isLeftChild) {
                            parent.left24 = current.right24;
                        } else {
                            parent.right24 = current.right24;
                        }
                    }
                }
            } else if (current.right24 == null) {
                if (current == root24) {
                    root24 = current.left24;
                } else {
                    if (isLeftChild) {
                        parent.left24 = current.left24;
                    } else {
                        parent.right24 = current.left24;
                    }
                }
            } else {
                Node24 successor = getSuccessor(current);
                System.out.println("Jika 2 anak, current = ");
                successor.mahasiswa24.tampilInformasi();
                if (current == root24) {
                    root24 = successor;
                } else { 
                    if (isLeftChild) {
                        parent.left24 = successor;
                    } else {
                        parent.right24 = successor;
                    }
                }
                successor.left24 = current.left24;
            }
        }
    }
}