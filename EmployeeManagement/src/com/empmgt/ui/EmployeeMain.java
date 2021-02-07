package com.empmgt.ui;

import com.empmgt.entities.*;

public class EmployeeMain {

	public static void main(String[] args) {
		EmployeeMain project=new EmployeeMain();
		project.run();
		
	}
       public void run()
       {
    	   Department d1=new Department("181","Developer");
    	   Department d2=new Department("182","Developer");
    	   Department d3=new Department("183","Tester");
    	   Department d4=new Department("184","Tester");
    	   
    	   Employee e1=new Developer(12,"Dhruv",d1,"Java");
    	   Employee e2=new Developer(14,"Pranjal",d2,"C");
    	   Employee e3=new Tester(15,"Riya",d3,"Console");
    	   Employee e4=new Tester(16,"Parul",d4,"SpringSuite");
    	   
    	   Employee employees[]=new Employee[4];
    	   employees[0]=e1;
    	   employees[1]=e2;
    	   employees[2]=e3;
    	   employees[3]=e4;
    	   
    	   for(int i=0; i<4; i++)
    	   {
    		   if(employees[i] instanceof Developer)
    		   {
    			   Developer employee = (Developer) employees[i];
    			   displayDeveloper(employee);
    		   }
    		   else
    		   {
    			   Tester employee = (Tester) employees[i];
    			   displayTester(employee);
    		   }
    	   }
       }
       public void displayCommon(Employee e)
       {
    	   Department d=e.getDepartment();
    	   System.out.println(e.getId()+" "+e.getName()+" "+d.getDeptId()+" "+d.getDeptName());
    	   
       }
       public void displayDeveloper(Developer e)
       {
    	   displayCommon(e);
    	   System.out.println("Language Used by User : "+ e.getLanguage());
    	   
       }
       public void displayTester(Tester e)
       {
    	   displayCommon(e);
    	   System.out.println("Tools Used by User : "+ e.getTools());
    	   
       }
}
