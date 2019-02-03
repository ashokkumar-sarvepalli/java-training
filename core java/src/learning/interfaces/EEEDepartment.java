package learning.interfaces;

public class EEEDepartment implements Department{

	@Override
	public String getTopper(String unitTestName) {
		return "eee-topper";
		
	}

	@Override
	public double getPassPercentage(String unitTestName) {
		return 75;
	}

	@Override
	public String getDepartmentName() {
		return "EEE Department";
	}
	
	
}
