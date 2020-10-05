package communityuni.com.test;

import communityuni.com.model.NhanVienChinhThuc;
import communityuni.com.model.NhanVienThoiVu;

public class TestNhanVien {

	public static void main(String[] args) {
		NhanVienChinhThuc teo=new NhanVienChinhThuc(1, "Tèo Thẹo");
		teo.tinhLuong();
		
		NhanVienThoiVu ty=new NhanVienThoiVu(2, "Tý Mẻ");
		ty.tinhLuong();
	}

}
