package TugasPT5;

import java.util.Scanner;

public class beratBadan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan berat badan (kg): ");
        double beratBadan = scanner.nextDouble();

        System.out.print("Masukkan tinggi badan (m): ");
        double tinggiBadan = scanner.nextDouble();

        double nilaiIMT = beratBadan / (tinggiBadan * tinggiBadan);
        
        String hasilKategori;
        
        if (nilaiIMT <= 18.4) {
            hasilKategori = "Berat Badan Kurang";
        } else if (nilaiIMT <= 24.9) {
            hasilKategori = "Berat Badan Ideal";
        } else if (nilaiIMT <= 29.9) {
            hasilKategori = "Berat Badan Lebih";
        } else if (nilaiIMT <= 39.9) {
            hasilKategori = "Gemuk";
        } else {
            hasilKategori = "Sangat Gemuk";
        }

        System.out.println("\nHasil:");
        System.out.println("IMT = " + String.format("%.2f", nilaiIMT));
        System.out.println("Kategori: " + hasilKategori);
    }
}

