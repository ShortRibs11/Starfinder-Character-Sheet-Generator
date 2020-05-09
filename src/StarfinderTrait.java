
public class StarfinderTrait {
	String name;
	String description;
	
	public StarfinderTrait(String n, String d) {
		name = n;
		description = d;
	}
	
	public String toString() {
		return name + ":\n" + description;
	}
}
