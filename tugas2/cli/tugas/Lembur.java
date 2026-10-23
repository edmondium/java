package tugas;

import java.util.Locale;

public class Lembur {

    public static void proses(int gajiPokok) {
        Locale localeID = Locale.of("id", "ID");
        //int jamLembur;
        byte jamLembur;
        while (true) {
            String line = IO.readln().trim();
            
            if (line.contains(" ")) {
                IO.println("Error: Harap masukkan satu angka, bukan multi-input.\n");
                IO.print("Masukkan jumlah jam lembur: ");
                continue;
            }
            if (!line.matches("-?\\d+")) {
                IO.println("Input jam lembur tidak valid. Harap masukkan angka integer.\n");
                IO.print("Masukkan jumlah jam lembur: ");
                continue;
            }
            jamLembur = Byte.parseByte(line);
            //jamLembur = Integer.parseInt(line);
            if (jamLembur < 0) {
                IO.println("Jumlah jam lembur tidak valid. Tidak dapat berupa nilai negatif.\n");
                IO.print("Masukkan jumlah jam lembur: ");
                continue;
            }

            break;
        }

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

        IO.println("Jam lembur\t: " + jamLembur + " jam (" + String.format(localeID, "%.0f%%", persentase * 100) + ")");
        IO.println("Nominal Lembur\t: Rp" + String.format(localeID, "%,.0f", nominalLembur));
        IO.println("---------------------------------");
        IO.println("Total Take Home Pay: Rp" + String.format(localeID, "%,.0f", totalGaji));
    }
}