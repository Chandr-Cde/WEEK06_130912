package week06.chandra.id.ac.umn;

import java.util.Scanner;

public class Main {
	
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int pilih;
		do {
			System.out.println("-----------Menu Toko Voucher & HP--------");
			System.out.println("1. Pesan Barang");
			System.out.println("2. Lihat Pesanan");
			System.out.println("3. Barang Baru");
			System.out.println("Pilihan");
			pilih = input.nextInt();
			input.hasNextLine();
			
			switch(pilih) {
			case 1: break;
			case 2: break;
			case 3: break;
			default: break;
			}
			
		}while(pilih != 3);
		
	}
	
	public void pesanBarang() {
		System.out.println("Daftar Barang Toko Voucher");
	}

}
