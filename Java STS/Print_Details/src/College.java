import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class College {
	private String name;
	private String website;
	private String mobile;
	private String founder;
	private String location;
	private int nod;
	
	College() {}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getFounder() {
		return founder;
	}

	public void setFounder(String founder) {
		this.founder = founder;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getNod() {
		return nod;
	}

	public void setNod(int nod) {
		this.nod = nod;
	}	
	@Override
	public String toString() {
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		return String.format("Name: %s\n"
				+ "Website: %s\n"
				+ "Mobile: %s\n"
				+ "Founder: %s\n"
				+ "Number of Dept: %d\n"
				+ "Location: %s\n"
				+ "Starting Date: %s\n",name, website, mobile, founder, numberOfDept, location, sdf.format(startingDate));
	}

		@Override
	public boolean equals(Object obj) {
		College arg=(College) obj;
		return this.getName().equalsIgnoreCase(arg.getName()) && this.getStartingDate().equals(arg.getStartingDate());
	}
	
	
}
