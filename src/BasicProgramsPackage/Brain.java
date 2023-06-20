package BasicProgramsPackage;

public class Brain {

	private int age;
	 private String name;     // ________Encapsulation _______
	 
	public int getAge() {
		return age;
		
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
		
	}
	public void setName(String name) {
		this.name = name;
		
	}
	  
	public Brain() {   // 1) default constructor
		age  = 11;
		name = "Mohammed";
		System.out.println("its constructor");
		
	}
	
	public Brain(int a, String n) {  // 2) Parameterized constructor
		age = a;
		name= n;
		
	}
		public static void main(String[] args) {
			 Brain br = new Brain();
	         Brain br1 = new Brain(19,"bhai");
	         Brain br2 = new Brain();
            	br.setName("nazar");
            	br.setAge(17);
            	System.out.println(br.getName() + " " +br.getAge());
        		System.out.println(br1.getName() + " " +br1.getAge());
		}
	
 }

