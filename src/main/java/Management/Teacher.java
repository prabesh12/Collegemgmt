
package Management;

public class Teacher extends Student{
        private String attendance;
        private String faculty;
	
	public Teacher() {}
	public Teacher(String num, String name, String age, String address, String email, String faculty,String atten ) {
		this.num = num;
		this.name = name;
		this.age = age;
		this.address = address;
                this.email=email;
                this.faculty=faculty;
                this.attendance=atten;
	}

           public String getAttendance() {
		return attendance;
	}
        public void setAttendance(String attendance) {
		this.attendance= attendance;
	}
	 public String getFaculty() {
		return attendance;
	}
        public void setFaculty(String attendance) {
		this.attendance= attendance;
	}
	
        
    
}
