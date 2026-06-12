Jawaban Pertanyaan
13.3 ArrayList

Langkah 4–5: Object baru (add tanpa index) ditambahkan di akhir collection. ArrayList bisa melebihi kapasitas awal karena ukurannya dinamis (auto-resize).
Langkah 7: Index ArrayList dimulai dari 0.
Langkah 10: Ya, ArrayList bisa diinstansiasi tanpa size: new ArrayList<>().

13.4 Stack

Langkah 5: Pengecekan temp != null mencegah NullPointerException jika stack kosong (pada implementasi manual). java.util.Stack melempar EmptyStackException jika stack kosong saat pop()/peek() dipanggil.
Langkah 8: search() mengembalikan posisi 1-based dari TOP stack. Jika tidak ditemukan, mengembalikan -1.

13.5 TreeSet

Langkah 4: Urutan berbeda karena TreeSet menyimpan elemen secara terurut otomatis (natural ordering / ascending) saat di-insert, bukan urutan penambahan.
Langkah 6:
first() → elemen terkecil, tidak menghapus
last() → elemen terbesar, tidak menghapus
remove(obj) → menghapus elemen tertentu
pollFirst() → mengambil dan menghapus elemen terkecil
pollLast() → mengambil dan menghapus elemen terbesar


13.6 Sorting
Untuk tipe primitif/String gunakan Collections.sort(list).
Untuk object gunakan lambda comparator: list.sort((c1,c2) -> c1.name.compareTo(c2.name)).