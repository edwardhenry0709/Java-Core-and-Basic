package communityuni.com;

public class TestFor_Hinh2 {

	public static void hinh5(int h)
	{
		for(int i=0;i<h;i++)
		{
			for(int j=0;j<h;j++)
			{
				if(i+j==h-1 ||
				   j==h/2 || 
				   (i==0 && j>=h/2) || 
				   (i==h-1 && j<=h/2))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		hinh5(11);
	}

}
