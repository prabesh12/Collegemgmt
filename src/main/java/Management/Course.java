
package Management;

public class Course{
    public String c_id;
    public String course;
    
     public Course(){
         
     }
     public Course(String id, String course){
         this.c_id=id;
         this.course=course;
         
     }
     
   public String getId(){
       
    return c_id;
}
    public void setId(String id){
        this.c_id=id;
    }
      public String getCourse(){
       
    return course;
}
    public void setCourse(String c){
        this.course=c;
    }
  
}
