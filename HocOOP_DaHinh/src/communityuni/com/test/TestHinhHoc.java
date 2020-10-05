package communityuni.com.test;

import communityuni.com.model.HinhChuNhat;
import communityuni.com.model.HinhHoc;
import communityuni.com.model.HinhVuong;

public class TestHinhHoc {

	public static void main(String[] args) {
		HinhHoc h;
		h=new HinhChuNhat(4, 5);
		System.out.println("Chu vi="+h.tinhChuVi());
		System.out.println("Diện Tích="+h.tinhDienTich());
		System.out.println("--------------");
		h=new HinhVuong(5);
		System.out.println("Chu vi="+h.tinhChuVi());
		System.out.println("Diện Tích="+h.tinhDienTich());
		
		HinhChuNhat hv1=new HinhVuong(5);
		System.out.println("------------");
		System.out.println("Chu vi="+h.tinhChuVi());
		System.out.println("Diện Tích="+h.tinhDienTich());
	}

}
