package week06.chandra.id.ac.umn;

public class Voucher extends Barang {
	private double pajak;
	public static int total;
	public double hargaJual;
	
	public Voucher(int id, String nama, double harga, int stok, double pajak, double hargaJual) {
		super(id, nama, harga, stok);
		this.pajak = pajak;
		this.hargaJual = hargaJual;
		
	}
	
	public double getPajak() {
		return pajak;
	}

	public void setPajak(double pajak) {
		this.pajak = pajak;
	}

	public double getHargaJual() {
		return hargaJual;
	}

	public void setHargaJual(double hargaJual) {
		this.hargaJual = hargaJual;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
