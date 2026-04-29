package Jobsheet9;

class StackSurat24 {
    Surat24[] stack;
    int top;
    int size;

    Surat24[] history;
    int topHistory;

    public StackSurat24(){
        this.size = 10;
        stack = new Surat24[size];
        history = new Surat24[size];
        top = -1;
        topHistory = -1;
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public boolean isFull(){
        return top == size - 1;
    }

    public void push(Surat24 s){
        if (isFull()) {
            System.out.println("Stack penuh!");
        } else{
            top++;
            stack[top] = s;
        }
    }

    public Surat24 pop(){
        if (isEmpty()) {
            System.out.println("Stack kosong");
            return null;
        } else{
            Surat24 s = stack[top];
            top--;
            topHistory++;
            history[topHistory] = s;
            return s;
        }
    }

    public Surat24 peek(){
        if (isEmpty()) {
            System.out.println("Stack kosong");
            return null;
        } else{
            return stack[top];
        }
    }

    public void cari(String nama){
        boolean ketemu = false;
        for(int i =0; i <= top; i++){
            if (stack[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                System.out.println("Ditemukan (belum diproses) : ");
                stack[i].tampilSurat();
                ketemu = true;
            }
        }
        for (int i = 0; i <= topHistory; i++) {
            if (history[i] != null && history[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                System.out.println("Ditemukan (sudah diproses) : ");
                history[i].tampilSurat();
                ketemu = true;
            }
        }
        if (!ketemu) {
            System.out.println("Data tidak ditemukan");
        }
    }
}