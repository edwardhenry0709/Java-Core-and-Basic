package communityuni.com.test;

import communityuni.com.model.NhanVienChinhThuc;
import communityuni.com.model.NhanVienThoiVu;

public class TestNhanVien {

	public static void main(String[] args) {
		NhanVienChinhThuc teo=new NhanVienChinhThuc();
		teo.tinhLuong(25);
		
		NhanVienThoiVu ty=new NhanVienThoiVu();
		ty.tinhLuong(3);
	}

}
