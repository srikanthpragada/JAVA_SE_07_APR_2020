package oop;

public class Student {
     private String name;
     private int course;
     private int feepaid;
     
     public Student(String name) {
    	 this.name = name;
    	 this.course = 1; 
     }
     
     public Student(String name, int course) {
    	 this.name = name;
    	 this.course = course; 
     }
     
     public Student(String name, int course, int feepaid) {
    	 this.name = name;
    	 this.course = course;
    	 this.feepaid = feepaid;
     }
     
     public void payment(int amount) {
    	 this.feepaid += amount;
     }
     public int getDueAmount() {
    	 if (course == 1)
    		 return 5000 - this.feepaid;
    	 else
    		 return 10000 - this.feepaid;
     }
}
