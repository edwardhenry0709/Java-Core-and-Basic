package communityuni.com.model;

import java.util.ArrayList;

public class Staff {

	private ArrayList<StaffMember>staffList;
	
	public Staff() {
		super();
		staffList=new ArrayList<StaffMember>();
	}
	public ArrayList<StaffMember> getStaffList() {
		return staffList;
	}
	public void setStaffList(ArrayList<StaffMember> staffList) {
		this.staffList = staffList;
	}
	public void addStaffMemeber(StaffMember sm)
	{
		staffList.add(sm);
	}
	public void payDay()
	{
		for(StaffMember sm : staffList)
		{
			System.out.println(sm);
		}		
	}

}
