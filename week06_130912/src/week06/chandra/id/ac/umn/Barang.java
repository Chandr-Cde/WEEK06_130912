package week06.chandra.id.ac.umn;

public class Barang {
	protected int id;
	protected double harga;
	protected String nama;
	protected int stok;
	
	public Barang(int id, String nama, double harga, int stok) {
	    this.id = id;
	    this.nama = nama;
	    this.harga = harga;
	    this.stok = stok;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getHarga() {
		return harga;
	}

	public void setHarga(double harga) {
		this.harga = harga;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public int getStok() {
		return stok;
	}

	public void setStok(int stok) {
		this.stok = stok;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
