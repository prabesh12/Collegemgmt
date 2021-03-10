
package Management;
public class Student{
	public String num;
	public String name;
	public String age;
	public String address;
        public String email;
        public String attendance;
	
	public Student() {}
	public Student(String num, String name, String age, String address, String email) {
		this.num = num;
		this.name = name;
		this.age = age;
		this.address = address;
                this.email=email;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
        public String getEmail() {
		return email;
	}
        public void setEmail(String email) {
		this.email = email;
	}
        public Student (String atten){
            this.attendance=atten;
        }
          public String getAttendance() {
		return attendance;
	}
        public void setAttendance(String attendance) {
		this.attendance = attendance;
	}
	
}
