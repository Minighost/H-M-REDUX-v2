public class Hero extends Entity{
    private int x, y;
    private int hp, dmg, hides;
    private String name;
    private Weapon weapon;
    private Armor armor;
    private int gold;

    public Hero(){
        
    }
    
    public Hero(int x, int y, Weapon w, Armor a){
        this.x = x;
        this.y = y;
        this.hp = 100;
        this.dmg = 10;
        this.weapon = w;
        this.armor = a;
        this.hides = 0;
        this.gold = 0;
    }
    
    public int getGold(){
        return gold;
    }
    
    public void setGold(int newGold){
        this.gold = newGold;
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

    public String toString(){
        return "Name: " + this.name + ", HP: " + this.hp + ", Weapon: " + this.weapon.toString() + ", Damage: " + this.dmg + ", Armor: " + this.armor.toString();
    }
}