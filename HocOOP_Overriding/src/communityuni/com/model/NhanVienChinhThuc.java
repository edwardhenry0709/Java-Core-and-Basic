package communityuni.com.model;

public class NhanVienChinhThuc extends NhanVien {

	public void tinhLuong(int ngayCong) {
		if(ngayCong<20)
			System.out.println("5 triệu");
		else
			System.out.println("20 triệu");
		
	}

}
