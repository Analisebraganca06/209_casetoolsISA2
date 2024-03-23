package github;

public class Student_209 {
	
	String name,address;
	int age;
	Student_209()
	{
		age=0;
		name="unknown";
		address="not available";
	}
	public void setInfo(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	public void setInfo(String name,int age,String address)
	{
		this.name=name;
		this.age=age;
		this.address=address;
	}
	
	public void display()
	{
	System.out.println("Name:"+name+" Age:"+age+" Address:"+address);
	}
}
class Student_main {
	public static void main(String[] args) {
	
	Student_209[] arr = new Student_209[3];
	arr[0]=new Student_209();
	arr[1]=new Student_209();
	arr[2]=new Student_209();
	arr[0].setInfo("Alia",20);
	arr[1].setInfo("Ananya",25,"Panjim");
	arr[1].setInfo("Ana",21,"Porvorim");

	arr[0].display();
	arr[1].display();
	arr[2].display();
	
	}
}

