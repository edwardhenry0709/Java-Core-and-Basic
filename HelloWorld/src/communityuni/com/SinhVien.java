package communityuni.com;

public class SinhVien implements Cloneable {
	 public SinhVien copy() 
			 throws CloneNotSupportedException
	 {
	     return (SinhVien) this.clone();
	 }
}
