package org.View;

import org.ServiceImplement.ServiceDokterImpl;
import org.Services.DokterService;
import org.pojo.Dokter;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DokterViewDemo {
    static List<Dokter> listDokter = new ArrayList<>();
    static Dokter dokter = new Dokter();
    static DokterService dokterService;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int menu = 0;
        boolean keluar = false;
        char pilihan;


        do {
            System.out.println("MENU:");
            System.out.println("1. Insert Dokter");
            System.out.println("2. Update Dokter");
            System.out.println("3. Delete Dokter");
            System.out.println("4. Read Dokter");
            System.out.println("5. Find Dokter by ID");
            System.out.println("6. Keluar Aplikasi");

            System.out.println("Masukkan pilihan menu: ");
            scanner = new Scanner(System.in);
            menu = scanner.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("Anda memilih menu: " + menu);

                    break;

                case 2:
                    System.out.println("Anda memilih menu: " + menu);

                    break;

                case 3:
                    System.out.println("Anda memilih menu: " + menu);

                    break;

                case 4:
                    System.out.println("Anda memilih menu: " + menu);
                    dokterService = new ServiceDokterImpl();
                    listDokter = dokterService.findAll();
                    getAllDokter(listDokter);
                    break;

                case 5:
                    System.out.println("Anda memilih menu: " + menu);

                    break;

                case 6:
                    System.out.println("Anda memilih menu: " + menu);

                    break;

                default:
                    System.out.println("Pilihan yang Anda masukkan salah!");
                    break;
            }
            System.out.println("");
            System.out.println("Apakah ingin melanjutkan? y/n: ");
            scanner = new Scanner(System.in);
            pilihan = scanner.next().charAt(0);
            if (pilihan == 'n' || pilihan == 'N') {
                keluar = true;
            }

        } while (!keluar);
        System.out.println("Terima kasih sudah menggunakan aplikasi.");
        System.exit(0);
    }

    public static void getAllDokter(List<Dokter> listDokter){
        for (Dokter dokter: listDokter) {
            System.out.println();
            System.out.println(dokter.getId());
            System.out.println(dokter.getNama());
            System.out.println(dokter.getUmur());
            System.out.println(dokter.getJenisKelamin());
            System.out.println(dokter.getDepartemen());
            System.out.println(dokter.getNomorTelepon());
            System.out.println(dokter.getAlamat());
        }
    }
}
