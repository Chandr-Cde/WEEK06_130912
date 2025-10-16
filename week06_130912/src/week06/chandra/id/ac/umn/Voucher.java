package week06.chandra.id.ac.umn;

public class Voucher extends Barang {
	private double pajak;
	public static int total;
	
	public Voucher(int id, String nama, double harga, int stok, double pajak) {
		super(id, nama, harga, stok);
		this.pajak = pajak;	
	}
	
	public double getPajak() {
		return pajak;
	}

	public void setPajak(double pajak) {
		this.pajak = pajak;
	}

	public double getHargajual() {
		return harga + (harga * pajak);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
