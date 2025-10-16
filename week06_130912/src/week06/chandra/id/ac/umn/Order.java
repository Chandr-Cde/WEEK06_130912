package week06.chandra.id.ac.umn;

public class Order {
	private int id;
	private Voucher voucher;
	private Handphone handphone;
	private int jumlah;
	public static int total;
	
	public Order(int id, Voucher voucher, int jumlah) {
		this.id = id;
		this.voucher = voucher;
		this.jumlah = jumlah;
	}
	
	public Order(int id, Handphone handphone, int jumlah) {
		this.id = id;
		this.handphone = handphone;
		this.jumlah = jumlah;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Voucher getVoucher() {
		return voucher;
	}

	public void setVoucher(Voucher voucher) {
		this.voucher = voucher;
	}

	public Handphone getHandphone() {
		return handphone;
	}

	public void setHandphone(Handphone handphone) {
		this.handphone = handphone;
	}

	public int getJumlah() {
		return jumlah;
	}

	public void setJumlah(int jumlah) {
		this.jumlah = jumlah;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	}

}
