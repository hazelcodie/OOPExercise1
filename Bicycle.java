public class Bicycle {
	public static int counter = 0;
	private String name, tag;
	public Bicycle(String name, String tag) {
		this.name = name;
		this.tag = tag;
		counter++;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getTag() {
		return tag;
	}
	
	public void setTag(String tag) {
		this.tag = tag;
	}
}