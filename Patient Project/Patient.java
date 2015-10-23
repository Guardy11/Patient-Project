class Patient{
	private String firstname;
	private String lastname;
	private int age;
	private String address;
	
	public Patient(String firstname, String lastname, int age, String address){
		this.firstname = firstname;
		this.lastname  = lastname;
		this.age  	   = age;
		this.address   = address;
	}
	
	public String getFullname(){
		return this.firstname + " " + this.lastname;
	}
	
	public int getAge(){
		return this.age;
	}
	
	public String getAddress(){
		return this.address;
	}
}