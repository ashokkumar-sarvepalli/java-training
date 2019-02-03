package learning.interfaces;

public class ECEDepartment implements Department{
	

	@Override
	public String getTopper(String unitTestName) {
		return "ece-topper";
	}

	@Override
	public double getPassPercentage(String unitTestName) {
		return 90;
	}

	@Override
	public String getDepartmentName() {
		return "ECE Department";
	}

}
