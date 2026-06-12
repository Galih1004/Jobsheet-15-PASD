import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {

        // ── Langkah 2 & 3: TreeSet of String ──
        TreeSet<String> fruits = new TreeSet<>();
        fruits.add("Mangga");
        fruits.add("Apel");
        fruits.add("Jeruk");
        fruits.add("Jambu");

        System.out.println("=== TreeSet fruits (langkah 3) ===");
        for (String temp : fruits) {
            System.out.println(temp);
        }
        // Langkah 4: urutan berbeda karena TreeSet menyimpan elemen secara

        // ── Langkah 5: first, last, remove, pollFirst, pollLast ──
        System.out.println("\n=== Method TreeSet (langkah 5) ===");
        System.out.println("First: " + fruits.first());    // elemen terkecil
        System.out.println("Last: "  + fruits.last());     // elemen terbesar

        fruits.remove("Jeruk");
        System.out.println("Setelah remove " + fruits);

        fruits.pollFirst();
        System.out.println("Setelah poll first " + fruits);

        fruits.pollLast();
        System.out.println("Setelah poll last " + fruits);

        // Langkah 6:
        // first()     → mengembalikan elemen pertama (terkecil), tidak menghapus
        // last()      → mengembalikan elemen terakhir (terbesar), tidak menghapus
        // remove(obj) → menghapus elemen tertentu, mengembalikan boolean
        // pollFirst() → mengambil DAN menghapus elemen pertama (terkecil)
        // pollLast()  → mengambil DAN menghapus elemen terakhir (terbesar)
    }
}