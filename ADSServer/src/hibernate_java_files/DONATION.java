package hibernate_java_files;

public class DONATION {

	
	
	public DONATION()
	{
		
		
	}
	
	
	private int DONATION_ID;
	
	private String DONATION_TYPE;
	
	private String DATE_OF_DONATION;
	
	private int ORG_ID;
	
	private int DONOR_ID;

	public int getDONATION_ID() {
		return DONATION_ID;
	}

	public void setDONATION_ID(int dONATION_ID) {
		DONATION_ID = dONATION_ID;
	}

	public String getDONATION_TYPE() {
		return DONATION_TYPE;
	}

	public void setDONATION_TYPE(String dONATION_TYPE) {
		DONATION_TYPE = dONATION_TYPE;
	}

	public String getDATE_OF_DONATION() {
		return DATE_OF_DONATION;
	}

	public void setDATE_OF_DONATION(String dATE_OF_DONATION) {
		DATE_OF_DONATION = dATE_OF_DONATION;
	}

	public int getORG_ID() {
		return ORG_ID;
	}

	public void setORG_ID(int oRG_ID) {
		ORG_ID = oRG_ID;
	}

	public int getDONOR_ID() {
		return DONOR_ID;
	}

	public void setDONOR_ID(int dONOR_ID) {
		DONOR_ID = dONOR_ID;
	}

	public DONATION(String dONATION_TYPE, String dATE_OF_DONATION, int oRG_ID, int dONOR_ID) {
		
		
		DONATION_TYPE = dONATION_TYPE;
		DATE_OF_DONATION = dATE_OF_DONATION;
		ORG_ID = oRG_ID;
		DONOR_ID = dONOR_ID;
	}
	
	
	
}
