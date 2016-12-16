package objects;

public abstract class Person 
{
	protected final String firstname;
	protected final String lastName;
	protected final String gender;
	protected int age;
	
	public Person(final String firstname, final String lastName, final String gender) 
	{
		this.firstname = firstname;
		this.lastName = lastName;
		this.gender = gender;
	}
	
	public abstract void setLayoutForPersonData();
	//or showPersonData
	public abstract String getPersonDetails(); 

}
