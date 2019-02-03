package learning.interfaces;

public class CSEDepartment implements Department{
	 
	public String getTopper(String unitTestName) {
		return "cse-topper";
	}

    public double getPassPercentage(String unitTestName) {
    	return 89.30;
    }

	@Override
	public String getDepartmentName() {
		return "CSEDepartment";
	}

}
