package folder_Employee;

public class Employee {
	  private String fname;
	  private String lname;

	  //Employee constructor
	  public Employee (String fname, String lname) {
	    this.fname = fname;
	    this.lname = lname;
	  }

	  //Employee constructor
	  public Employee () {
	    this.fname = "Mark";
	    this.lname = "Senne";
	  }

	  public String getFname() {
	    return this.fname;
	  }

	  public void setFname(String fname) {
	    this.fname = fname;
	  }

	  public String getLname() {
	    return this.lname;
	  }

	  public void setLname(String lname) {
	    this.lname = lname;
	  }

	  public String tostring() {
	    String output = "";
	    output = "Firstname is: " + this.fname + " and lastname is " + this.lname;
	    return output;
	  }
	}

