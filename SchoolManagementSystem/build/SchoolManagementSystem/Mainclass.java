/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SchoolManagementSystem;

/**
 *
 * @author aruba
 */
public class Mainclass {
    public static void main(String[]args)
         
 {
    School s =new School();
    
   String l=s.schoolname("pakturk international");
   System.out.println("school name is :"+l);
   s.schoolloaction();
   int n=s.totalstudents(100);
   System.out.println("Total students are:"+n);
   int h= s.totalteachers(50);
   System.out.println("Total teachers are:"+h);
   
   
      Teacher t = new Teacher(1,"amna",500);
      t.schoolname("pakturk international");
      t.getteacherid();
      t.getteachername();
      t.getteachersalary();
      
      
      
     student st =new student(1,"sara",10);
     st.schoolname("pakturk international");
     st.getstudentId();
     st.getstudentName();
     st.getstudentGrade();
     st.updatefeepaid(900);
     st.getstudentFeepaid();
   
   
      
 }
}
   
   
   
   
    

