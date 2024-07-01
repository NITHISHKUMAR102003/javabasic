package day1;

public class studentdemo {

	public static void main(String[] args) {
		student s1=new student();
		s1.setSid(102);
		s1.setSname("raja");
		s1.setCity("chennai");
		
		  System.out.println("student id:"+s1.getSid());
		  System.out.println("student name:"+s1.getSname());
		  System.out.println("student city:"+s1.getCity());
		  System.out.println(s1);
		 

	}

}
