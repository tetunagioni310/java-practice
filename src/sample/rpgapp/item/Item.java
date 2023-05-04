package sample.rpgapp.item;

public abstract class Item {
	private String name;
    private int price;
    
    public Item(String name, int price) {
        this.setName(name);
        this.setPrice(price);
    }
    
    public void setName(String name) {
    	this.name = name;
    }
    
    public String getName() {
    	return this.name;
    }
    
    public void setPrice(int price) {
    	this.price = price;
    }
    
    public int getPrice() {
    	return this.price;
    }
}
