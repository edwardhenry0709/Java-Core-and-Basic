package communityuni.com;

public class TestParameter {

	public static int sum(int ... arr)
	{
		int s=0;
		for(int i=0;i<arr.length;i++)
			s+=arr[i];
		return s;
	}
	
	public static void main(String[] args) {
		int s=sum(1,4,7,2,9,5);
		System.out.println(s);
		int s2=sum();
		System.out.println(s2);
		int s3=sum(7,8);
		System.out.println(s3);

	}

}
