package github;

public class Person_209 {
	
	String name;
	int age;
	
	Person_209(String name,int age)
	{
		this.name=name;
		this.age=age;
	}

	String getname()
	{
		return name;
		
	}
	int getage()
	{
		return age;
		
	}
	void setname(String name)
	{
		this.name=name;
	
		
	}
	void setage(int age)
	{
		this.age=age;
	}
	public void display_values(){
		System.out.println("Name:"+name+" Age:"+age);
	}
	
}
class person_main {
	public static void main(String[] args) {
		Person_209 p=new Person_209("Symone",20);
		Person_209 p1=new Person_209("Nazia",25);
		p.display_values();
		p1.display_values();
	}
}
	
