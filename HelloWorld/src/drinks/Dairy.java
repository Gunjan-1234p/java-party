package drinks;

public class Dairy {
	public static Dairy dairyclssobj = null;
	private Dairy(){
		
	}
	public static Dairy getDairy() {
		if (dairyclssobj==null) {
			 dairyclssobj = new Dairy();
			 return dairyclssobj;
		}
		return dairyclssobj;	
	}
	static String brandname = "  oompaa..lumpaa..Drinks";
public static void main(String[] args) {

	System.out.println(brandname);
	
	Chocolateee.chocolatee();
	Chocolate1.chocola1();
	
}}
class Chocolateee {
	public static void chocolatee() {
		
	 Dairy.brandname = "..Gunjan Drinks";
	 System.out.println("The brand name now is " + Dairy.brandname);
	}	
}
class Chocolate1  {
	static String bnameString = Dairy.brandname;
	public static void chocola1() {
	 System.out.println("The brand name now is " + bnameString);
	}
}