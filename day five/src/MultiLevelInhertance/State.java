package MultiLevelInhertance;

public class State extends Country {
	
	private String Language;
	private String StateName;
	public String getLanguage() {
		return Language;
	}
	public void setLanguage(String language) {
		Language = language;
	}
	public String getStateName() {
		return StateName;
	}
	public void setStateName(String stateName) {
		StateName = stateName;
	}
	@Override
	public String toString() {
		return "State [Language=" + Language + ", StateName=" + StateName + ", getCountryNmae()=" + getCountryNmae()
				+ ", getCapital()=" + getCapital() + "]";
	}
	
	

	
	

}
