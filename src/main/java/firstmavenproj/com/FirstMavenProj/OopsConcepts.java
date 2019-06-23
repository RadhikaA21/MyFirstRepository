package firstmavenproj.com.FirstMavenProj;

public class OopsConcepts {

	static int r=90;
	int t=50;
	public static void main(String[] args) {
		OopsConcepts ref=new OopsConcepts();
		
// printing first value
		System.out.println(r);
		
//printing second value
		ref.printv(10,20);
		
//printing third value
		OopsConcepts.r=30;
		ref.add();
		}
//printing fourth value
	   OopsConcepts ref2=new OopsConcepts();
	   
	

	public void printv(int a,int b)
	{
	int c=a+b;
	System.out.println(c);
	}
	public void add()
	{
		System.out.println(r*t);
	}
	
}
