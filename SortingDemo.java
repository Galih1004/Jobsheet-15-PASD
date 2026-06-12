import java.util.ArrayList;
import java.util.Collections;

public class SortingDemo {
    public static void main(String[] args) {

        // ── Sorting data primitif / String ──
        ArrayList<String> daftarSiswa = new ArrayList<>();
        daftarSiswa.add("Zainab");
        daftarSiswa.add("Andi");
        daftarSiswa.add("Rara");
        Collections.sort(daftarSiswa);

        System.out.println("=== Sorting String (Collections.sort) ===");
        System.out.println(daftarSiswa);

        // ── Sorting collection of objects berdasarkan atribut name ──
        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(new Customer(1,   "Zakia"));
        customers.add(new Customer(5,   "Budi"));
        customers.add(new Customer(4,   "Cica"));
        customers.add(new Customer(100, "Rosa"));
        customers.add(new Customer(201, "Della"));
        customers.add(new Customer(202, "Victor"));
        customers.add(new Customer(203, "Sarah"));

        System.out.println("\n=== Sebelum sorting ===");
        System.out.println(customers);

        customers.sort((c1, c2) -> c1.name.compareTo(c2.name));

        System.out.println("\n=== Setelah sorting berdasarkan name ===");
        System.out.println(customers);

        // ── Sorting berdasarkan id ──
        customers.sort((c1, c2) -> Integer.compare(c1.id, c2.id));

        System.out.println("\n=== Setelah sorting berdasarkan id ===");
        System.out.println(customers);
    }
}