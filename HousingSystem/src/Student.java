import java.util.ArrayList;

public class Student extends Account {
	
	private String studentID;
	private ArrayList<Property> favoriteProperties;
//	static Student student = new Student();
	
	public Student(String username, String password, String firstName, String lastName, String emailAddress, String phone, String studentID)
	{
		this.username = username;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailAddress = emailAddress;
		this.phone = phone;
		this.type = AccountType.STUDENT;
		this.studentID = studentID;
		this.favoriteProperties = null;
		this.ratings = null;
		this.reviews = null;
		this.signedLeases = null;
	}
//	public Student() {
//		student = dataLoader.loadStudent();
//	}
//	public static Student getInstance() {
//		if(student == null) {
//			student = new Student();
//		}
//		
//		return student;
//	}

	public String getStudentId() {
		return this.studentID;
	}
	public void setStudentId(String studentId) {
		this.studentID = studentId;
	}
	
	public void addFavoriteProperty(Property property)
	{
		
	}
	
	public ArrayList<Property> getFavoriteProperties()
	{
		return null;
	}
	
	public void removeFavoriteProperty(Property property)
	{
		
	}
	
	public void reviewProperty(Property property, int rating, String username, String review)
	{
		
	}
	
	public void reviewPropertyManager(PropertyManager propertyManager, int rating, String username, String review)
	{
		
	}
}
