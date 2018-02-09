public class Satchel extends Entity implements ShopItem{
    private int size, price;
    private String name;

    public Satchel(){
        size = 0;
        name = null;
        price = 0;
    }

    public Satchel(int size, String name, int price){
        this.size = size;
        this.name = name;
        this.price = price;
    }

    public int getSize(){
        return size;
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