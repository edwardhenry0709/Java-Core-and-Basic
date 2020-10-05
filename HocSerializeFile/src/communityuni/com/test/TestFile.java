package communityuni.com.test;

import java.util.ArrayList;

import communityuni.com.io.SerializeFileFactory;
import communityuni.com.model.Khachhang;

public class TestFile {

	public static void main(String[] args) {
		/*ArrayList<Khachhang>dsKH=new ArrayList<Khachhang>();
		dsKH.add(new Khachhang(1, "Tủn"));
		dsKH.add(new Khachhang(2, "Tý"));
		dsKH.add(new Khachhang(3, "Bin"));
		dsKH.add(new Khachhang(4, "Bo"));
		dsKH.add(new Khachhang(5, "Cafe"));
		
		boolean kq=SerializeFileFactory.luuFile(dsKH, "E:/data_kh.dat");
		if(kq==true)
		{
			System.out.println("Lưu File thành công");
		}
		else
		{
			System.out.println("Lưu File thất bại");
		}*/
		Object data=SerializeFileFactory.docFile("E:/data_kh.dat");
		ArrayList<Khachhang>dsKH=(ArrayList<Khachhang>) data;
		for(Khachhang kh: dsKH)
			System.out.println(kh.getMa()+" - "+kh.getTen());
	}

}
