package communityuni.com.model;

public class SanPham {
	private int ma;
	private String ten;
	private double gia;
	public void setMa(int ma)
	{
		this.ma=ma;
	}
	public int getMa()
	{
		return this.ma;
	}
	public void setTen(String ten)
	{
		this.ten=ten;
	}
	public String getTen()
	{
		return this.ten;
	}
	public void setGia(double gia)
	{
		this.gia=gia;
	}
	public double getGia()
	{
		return this.gia;
	}
	public String toString() {
		return ma+"-"+getTen()+","+getGia();
	}
}
