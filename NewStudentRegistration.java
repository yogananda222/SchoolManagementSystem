package schoolmanagementsystem;

import java.util.concurrent.atomic.AtomicInteger;

class Student1 implements Homepage{
	private static AtomicInteger idCounter = new AtomicInteger(19310220);

    private int id;
    private String name;
    private String dateOfBirth;
    private String contactInfo;
  

    public Student1(AtomicInteger id, String name, String dateOfBirth, String contactInfo) {
    	this.id = idCounter.getAndIncrement();
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.contactInfo = contactInfo;
       
    }

	public AtomicInteger getId() {
        return idCounter;
    }

    public String getName() {
        return name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public   String getContactInfo() {
        return contactInfo;
    }
  

    @Override
    public String toString() {
        return "Student ID: " + id + ", Name: " + name + ", Date of Birth: " + dateOfBirth + ", Contact Info: " + contactInfo;
    }

	
    
		
		}
		
		
