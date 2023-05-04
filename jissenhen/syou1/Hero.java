package syou1;
import java.util.Objects;

public class Hero implements Cloneable {
	String name;
	int hp;
	Sword sword;
	
	public Hero(String name, int hp) {
		this.name = name;
		this.hp = hp;
	}
	
	public Hero(String name) {
		this.name = name;
		this.hp = 20;
	}
	
	public Hero() {
		this.name = "";
		this.hp = 0;
	}
	
	public void setSword(Sword s) {
		this.sword = s;
	}
	
	public Sword getSword() {
		return this.sword;
	}
	
	public boolean equals(Object o) {
		if (o == this) return true;
		if (o == null) return false;
		if (!(o instanceof Hero)) return false;
		Hero r = (Hero)o;
		if (!this.name.trim().equals(r.name.trim())) {
			return false;
		}
		return true;
	}
	
	public int hashCode() {
		return Objects.hash(this.name, this.hp);
	}
	
	public Hero clone() {
		Hero result = new Hero();
		result.name = this.name;
		result.hp = this.hp;
		result.sword = this.sword.clone();
		return result;
	}
}
