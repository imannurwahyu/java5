package TugasPT5;

import java.util.Scanner;

class InputNilaiMahasiswa {
    String npm;
    String nama;
    double nilaiKehadiran;
    double nilaiTugas;
    double nilaiUTS;
    double nilaiUAS;

    public InputNilaiMahasiswa(String npm, String nama, double nilaiKehadiran, double nilaiTugas, double nilaiUTS, double nilaiUAS) {
        this.npm = npm;
        this.nama = nama;
        this.nilaiKehadiran = nilaiKehadiran;
        this.nilaiTugas = nilaiTugas;
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilaiUAS;
    }

    public double hitungNilaiAkhir() {
        return (0.1 * nilaiKehadiran) + (0.2 * nilaiTugas) + (0.3 * nilaiUTS) + (0.4 * nilaiUAS);
    }

    public String tentukanGrade() {
        double nilaiAkhir = hitungNilaiAkhir();
        if (nilaiAkhir <= 45) {
            return "E";
        } else if (nilaiAkhir <= 55) {
            return "D";
        } else if (nilaiAkhir <= 65) {
            return "C";
        } else if (nilaiAkhir <= 76) {
            return "B";
        } else {
            return "A";
        }
    }
    public String tentukanKeterangan() {
        double nilaiAkhir = hitungNilaiAkhir();
        if (nilaiAkhir <= 45) {
            return "KURANG SEKALI";
        } else if (nilaiAkhir <= 55) {
            return "KURANG";
        } else if (nilaiAkhir <= 65) {
            return "CUKUP";
        } else if (nilaiAkhir <= 76) {
            return "BAIK";
        } else {
            return "ISTIMEWA";
        }
    }
}
