package oop;

public class Student {
     private String name;
     private int course;
     private int feepaid;
     
     private final static int TAXRATE = 15;
     private final static int PYTHON_FEE = 5000;
     private final static int DS_FEE = 10000;
     
     public Student(String name) {
    	 this.name = name;
    	 this.course = 1; 
     }
     
     public Student(String name, int course) {
    	 this.name = name;
    	 this.course = course; 
    	 assert course == 1 || course == 2 : "Invalid course code!";
     }
     
     public Student(String name, int course, int feepaid) {
    	 this.name = name;
    	 this.course = course;
    	 this.feepaid = feepaid;
     }
     
     public void payment(int amount) {
    	 this.feepaid += amount;
     }
     
     public String getName() {
    	 return this.name;
     }
     
     public String getCourseName() {
    	 return  this.course== 1 ? "Python" : "Data Science";
     }
     
     public int getTotalFee() {
    	 if (this.course == 1)
    		 return PYTHON_FEE + PYTHON_FEE * Student.TAXRATE / 100;
    	 else
    		 return DS_FEE + DS_FEE * Student.TAXRATE / 100;
     }
     
     public int getDueAmount() {
    	  return  getTotalFee() - feepaid;
     }
}
