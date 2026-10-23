package tugas;

import java.util.Locale;

public class Golongan {

    public static int proses() {
        String golongan;
        int gajiPokok;

        while (true) {
            golongan = IO.readln().trim().toUpperCase();

            gajiPokok = switch (golongan) {
                case "D" -> 10_000_000;
                case "E" -> 15_000_000;
                case "F" -> 20_000_000;
                default  -> -1;
            };

            if (gajiPokok != -1) {
                break;
            }

            IO.println("Golongan tidak valid. Silakan masukkan D, E, atau F.\n");
            IO.print("Masukkan golongan (D/E/F): ");
        }

        IO.println("Golongan\t: " + golongan);
        IO.println("Gaji Pokok\t: Rp" + String.format(Locale.of("id", "ID"), "%,d", gajiPokok) + "\n");
        return gajiPokok;
    }
}