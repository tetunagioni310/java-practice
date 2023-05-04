package syou1;

public class Sword implements Cloneable {
	private String name;
	
	public Sword(String name) {
		this.name = name;
	}
	
	public Sword() {
		this.name = "";
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name =  name;
	}
	
	public Sword clone() {
		Sword result = new Sword();
		result.name = this.name;
		return result;
	}
}