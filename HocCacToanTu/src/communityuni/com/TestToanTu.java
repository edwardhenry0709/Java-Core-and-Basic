package communityuni.com;

public class TestToanTu {

	public static void main(String[] args) {
		
		double dtb=4;
		System.out.println(dtb>=5? "Bạn đậu" : "Bạn Rớt");
		
		boolean kq=(5<4) || (7>3) || (100<0);
		System.out.println(kq);
		
		boolean kq2=(5<4) && (7>3) &&(100<0);
		System.out.println(kq2);
		
		int x=8;
		int y= 2;
		int z = x++   +   ++y -5;
		System.out.println("x="+x);
		System.out.println("y="+y);
		System.out.println("z="+z);
		
		x=8;
		x=x++ - ++x;
		System.out.println(x);
		
		int k=(5*2)+(9-8)/3;
		
	}

}
