
public class SubClass extends SuperClass {
	String s = "SubClass variable";
	SubClass(){
		super();
		System.out.println("sub class constructure");
	}
 void getsData() {
	 
	 System.out.println(s);
	 System.out.println(this.s);
	 System.out.println(super.s);
	 System.out.println("**********************");
     super.superClassMethod();
     superClassMethod();
 
 }
}
