import tugas.Golongan;
import tugas.Lembur;

void main() {
    String ulang;

    do {
        IO.print("Masukkan golongan (D/E/F): ");
        int gajiPokok = Golongan.proses();

        IO.print("Masukkan jumlah jam lembur: ");
        Lembur.proses(gajiPokok);

        IO.print("\nHitung ulang? (Y/N): ");
        ulang = IO.readln().trim().toUpperCase();
        IO.println("");
    } while (ulang.equals("Y"));

    IO.println("Program selesai. Terima kasih.");
}