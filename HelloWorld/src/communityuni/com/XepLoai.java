package communityuni.com;

public enum XepLoai {
	XuatSac ("Xuất sắc"),
	Gioi ("Giỏi"),
	Kha ("Khá"),
	TrungBinh ("Trung Bình"),
	Yeu ("Yếu"),
	Kem ("Kém"),
	DiBoDoi("Đi bộ đội");
	String msg;
	private XepLoai(String msg) {
		this.msg=msg;
	}
	public String getDescription()
	{
		return this.msg;
	}
}
