package TugasPT5;

import java.util.*;

public class NilaiMahasiswaMain {


    public static InputNilaiMahasiswa inputDataMahasiswa() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("NPM: ");
        String npm = scanner.nextLine();

        System.out.print("Nama Mahasiswa: ");
        String nama = scanner.nextLine();

        System.out.print("Nilai Kehadiran: ");
        double nilaiKehadiran = scanner.nextDouble();

        System.out.print("Nilai Tugas: ");
        double nilaiTugas = scanner.nextDouble();

        System.out.print("Nilai UTS: ");
        double nilaiUTS = scanner.nextDouble();

        System.out.print("Nilai UAS: ");
        double nilaiUAS = scanner.nextDouble();

        return new InputNilaiMahasiswa(npm, nama, nilaiKehadiran, nilaiTugas, nilaiUTS, nilaiUAS);
    }

    public static void tampilkanOutput(InputNilaiMahasiswa mahasiswa) {
        double nilaiAkhir = mahasiswa.hitungNilaiAkhir();
        String grade = mahasiswa.tentukanGrade();
        String keterangan = mahasiswa.tentukanKeterangan();

        System.out.println("\nTampilan Output:");
        System.out.println("NPM Mahasiswa    : " + mahasiswa.npm);
        System.out.println("Nama Mahasiswa   : " + mahasiswa.nama);
        System.out.println("Nilai Rata-rata  : " + String.format("%.2f", nilaiAkhir));
        System.out.println("Grade            : " + grade);
        System.out.println("Keterangan       : " + keterangan);
    }

    public static void main(String[] args) {
        InputNilaiMahasiswa mahasiswa = inputDataMahasiswa();
        tampilkanOutput(mahasiswa);
    }
}

