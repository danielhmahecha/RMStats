package RMStats;
import java.util.HashSet;

public class repeatClass {
	private String name;
	private HashSet<String> families = new HashSet<>();
	
	public repeatClass(){
		
	}
	
	public void setName (String name) {
		this.name=name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public HashSet<String> getFamilies(){
		return this.families;
	}
	
	public void addFamily(String family) {
		families.add(family);
	}
}

