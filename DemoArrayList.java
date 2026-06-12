import java.util.ArrayList;
import java.util.Collections;

public class DemoArrayList {
    public static void main(String[] args) {

        // ── Langkah 2: instansiasi ArrayList dengan initial capacity 2 ──
        ArrayList<Customer> customers = new ArrayList<>(2);

        Customer customer1 = new Customer(1, "Zakia");
        Customer customer2 = new Customer(5, "Budi");

        customers.add(customer1);
        customers.add(customer2);

        // ── Langkah 3: foreach ──
        System.out.println("=== Data customers (langkah 3) ===");
        for (Customer cust : customers) {
            System.out.println(cust.toString());
        }

        // ── Langkah 4: tambah melebihi kapasitas awal ──
        customers.add(new Customer(4, "Cica"));

        System.out.println("\n=== Setelah tambah Cica (langkah 4 & 5) ===");
        for (Customer cust : customers) {
            System.out.println(cust.toString());
        }
        // Jawaban langkah 5: object baru ditambahkan di AKHIR collection

        // ── Langkah 6: tambah pada index tertentu ──
        customers.add(2, new Customer(100, "Rosa"));

        System.out.println("\n=== Setelah add index 2 - Rosa (langkah 6 & 7) ===");
        for (Customer cust : customers) {
            System.out.println(cust.toString());
        }
        // Jawaban langkah 7: index dimulai dari 0

        // ── Langkah 8: indexOf ──
        System.out.println("\n=== indexOf customer2 (langkah 8) ===");
        System.out.println(customers.indexOf(customer2));

        for (Customer cust : customers) {
            System.out.println(cust.toString());
        }

        // ── Langkah 9: get dan ubah nama ──
        System.out.println("\n=== get(1) dan ubah nama (langkah 9) ===");
        Customer customer = customers.get(1);
        System.out.println(customer.name);
        customer.name = "Budi Utomo";

        for (Customer cust : customers) {
            System.out.println(cust.toString());
        }

        // ── Langkah 10: ArrayList tanpa size ──
        // Jawaban: Ya, ArrayList bisa diinstansiasi tanpa menentukan size
        ArrayList<Customer> customers2 = new ArrayList<>();
        customers2.add(new Customer(10, "Tono"));
        System.out.println("\n=== ArrayList tanpa size (langkah 10) ===");
        System.out.println(customers2);

        // ── Langkah 11: addAll ──
        ArrayList<Customer> newCustomers = new ArrayList<>();
        newCustomers.add(new Customer(201, "Della"));
        newCustomers.add(new Customer(202, "Victor"));
        newCustomers.add(new Customer(203, "Sarah"));

        customers.addAll(newCustomers);

        System.out.println("\n=== Setelah addAll (langkah 11) ===");
        for (Customer cust : customers) {
            System.out.println(cust.toString());
        }

        // ── Langkah 12: cetak langsung ──
        System.out.println("\n=== Print langsung - toString otomatis (langkah 12) ===");
        System.out.println(customers);

        // ── Sorting berdasarkan name ──
        System.out.println("\n=== Sorting berdasarkan name (langkah 13.6) ===");
        customers.sort((c1, c2) -> c1.name.compareTo(c2.name));
        System.out.println(customers);
    }
}