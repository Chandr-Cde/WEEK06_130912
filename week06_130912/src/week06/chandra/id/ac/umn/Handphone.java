package week06.chandra.id.ac.umn;

public class Handphone extends Barang{
	private String warna;
	public static int total;
	
	public Handphone(int id, String nama, double harga, int stok, String warna) {
		super(id, nama, harga, stok);
		this.warna = warna;
	}
	
		public String getWarna() {
		return warna;
	}

	public void setWarna(String warna) {
		this.warna = warna;
	}

		public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
