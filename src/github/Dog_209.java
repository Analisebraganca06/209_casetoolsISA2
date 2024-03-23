package github;

public class Dog_209 {
	
	String name;
	String breed;
	
	Dog_209(String name,String breed)
	{
		this.name=name;
		this.breed=breed;
	}
	String display()
	{
		System.out.println("Name:"+name);
		return name;
		
	}
	String display2()
	{
		System.out.println("Breed:"+breed);
		return breed;
		
	}
	String setter( String name)
	{
		this.name=name;
		return name;

	}
	String setter2(String breed)
	{
		this.breed=breed;
		return breed;

	}
class Dog_main {
	public static void main(String[] args) {
		Dog_209 d=new Dog_209("Bingo","Sausage Dog");
		Dog_209 d1=new Dog_209("Lessie","Pug");
		d.display();
		d1.display();
		d.setter("Mill");
		d.display();
		}	


}
}
