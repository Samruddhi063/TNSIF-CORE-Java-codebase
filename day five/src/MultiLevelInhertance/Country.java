package MultiLevelInhertance;

public class Country {
	
	private String countryNmae;
	private String capital;
	public String getCountryNmae() {
		return countryNmae;
	}
	public void setCountryNmae(String countryNmae) {
		this.countryNmae = countryNmae;
	}
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
	@Override
	public String toString() {
		return "Country [countryNmae=" + countryNmae + ", capital=" + capital + "]";
	}
	
	

}
