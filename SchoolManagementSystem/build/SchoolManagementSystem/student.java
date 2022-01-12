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
public class student extends School {
    

    private final int id;
    
    private final String name;
    
    private int grade;
    
    public int feepaid;
    
    private final int feetotal;
    
    public student(int id,String name,int grade)
    
    {
      feepaid=0;
      
      feetotal= 10000;
  
     this.id=id;
     
     this.name=name;
     
     this.grade=grade;
     
    }
    
  /**
   * used to update student grade.
   * used to update fee paid.
  @param grade
    */
    
     public void setgrade(int grade)
      
     {      
        
        this.grade=grade;
        
     }
     public void updatefeepaid(int feepaid)


     {          
    
    this.feepaid=feepaid;
    
     
     }

    public void getstudentId() {
        
        System.out.println("the id of student is:"+id);
    }

    public void getstudentName() {
        
        System.out.println("the name of student is:"+name);
    }

    public void getstudentGrade() {
        
        System.out.println("the grade of student is:"+grade);
    }

    public void getstudentFeepaid() {
        System.out.println("fee pay by the student is:"+ feepaid);
        
    }

   
    public void getstudentFeetotal() {
        
       System.out.println("student total fee is"+feetotal);
       
    }
    
    
     
}

