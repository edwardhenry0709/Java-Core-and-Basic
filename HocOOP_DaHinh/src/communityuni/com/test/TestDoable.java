package communityuni.com.test;

import communityuni.com.model.IDoable;
import communityuni.com.model.NhanVien;
import communityuni.com.model.SinhVien;

public class TestDoable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IDoable x;
		x=new NhanVien();
		x.doSomething();
		x=new SinhVien();
		x.doSomething();
	}

}
