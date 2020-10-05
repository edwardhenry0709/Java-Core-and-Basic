package communityuni.com.model;

import java.io.Serializable;
import java.util.Date;

import communityuni.com.util.DateConverter;

public class KhachHang implements Serializable{
	private int ma;
	private String ten;
	private Date namSinh;
	public int getMa() {
		return ma;
	}
	public void setMa(int ma) {
		this.ma = ma;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public Date getNamSinh() {
		return namSinh;
	}
	public void setNamSinh(Date namSinh) {
		this.namSinh = namSinh;
	}
	public KhachHang(int ma, String ten, Date namSinh) {
		super();
		this.ma = ma;
		this.ten = ten;
		this.namSinh = namSinh;
	}
	public KhachHang() {
		super();
	}
	public String toString() {
		return this.ma+"-"+this.ten+"-"+DateConverter.fromDate(this.namSinh);
	}
}
