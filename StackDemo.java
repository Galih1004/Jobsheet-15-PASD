import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {

        // ── Langkah 2 & 3: buat buku dan push ke stack ──
        Book book1 = new Book("1234", "Dasar Pemrograman");
        Book book2 = new Book("7145", "Hafalah Shalat Delisa");
        Book book3 = new Book("3562", "Muhammad Al-Fatih");

        Stack<Book> books = new Stack<>();
        books.push(book1);
        books.push(book2);
        books.push(book3);

        // ── Langkah 4: peek ──
        System.out.println("=== peek() ===");
        Book temp = books.peek();
        if (temp != null) {
            System.out.println(temp.toString());
        }

        // pop - mengambil dan menghapus dari top
        System.out.println("\n=== pop() ===");
        Book temp2 = books.pop();
        if (temp2 != null) {
            System.out.println(temp2.toString());
        }
        // Langkah 5: pengecekan (temp != null) diperlukan agar tidak terjadi

        // ── Langkah 6: looping cetak semua buku ──
        System.out.println("\n=== Semua buku di stack (langkah 6) ===");
        for (Book book : books) {
            System.out.println(book.toString());
        }
        // ── Langkah 7: cetak langsung ──
        System.out.println("\n=== Print langsung (langkah 7) ===");
        System.out.println(books);

        // ── Langkah 8: search ──
        System.out.println("\n=== search() (langkah 8) ===");
        int pos = books.search(book1);
        System.out.println("Posisi book1 dari top: " + pos);
        // book1 = Dasar Pemrograman, berada di bottom (index 1 dari top = posisi 1)
    }
}