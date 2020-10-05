package communityuni.com.model;

public class Employee extends StaffMember {

	protected String socialSecurtityNumber;
	protected double payRate;
	
	public String getSocialSecurtityNumber() {
		return socialSecurtityNumber;
	}
	public void setSocialSecurtityNumber(String socialSecurtityNumber) {
		this.socialSecurtityNumber = socialSecurtityNumber;
	}
	public double getPayRate() {
		return payRate;
	}
	public void setPayRate(double payRate) {
		this.payRate = payRate;
	}
	public String toString() {
		return super.toString()+"-"+socialSecurtityNumber+"-"+payRate;
	}
	public double pay() {
		return 500;
	}

}
