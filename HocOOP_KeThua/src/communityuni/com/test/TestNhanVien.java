package communityuni.com.test;

import communityuni.com.model.NhanVienChinhThuc;
import communityuni.com.model.NhanVienThoiVu;

public class TestNhanVien {

	public static void main(String[] args) {
		NhanVienChinhThuc teo=new NhanVienChinhThuc(1, "Nguyễn Văn Tèo");
		NhanVienThoiVu ty=new NhanVienThoiVu(2, "Trần Thị Tý");
		
		System.out.println("Tên của Tèo="+teo.getTen());
		
		teo.tinhLuong();
		ty.tinhLuong();
	}

}
