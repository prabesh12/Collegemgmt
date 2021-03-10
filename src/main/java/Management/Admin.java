
package Management;



import java.util.ArrayList;
import java.util.Scanner;

public class Admin {
    private String Id;
    private String adminName;
    private String adminAge;
    private String adminEmail;
    private String adminPhone;
    public Admin(){
        
    }
    
    public Admin(String adName, String adAge,String adEmail,String adPhone,String id){
        this.adminName=adName;
        this.adminAge= adAge;
        this.adminEmail= adEmail;
        this.adminPhone=adPhone;
        this.Id=id;
        
    }
    public String getAdId() {
		return Id;
	}
	public void setAdId(String id) {
		this.Id = id;
	}
    public String getAName() {
		return adminName;
	}
	public void setAName(String name) {
		this.adminName = name;
	}
	public String getAge() {
		return adminAge;
	}
	public void setAge(String age) {
		this.adminAge = age;
	}
	public String getAEmail() {
		return adminEmail;
	}
	public void setAEmail(String email) {
		this.adminEmail = email;
	}
        public String getPhone() {
		return adminPhone;
	}
	public void setPhone(String phone) {
		this.adminEmail = phone;
	}
	public static void main(String[] args) {
                Scanner in = new Scanner(System.in);

                ArrayList<Admin> arr3 = new ArrayList<>();
		ArrayList<Student> arr = new ArrayList<>();
                ArrayList<Course> arr2 = new ArrayList<>();

                
                ArrayList<Teacher> arr1 = new ArrayList<>();
                 System.out.println("----Welcome to the course management system----");

                

                    boolean flag = true;
                    do{
                        
                 System.out.println ( "Please id to login : ");
                 String adminName = in.next();
                 System.out.println ( "Please enter user password : ");
        String password = in.next();


        if ("user".equals(adminName) && "user".equals(password)) {
         System.out.println ( "Login successful For Admin");
                    
       do{
          
                    
               
                        
			System.out.println("1. Add student information:");
			System.out.println("2. Modify student information:");
			System.out.println("3. Delete student information:");
			System.out.println("4. View all student information:");
                        System.out.println("5. Add Teacher:");
                        System.out.println("6. View teacher Information:");
                        System.out.println("7. Add New Course");
                        System.out.println("8. View Courses");
                                                System.out.println("9. Add Admin");

                        
			System.out.println("10. Exit");
			System.out.println("Please enter options:");
			
			Scanner sc = new Scanner(System.in);
			int chose = sc.nextInt();
			switch (chose) {
			case 1: {
				Add(arr);
				break;
			}
			case 2: {
				Alter(arr);
				break;
			}
			case 3: {
				Remove(arr);
				break;
			}
			case 4: {
				Look(arr);
				break;
			}
                        case 5:
                            addTeacher(arr1);
                        break;
                        case 6: 
                            seeTeacherInfo(arr1);
                            break;
                        case 7:
                            addCourse(arr2);
                            break;
                            
                        case 8:
                            viewCourse(arr2);
                            break;
                        case 9:
                            addAdmin(arr3);
                            break;
                        
			case 10: {
				System.out.println("Thank you for using");
				System.exit(0);
			}
                        
			default:
				System.out.println("The options you entered are incorrect. Please try again.");
			}
		} while (true);
       }
        
        
         if ("student".equals(adminName) && "student".equals(password)) {
         System.out.println ( "Login successful For Student");          
       do{
          
                    
               
                        
			System.out.println("1. Add student information:");
			System.out.println("2. Modify student information:");
			System.out.println("3. Delete student information:");
			System.out.println("4. View all student information:");
			System.out.println("5. Exit");
			System.out.println("Please enter options:");
			
			Scanner sc = new Scanner(System.in);
			int chose = sc.nextInt();
			switch (chose) {
			case 1: {
				Add(arr);
				break;
			}
			case 2: {
				Alter(arr);
				break;
			}
			case 3: {
				Remove(arr);
				break;
			}
			case 4: {
				Look(arr);
				break;
			}
                        
			case 5: {
				System.out.println("Thank you for using");
				System.exit(0);
			}
                        
			default:
				System.out.println("The options you entered are incorrect. Please try again.");
			}
		} while (true);
       }
           if ("Teacher".equals(adminName) && "Teacher".equals(password)) {
         System.out.println ( "Login successful For Teacher");
                    
       do{
                        System.out.println("1. Add Teacher:");
                        System.out.println("2. View teacher Information:");
                        System.out.println("3. Add New Course");
                        System.out.println("4. View Courses");
			System.out.println("5. Exit");
			System.out.println("Please enter options:");
			
			Scanner sc = new Scanner(System.in);
			int chose = sc.nextInt();
			switch (chose){
			
                        case 1:
                            addTeacher(arr1);
                        break;
                        case 2: 
                            seeTeacherInfo(arr1);
                            break;
                        case 3:
                            addCourse(arr2);
                            break;
                            
                        case 4:
                            viewCourse(arr2);
                            break;
                        
			case 5: {
				System.out.println("Thank you for using");
				System.exit(0);
			}
                        
			default:
				System.out.println("The options you entered are incorrect. Please try again.");
			}
		} while (true);
       }
       
               else {
            flag = true;
                         System.out.println ( "Login failed please re-enter:");
        }
             
		
        }while (flag);
                            
                    }
                    


