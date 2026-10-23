package tugas;

import javax.swing.JOptionPane;
import java.util.Locale;

public class Golongan {

    public static int proses() {
        String golongan = null;
        int gajiPokok = -1;

        while (true) {
            // Menampilkan dialog input
            String input = JOptionPane.showInputDialog(
                null,
                "Masukkan Golongan (D / E / F):",
                "Input Golongan",
                JOptionPane.QUESTION_MESSAGE
            );

            // Jika pengguna menekan tombol Cancel atau menutup jendela
            if (input == null) {
                return -1; 
            }

            golongan = input.trim().toUpperCase();

            gajiPokok = switch (golongan) {
                case "D" -> 10_000_000;
                case "E" -> 15_000_000;
                case "F" -> 20_000_000;
                default  -> -1;
            };

            if (gajiPokok != -1) {
                break; // Input valid
            }

            // Tampilkan pesan error jika input tidak valid
            JOptionPane.showMessageDialog(
                null,
                "Golongan tidak valid! Silakan masukkan D, E, atau F.",
                "Error Golongan",
                JOptionPane.ERROR_MESSAGE
            );
        }

        // Tampilkan konfirmasi informasi Golongan
        String pesan = String.format(
            "Golongan : %s\nGaji Pokok : Rp%s",
            golongan,
            String.format(Locale.of("id", "ID"), "%,d", gajiPokok)
        );

        JOptionPane.showMessageDialog(
            null,
            pesan,
            "Informasi Golongan",
            JOptionPane.INFORMATION_MESSAGE
        );

        return gajiPokok;
    }
}