package communityuni.com.model;

public class SinhVien {
	private int ma;
	private String ten;
	private double diem;
	public SinhVien()
	{
		
	}
	public SinhVien(int ma)
	{
		this();
		this.ma=ma;
	}
	public SinhVien(int ma,String ten)
	{
		this(ma);
		this.ten=ten;
	}
	public SinhVien(int ma,String ten,double diem)
	{
		this(ma,ten);
		this.diem=diem;
	}
	public void xetTotNghiep()
	{
		if(this.diem>=5)
			System.out.println("Được xét tốt nghiệp");
		else
			System.out.println("Chưa đủ điều kiện xét tốt nghiệp");
	}
	public void xetTotNghiep(double diem)
	{
		System.out.println("Bạn có điểm "+diem);
	}
	public void xetTotNghiep(double diem,int vungUuTien)
	{
		System.out.println("Bạn có điểm "+diem +";vùng ưu tiên="+vungUuTien);
	}
	public void dangKyHocPhan(int m1)
	{
		
	}
	public void dangKyHocPhan(String m1)
	{
		
	}
}