	// Add students
	public static void Add(ArrayList<Student> arr) {
		Student s = new Student();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter student ID:");
		String num = sc.next();
		s.setNum(num);
		System.out.println("Enter name:");
		String name = sc.next();
		s.setName(name);
		System.out.println("Enter age:");
		String age = sc.next();
		s.setAge(age);
		System.out.println("Enter address:");
		String address = sc.next();
		s.setAddress(address);
                System.out.println("Enter email:");
		String email = sc.next();
		s.setEmail(email);
		arr.add(s);  
		System.out.println("Student information added successfully!!");
	}
        public static void addAdmin(ArrayList<Admin> arr3) {
		Admin a = new Admin();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter student ID:");
		String num = sc.next();
		a.setAdId(num);
		System.out.println("Enter name:");
		String name = sc.next();
		a.setAName(name);
		System.out.println("Enter age:");
		String age = sc.next();
		a.setAge(age);
		System.out.println("Enter address:");
		String phone = sc.next();
		a.setPhone(phone);
                System.out.println("Enter email:");
		String email = sc.next();
		a.setAEmail(email);
		arr3.add(a);  
		System.out.println("Student information added successfully!!");
	}

	// modify student
	public static void Alter(ArrayList<Student> arr) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the student ID of the student whose information needs to be modified:");
		String num = sc.next();
		System.out.println("Enter the student's new name:");
		String name = sc.next();
		System.out.println("Enter the student's new age:");
		String age = sc.next();
		System.out.println("Enter the student's new address:");
		String address = sc.next();
                System.out.println("Enter the student's new address:");
		String email = sc.next();
                
		Student news = new Student(num, name, age, address, email);

		for (int i = 0; i < arr.size(); i++) {
			Student s = arr.get(i);
			if (num.equals(s.getNum())) {
				arr.set(i, news);
			}
		}
	}

	// View students
	public static void Look(ArrayList<Student> arr) {
		System.out.println("Student ID\tname\tage\taddress");
		if (arr.size() != 0) {
			for (int i = 0; i < arr.size(); i++) {
				Student s = arr.get(i);
				System.out.println(s.getNum() + "\t" + s.getName() + "\t" + s.getAge() + "\t" + s.getAddress());
			}
		} else {
			System.out.println("There is no student information!!!");
		}
	}

	// Remove student
	public static void Remove(ArrayList<Student> arr) {
		Scanner sc = new Scanner(System.in);
		if (arr.size() == 0) {
			System.out.println("Student information is empty, please add information");
		} else {
			System.out.println("Enter the student ID of the student to be removed:");
			String num = sc.next();
			for (int i = 0; i < arr.size(); i++) {
				Student s = arr.get(i);
				if (s.getNum().equals(num)) {
					arr.remove(i);
					System.out.println("Information removed successfully!!");

				} else {
					System.out.println("There is no such student, please try again");
				}
			}

		}
	}
        
        
        public static void addTeacher(ArrayList<Teacher> arr1) {
		Teacher a = new Teacher();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter student Teacher ID:");
		String num = sc.next();
		a.setNum(num);
		System.out.println("Enter Teacher name:");
		String name = sc.next();
		a.setName(name);
		System.out.println("Enter age:");
		String age = sc.next();
		a.setAge(age);
		System.out.println("Enter address:");
		String address = sc.next();
		a.setAddress(address);
                System.out.println("Enter email:");
		String email = sc.next();
		a.setEmail(email);
                System.out.println("Enter Attebdance:");
		String attendance = sc.next();
		a.setAttendance(attendance);
                System.out.println("Enter Faculty:");
		String faculty = sc.next();
		a.setFaculty(faculty);
		arr1.add(a);

                
                
		System.out.println("Teacher  information added successfully!!");
	}
        public static void seeTeacherInfo(ArrayList<Teacher> arr1) {
		System.out.println("Teacher ID\tname\tage\taddress");
		if (arr1.size() != 0) {
			for (int i = 0; i < arr1.size(); i++) {
			Teacher a = arr1.get(i);
				System.out.println(a.getNum() + "\t" + a.getName() + "\t" + a.getAge() + "\t" + a.getAddress());
			}
		} else {
			System.out.println("There is no Teacher information!!!");
		}
	}
                
       public static void addCourse(ArrayList<Course> arr2) {
		Course c = new Course();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Course ID:");
		String id = sc.next();
		c.setId(id);
                
		System.out.println("Enter course name:");
		String cname = sc.next();
		c.setCourse(cname);
		
		arr2.add(c);
                
                
		System.out.println("Course added successfully!!");
	} 
        public static void viewCourse(ArrayList<Course> arr2) {
		System.out.println("Course ID\tname\tage\taddress");
		if (arr2.size() != 0) {
			for (int i = 0; i < arr2.size(); i++) {
			Course c = arr2.get(i);
				System.out.println(c.getId() + "\t" + c.getCourse());
			}
		} else {
			System.out.println("There is no Teacher information!!!");
		}
	}
      
}