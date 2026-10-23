import javax.swing.JOptionPane;
import tugas.Golongan;
import tugas.Lembur;

void main() {
    int konfirmasi;

    do {
        // Panggil GUI Golongan
        int gajiPokok = Golongan.proses();

        // Jika user menutup/membatalkan dialog Golongan
        if (gajiPokok == -1) {
            break; 
        }

        // Panggil GUI Lembur
        Lembur.proses(gajiPokok);

        // Dialog Konfirmasi Hitung Ulang (Yes/No)
        konfirmasi = JOptionPane.showConfirmDialog(
            null,
            "Apakah Anda ingin menghitung ulang?",
            "Hitung Ulang",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE
        );

    } while (konfirmasi == JOptionPane.YES_OPTION);

    JOptionPane.showMessageDialog(
        null,
        "Program selesai. Terima kasih!",
        "Keluar",
        JOptionPane.INFORMATION_MESSAGE
    );
}