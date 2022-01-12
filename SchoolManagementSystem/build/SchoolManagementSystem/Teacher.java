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
public class Teacher extends School {
    
    
  private  final int id;
  
  private final String name;
  
  private final int salary;  
  
  
 
  
  /**
   
   * @param id
   * @param name
   * @param salary 
   */
    
  public Teacher(int id,String name,int salary)
          
  {
  this.id=id;
  
  this.name=name;
  
  this.salary=salary;
  
  }
  
    
    public void getteacherid()
  {
  
  System.out.println("The id of teacher is:"+id);
  
  }
    
  
  public void getteachername()
   
  {      
  System.out.println("the teacher name is:" + name);
    
}


    public void getteachersalary()
{
   System.out.println("the salary of teascher is:"+salary);
    
}

 
}

