package communityuni.com.model;

public class NhanVienChinhThuc extends NhanVien {
	
	public NhanVienChinhThuc()
	{
		super();
	}
	public NhanVienChinhThuc(int ma,String ten)
	{
		super(ma,ten);
	}
	
	public void tinhLuong() {
		super.tinhLuong();
		System.out.println("==>Đây là nhân viên chính thức");
	}
}
