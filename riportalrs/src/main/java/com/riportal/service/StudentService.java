package com.riportal.service;

import java.util.HashMap;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.riportal.model.Student;

@RestController
@RequestMapping(value="/rest/student")
class StudentService{
	
  public static HashMap<Long,Student> hmStudent = initStudent();
	   
  private static HashMap<Long,Student> initStudent() {
		  hmStudent=new HashMap<Long,Student>();
			 
	      Student one=new Student("John","math");
	      hmStudent.put(new Long(one.getId()),one);

	      Student two=new Student("Jane","history");
	      hmStudent.put(new Long(two.getId()),two);
	      return hmStudent;
   };	
 
   
   
   @RequestMapping(value="/",method = RequestMethod.GET)
   public HashMap<Long,Student> getAllStudents(){
      return hmStudent;
   }
   
   @RequestMapping(value="/add",method = RequestMethod.POST)
   public Student addStudent(@RequestParam(value="name") String name
         ,@RequestParam(value="subject",defaultValue = "unknown") String subject){
    
      Student student=new Student(name,subject);
      hmStudent.put(new Long(student.getId()),student);
      return student;
    
   }
   
   @RequestMapping(value="/update",method = RequestMethod.PUT)
   public Student updateStudent(@RequestBody Student student) throws Exception {
    
      if(hmStudent.containsKey(new Long(student.getId()))){
         hmStudent.put(new Long(student.getId()),student);
      }else{
         throw new Exception("Student "+student.getId()+" does not exists");
      }
    
      return student;
   }
   
}