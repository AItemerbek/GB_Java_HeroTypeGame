package units;

public class Coordinates {
    public int x,y;

    public Coordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return " Position(" + x + "," + y + ")";
    }

    public float distance(Coordinates enemyCoord){
        return (float) Math.sqrt(Math.pow(x - enemyCoord.x,2) + Math.pow(y - enemyCoord.y,2));
    }

    public Coordinates deltaCoordinates(HeroBase enemy){
        Coordinates enemyCoordinates = enemy.position;
        return new Coordinates(this.x - enemyCoordinates.x,this.y - enemyCoordinates.y );
    }
}
