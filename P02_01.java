// 12S23040 - Diana Hevila Manurung

import java.util.*;
import java.lang.Math;

class P02 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String studiKasus;
        String nim;
        String tugas;
        String dosen;
        String haridanPengumpulanTugas;
        String hasil1;
        double tingkatKesulitan;
        double hariDeadline;
        String status;
        double prioritas;

        studiKasus = input.nextLine();
        nim = input.nextLine();
        tugas = input.nextLine();
        dosen = input.nextLine();
        haridanPengumpulanTugas = input.nextLine();
        tingkatKesulitan = input.nextDouble();
        hariDeadline = input.nextDouble();
        status = input.nextLine();
        prioritas = tingkatKesulitan * (1.0 / hariDeadline);
        System.out.println("Prioritas :" + prioritas);
        if (prioritas > 3) {
            hasil1 = "Penting! Anda harus mengerjakan tugas segera";
        } else {
            if (prioritas >= 1.5 && prioritas <= 3) {
                hasil1 = "Tugas ini memiliki prioritas menengah";
            } else {
                if (prioritas < 1.5) {
                    hasil1 = "Tugas ini relatif ringan, namun jangan tunda terlalu lama";
                }
            }
        }
        System.out.println(studiKasus + "|" + nim + "|" + tugas + "|" + dosen + "|" + haridanPengumpulanTugas + "|" + tingkatKesulitan + "|" + hariDeadline + "|" + prioritas + "|" + status);
    }
}

