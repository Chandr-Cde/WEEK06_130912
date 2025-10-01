package week06.chandra.id.ac.umn;

public class Barang {
	protected int id;
	protected int stok;
	protected double harga;
	protected String name;
	
	
	public Barang(String name, double harga, int id, int stok) {
		this.name = name;
		this.harga = harga;
		this.id = id;
		this.stok = stok;
	}
	
	public String getName() {
		return name;
	}
	public double getHarga() {
		return harga;
	}
	public int getId() {
		return id;
	}
	public int getStok() {
		return stok;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
