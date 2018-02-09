public class Potion extends Entity implements ShopItem{
    private int x, y;
    private int potency;
    private String name;
    private int price;

    public Potion(){
    }
    
    public Potion(String n, int potency, int price){
        this.name = name;
        this.potency = potency;
        this.price = price;
    }
    
    public Potion(int x, int y, String n, int potency){
        this.x = x;
        this.y = y;
        this.name = n;
        this.potency = potency;
        this.price = 0;
    }

    public int getX(){
        return this.x;
    }
    
    public void setX(int x){
        this.x = x;
    }

    public int getY(){
        return this.y;
    }
    
    public void setY(int y){
        this.y = y;
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getPotency(){
        return this.potency;
    }
    
    public int getPrice(){
        return price;
    }
    
    public void setPrice(int newPrice){
        this.price = newPrice;
    }

    public String toString(){
        return "Potion";
    }
}