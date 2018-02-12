public class Shrine extends Entity{
    private int x, y;
    private int stage;
    
    public Shrine(){
    }
    
    public Shrine(int x, int y, int s){
        this.x = x;
        this.y = y;
        this.stage = s;
    }
    
    public int getX(){
        return this.x;
    }
    
    public int getY(){
        return this.y;
    }
    
    public int getStage(){
        return this.stage;
    }
    
    public String getName(){
        return "Shrine: Stage " + this.stage; 
    }
    
    public String toString(){
        return "Shrine";
    }
}