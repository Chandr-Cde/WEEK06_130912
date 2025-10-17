package week06.chandra.id.ac.umn;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static Scanner input = new Scanner(System.in);
    static ArrayList<Voucher> listV = new ArrayList<>();
    static ArrayList<Handphone> listH = new ArrayList<>();
    static ArrayList<Order> listO = new ArrayList<>();

    public static void main(String[] args) {
    	// TODO Auto-generated method stub
        int pilih;
        do {
            System.out.println("\n-----------Menu Toko Voucher & HP--------");
            System.out.println("1. Pesan Barang");
            System.out.println("2. Lihat Pesanan");
            System.out.println("3. Barang Baru");
            System.out.print("Pilihan: ");
            pilih = input.nextInt();
            input.nextLine();

            switch (pilih) {
                case 1: pesanBarang(); break;
                case 2: lihatPesanan(); break;
                case 3: barangBaru(); break;
                default: break;
            }

        } while (pilih != 0);
    }

    public static void pesanBarang() {
        int pilih; 
        int id; 
        int jml;

        System.out.println("Daftar Barang Toko Voucher & HP");
        System.out.println("1. Handphone");
        System.out.println("2. Voucher");
        System.out.print("Pilihan: ");
        pilih = input.nextInt();
        input.nextLine();

        if (pilih == 1) {
            System.out.println("--------------------------------");
            for (Handphone h : listH) {
                System.out.println("ID    : " + h.getId());
                System.out.println("Nama  : " + h.getNama());
                System.out.println("Stok  : " + h.getStok());
                System.out.println("Harga : " + h.getHarga());
                System.out.println("--------------------------------");
            }
            System.out.print("Pesan barang (ID): ");
            id = input.nextInt();
            
            Handphone handphoneDipesan = null;
            for(Handphone h : listH) {
                if(h.getId() == id) {
                    handphoneDipesan = h;
                    break;
                }
            }

            if(handphoneDipesan != null) {
                System.out.print("Jumlah: ");
                jml = input.nextInt();
                if(jml > 0 && jml <= handphoneDipesan.getStok()) {
                    handphoneDipesan.minusStock(jml);
                    Order.total++;
                    listO.add(new Order(Order.total, handphoneDipesan, jml));
                    
                } else if (pilih == 2) {
                	System.out.println("--------------------------------");
                	for (Voucher v : listV) {
	                System.out.println("ID      : " + v.getId());
	                System.out.println("Nama    : " + v.getNama());
	                System.out.println("Nominal : " + v.getHarga());
	                System.out.println("Stok    : " + v.getStok());
	                System.out.println("Harga   : " + v.getHargajual());
	                System.out.println("--------------------------------");
	                }
                	System.out.print("Pesan barang (ID): ");
                	id = input.nextInt();
                	
                	Voucher voucherDipesan = null;
                    for(Voucher v : listV) {
                        if(v.getId() == id) {
                            voucherDipesan = v;
                            break;
                        }
                    }
                    if(voucherDipesan != null) {
                    	System.out.print("Jumlah: ");
                    	}
                    jml = input.nextInt();
                    if(jml > 0 && jml <= voucherDipesan.getStok()) {
                    	voucherDipesan.minusStock(jml);
                    }
                    Order.total++;
                    listO.add(new Order(Order.total, voucherDipesan, jml));
                    }
                }
            }
        }
    
    public static void lihatPesanan() {
        System.out.println("-----------Daftar Pesanan-----------");
        double totalBayar = 0;
        for(Order o : listO) {
            System.out.println("ID Pesanan: " + o.getId());
            
            if (o.getHandphone() != null) {
                Handphone h = o.getHandphone();
                System.out.println("Nama     : " + h.getNama());
                System.out.println("Jumlah   : " + o.getJumlah());
                double subtotal = h.getHarga() * o.getJumlah();
                System.out.println("Total    : " + subtotal);
                totalBayar += subtotal;
            } 
            else if (o.getVoucher() != null) {
                Voucher v = o.getVoucher();
                System.out.println("Nama     : " + v.getNama());
                System.out.println("Jumlah   : " + o.getJumlah());
                double subtotal = v.getHargajual() * o.getJumlah();
                System.out.println("Total    : " + subtotal);
                totalBayar += subtotal;
            }
            System.out.println("------------------------------------");
        }
         System.out.println("Total : " + totalBayar);
    }

    public static void barangBaru() {
        System.out.println("Tambah Barang Baru");
        System.out.println("1. Handphone");
        System.out.println("2. Voucher");
        System.out.print("Pilihan: ");
        int pilih = input.nextInt();
        input.nextLine();
        System.out.print("ID: ");
        int id = input.nextInt();
        input.nextLine();
        System.out.print("Nama: ");
        String nama = input.nextLine();
        System.out.print("Harga: ");
        double harga = input.nextDouble();
        System.out.print("Stok: ");
        int stok = input.nextInt();
        input.nextLine();

        if (pilih == 1) {
            System.out.print("Warna: ");
            String warna = input.nextLine();
            listH.add(new Handphone(id, nama, harga, stok, warna));
        } else if (pilih == 2) {
            System.out.print("Pajak (0.1 untuk 10%): ");
            double pajak = input.nextDouble();
            listV.add(new Voucher(id, nama, harga, stok, pajak));
        }
    }
}