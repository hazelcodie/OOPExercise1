public class BicycleRegistration {
	static String txt = " owns a bicycle";
	
	public static void main(String args[]) {
		Bicycle b1, b2;
		String o1, o2;
		
		b1 = new Bicycle("Adam Smith", "2000-187T");
		System.out.println(Bicycle.counter + "");
		b2 = new Bicycle("Ben Jones", "2000-132U");
		System.out.println(Bicycle.counter + "");
		o1 = b1.getName();
		o2 = b2.getName();
		
		System.out.println(o1 + txt);
		System.out.println(o2 + " also" + txt);
	}
}