package communityuni.com;

public class TamGiac {
	private double canhA;
	private double canhB;
	private int canhC;
	public double chuVi()
	{
		return canhA+canhB+canhC;
	}
	private double nuaChuVi()
	{
		return chuVi()/2.0;
	}	
	public double dienTich()
	{
		double p=nuaChuVi();
		return Math.sqrt(p*(p-canhA)*(p-canhB)*(p-canhC));
	}
}
