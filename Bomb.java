public class Bomb extends Entity implements ShopItem{
    private int price;
    private String name;
    
    public Bomb(){
    }

    public Bomb(String name, int price){
        this.name = name;
        this.price = price;
    }

    public int getX(){
        return 0;
    }
    
    public int getY(){
        return 0;
    }
    
    public int getPrice(){
        return price;
    }

    public String getName(){
        return this.name;
    }
}