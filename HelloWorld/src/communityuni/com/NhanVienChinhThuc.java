package communityuni.com;

public class NhanVienChinhThuc extends NhanVien{
	@Override
	public void lanhLuong() {
		System.out.println("Nhân Viên chính thức lãnh lương");
	}
	public static void main(String[] args) {
		NhanVien teo=new NhanVienChinhThuc();
		teo.lanhLuong();
	}
}
