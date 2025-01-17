package github;

public abstract class Shape_209 {
		public abstract void calculatePerimeter();
		public abstract void calculateArea();
	}

class Circle extends Shape_209{
	float r;
	double pi=3.14,area,perimeter;
	Circle(float r)
	{
		this.r=r;
	}
	public void calculatePerimeter()
	{
		perimeter=2*pi*r;
	}
	public void calculateArea()
	{
		area=pi*r*r;
	}
	public void display()
	{
		System.out.println("Area:"+area+" Perimeter:"+perimeter);
	}
}

class Triangle extends Shape_209{
	int base,height,a,b,c,perimeter;
	double area;
	Triangle(int base,int height,int a,int b,int c)
	{
		this.base=base;
		this.height=height;
		this.a=a;
		this.b=b;
		this.c=c;
	}
	public void calculatePerimeter()
	{
		perimeter=a+b+c;
	}
	public void calculateArea()
	{
		area=0.5*base*height;
	}
	public void display()
	{
		System.out.println("Area:"+area+" Perimeter:"+perimeter);
	}
}
class shapes_main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Circle c=new Circle(5);
		Triangle t=new Triangle(3,5,4,2,6);
		c.calculateArea();
		c.calculatePerimeter();
		c.display();
		t.calculateArea();
		t.calculatePerimeter();
		t.display();
		}
}
