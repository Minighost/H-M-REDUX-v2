import java.io.*;
import java.util.*;

public class Hero extends Entity{
    private int x, y;
    private int hp, dmg, hides;
    private String name;
    private Weapon weapon;
    private Armor armor;
    private Entity[] storage;
    private Footwear footwear;
    int index = 0;
    private boolean phoenixMode;
    private boolean hasBomb;
    private int vision;

    public Hero(){
    }
    
    public Hero(int x, int y, Weapon w, Armor a, int hides, int vision, String n){
        this.x = x;
        this.y = y;
        this.hp = 100;
        this.dmg = 10;
        this.weapon = w;
        this.armor = a;
        this.hides = 0;
        this.storage = new Entity[2];
        this.name = n;
        this.hides = hides;
        this.footwear = new Footwear(0, "Bare Feet", 0);
        this.vision = vision;
    }
    
    public void buyObject(int objectNumber, Farmer farmer){
        if(index >= storage.length){
            return;
        }
        if(objectNumber == 0 || objectNumber > 9){
            return;
        }
        ShopItem item = farmer.getItem(objectNumber - 1);
        if(item == null){
            System.out.println("Cannot purchase.");
            return;
        }
        if(hides < item.getPrice()){
            return;
        }else{
            farmer.shopItems[objectNumber-1] = null;
            hides -= item.getPrice();
            if((item.getClass()).isInstance(new Potion(null, 0, 0))){
                storage[index] = (Potion)item;
                index++;
            }
            if((item.getClass()).isInstance(new Bomb(null, 0))){
                storage[index] = (Bomb)item;
                index++;
            }
            if((item.getClass()).isInstance(new Armor(0, null, 0))){
                storage[index] = (Armor)item;
                index++;
            }
            if((item.getClass()).isInstance(new Satchel(0, null, 0))){
                storage = Arrays.copyOf(storage, ((Satchel)item).getSize());
            }
            if((item.getClass()).isInstance(new Footwear(0, null, 0))){
                footwear = (Footwear)item;
            }
            if((item.getClass()).isInstance(new Weapon())){
                addToStorage((Weapon)item);
            }
            System.out.println(item.toString() + " bought.");
        }
    }
    
    public int getX(){
        return this.x;
    }
    
    public void setX(int newX){
        this.x = newX;
    }
    
    public int getY(){
        return this.y;
    }
    
    public void setY(int newY){
        this.y = newY;
    }

    public int getHP(){
        return this.hp;
    }

    public void setHP(int newHP){
        this.hp = newHP;
    }

    public int getDMG(){
        return this.dmg;
    }

    public void setDMG(int newDMG){
        this.dmg = newDMG;
    }
    
    public int getHides(){
        return this.hides;
    }
    
    public void setHides(int newHides){
        this.hides = newHides;
    }

    public Weapon getWeapon(){
        return this.weapon;
    }

    public void setWeapon(Weapon newWeap){
        this.weapon = newWeap;
    }

    public Armor getArmor(){
        return this.armor;
    }

    public void setArmor(Armor newArmor){
        this.armor = newArmor;
    }
    
    public Footwear getFootwear(){
        return footwear;
    }
    
    public void setFootwear(Footwear footwear){
        this.footwear = footwear;
    }
    
    public void addToStorage(Entity item){
        if(index >= storage.length){
            return;
        }else{
            if((item.getClass()).isInstance(new Weapon())){
                storage[index] = (Weapon)item;
                index++;
            }
            if((item.getClass()).isInstance(new Armor())){
                storage[index] = (Armor)item;
                index++;
            }
            if((item.getClass()).isInstance(new Potion())){
                storage[index] = (Potion)item;
                index++;
            }
        }
    }
    
    public int getIndex(){
        return index;
    }
    
    public void setIndex(int newIndex){
        this.index = newIndex;
    }
    
    public boolean hasPhoenix(){
        return phoenixMode;
    }
    
    public void setPhoenixMode(boolean mode){
        this.phoenixMode = mode;
    }
    
    public boolean hasBomb(){
        return hasBomb;
    }
    
    public void setHasBomb(boolean hasBomb){
        this.hasBomb = hasBomb;
    }
    
    public Entity[] getHardStorage(){
        return this.storage;
    }
    
    public String getPocketsContents(){
        String return_str = "";
        for(int i = 0; i < storage.length; i++){
            return_str += storage[i].getName() + ", ";
        }
        return return_str;
    }
    
    public int getVision(){
        return vision;
    }
    
    public void setVision(int newVision){
        vision = newVision;
    }
    
    public String getName(){
        return this.name;
    }

    public String toString(){
        return "Name: " + this.name + "\nHP: " + this.hp + "\nWeapon: " + this.weapon.getName() +
        "\nDamage: " + this.dmg + "\nArmor: " + this.armor.getName() + "\nHides: " + this.getHides();
    }
}