package hibernate_java_files;

public class PROJECT_FUNDING {

	
	public PROJECT_FUNDING()
	{
		
		
	}
	
	
	
	
	
	public PROJECT_FUNDING(int pROJECT_ID, int dONATION_ID, long dATE_OF_FUNDING, int aMOUNT, int tOTAL_AMOUNT) {
	
		PROJECT_ID = pROJECT_ID;
		DONATION_ID = dONATION_ID;
		DATE_OF_FUNDING = dATE_OF_FUNDING;
		AMOUNT = aMOUNT;
		TOTAL_AMOUNT = tOTAL_AMOUNT;
	}





	private int INDEX_ID;
	
	private int PROJECT_ID;
	
	private int DONATION_ID;
	
	private long DATE_OF_FUNDING;
	
	private int AMOUNT;
	
	private int TOTAL_AMOUNT;

	public int getPROJECT_ID() {
		return PROJECT_ID;
	}

	public void setPROJECT_ID(int pROJECT_ID) {
		PROJECT_ID = pROJECT_ID;
	}

	public int getDONATION_ID() {
		return DONATION_ID;
	}

	public void setDONATION_ID(int dONATION_ID) {
		DONATION_ID = dONATION_ID;
	}

	public long getDATE_OF_FUNDING() {
		return DATE_OF_FUNDING;
	}

	public void setDATE_OF_FUNDING(long dATE_OF_FUNDING) {
		DATE_OF_FUNDING = dATE_OF_FUNDING;
	}

	public int getAMOUNT() {
		return AMOUNT;
	}

	public int getINDEX_ID() {
		return INDEX_ID;
	}

	public void setINDEX_ID(int iNDEX_ID) {
		INDEX_ID = iNDEX_ID;
	}

	public void setAMOUNT(int aMOUNT) {
		AMOUNT = aMOUNT;
	}

	public int getTOTAL_AMOUNT() {
		return TOTAL_AMOUNT;
	}

	public void setTOTAL_AMOUNT(int tOTAL_AMOUNT) {
		TOTAL_AMOUNT = tOTAL_AMOUNT;
	}

	
	
	
	
	
	
}
