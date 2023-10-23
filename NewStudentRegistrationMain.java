package schoolmanagementsystem;



public interface NewStudentRegistrationMain  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	
		Student1 std=new Student1(null, "Yoga","october","+91 9494075192");
		Student1 std1=new Student1(null,"Dinesh","November"," +91 9393985675");
		  
		Course[] courses = {
				
				new Course("Math", 100.0),
		          
		        new Course("Science", 120.0),
		            
		        new Course("History", 90.0)
		        
		};
		Students student1 = new Students();
		student1.enrollCourse(courses[0]);
		student1.enrollCourse(courses[1]);

		Students student2 = new Students();
		student2.enrollCourse(courses[1]);
		student2.enrollCourse(courses[2]);
		        
		System.out.println("Student1 Info:");
		System.out.println();
		System.out.println(std);
		System.out.println( student1.toString());
		        
		System.out.println();
		        
		        
	    System.out.println("Student2 Info:");
		System.out.println();
		System.out.println(std1);
		System.out.println(student2.toString());
		
		
	}

}
