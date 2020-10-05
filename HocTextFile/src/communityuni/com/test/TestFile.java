package communityuni.com.test;

import java.util.ArrayList;

import communityuni.com.io.TextFileFactory;

public class TestFile {

	public static void main(String[] args) {
		/*ArrayList<String>dsData=new ArrayList<String>();
		dsData.add("Obama");
		dsData.add("Putin");
		dsData.add("Kim Jong Un");
		dsData.add("Tập Cẩn Bình");
		
		boolean kq=TextFileFactory.luuFile(dsData, "E:/dulieutest.txt");
		if(kq==true)
		{
			System.out.println("Lưu file thành công");
		}
		else
		{
			System.out.println("Lưu file thất bại");
		}*/
		
		ArrayList<String>dsData=TextFileFactory.docFile("E:/dulieutest.txt");
		for(String data: dsData)
		{
			System.out.println(data);
		}
	}

}
