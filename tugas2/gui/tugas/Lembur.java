package tugas;

import javax.swing.JOptionPane;
import java.util.Locale;

public class Lembur {

    public static void proses(int gajiPokok) {
        Locale localeID = Locale.of("id", "ID");
        //int jamLembur = -1;
        byte jamLembur = -1;
        while (true) {
            String input = JOptionPane.showInputDialog(
                null,
                "Masukkan Jumlah Jam Lembur:",
                "Input Jam Lembur",
                JOptionPane.QUESTION_MESSAGE
            );

            if (input == null) {
                return; // Batal/Cancel
            }

            String line = input.trim();

            if (line.contains(" ")) {
                JOptionPane.showMessageDialog(
                    null,
                    "Error: Harap masukkan satu angka, bukan multi-input.",
                    "Error Input",
                    JOptionPane.ERROR_MESSAGE
                );
                continue;
            }

            if (!line.matches("-?\\d+")) {
                JOptionPane.showMessageDialog(
                    null,
                    "Input jam lembur tidak valid. Harap masukkan angka integer.",
                    "Error Input",
                    JOptionPane.ERROR_MESSAGE
                );
                continue;
            }
            jamLembur = Byte.parseByte(line);
            //jamLembur = Integer.parseInt(line);

            if (jamLembur < 0) {
                JOptionPane.showMessageDialog(
                    null,
                    "Jumlah jam lembur tidak dapat berupa nilai negatif.",
                    "Error Input",
                    JOptionPane.ERROR_MESSAGE
                );
                continue;
            }

            break; // Input valid
        }

        // Hitung persentase dan total
        double persentase = switch (jamLembur) {
            case 0  -> 0.0;
            case 1  -> 0.30;
            case 2  -> 0.32;
            case 3  -> 0.34;
            case 4  -> 0.36;
            default -> 0.38;
        };

        double nominalLembur = gajiPokok * persentase;
        double totalGaji = gajiPokok + nominalLembur;

        // Tampilkan Rincian Hasil Akhir di Dialog GUI
        String rincian = String.format(
            localeID,
            """
            ===== RINCIAN GAJI PEGAWAI =====
            Gaji Pokok      : Rp%,d
            Jam Lembur      : %d jam (%.0f%%)
            Nominal Lembur  : Rp%,.0f
            ---------------------------------
            Total Take Home Pay : Rp%,.0f
            """,
            gajiPokok, jamLembur, persentase * 100, nominalLembur, totalGaji
        );

        JOptionPane.showMessageDialog(
            null,
            rincian,
            "Hasil Perhitungan Gaji",
            JOptionPane.INFORMATION_MESSAGE
        );
    }
}