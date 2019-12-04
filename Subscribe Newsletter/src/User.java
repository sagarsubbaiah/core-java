
public class User {
	private String name, emailId;
	private boolean preference;
	 public User(String name, String emailId, boolean prefernce) {
		 this.emailId=emailId;
		 this.name=name;
		 this.preference=preference;
	 }
	 
	 public User() {
		// TODO Auto-generated constructor stub
	}

	public void setName(String name) {
		 this.name=name;
	 }
	 public void setEmailId(String emailId) {
		 this.emailId=emailId;
	 }
	 public void setPreference(boolean preference) {
		 this.preference=preference;
	 }
	 
	 public String getName() {
		 return this.name;
	 }
	 public String getEmailId() {
		 return this.emailId;
	 }
	 public boolean getPreference() {
		 return this.preference;
	 }
	 

}
