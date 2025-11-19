public class Cube {

    private int side;

    public Cube() {
        side = 1;
    }

    public Cube(int side) {
        if (side<1){
            throw new IllegalArgumentException("A cubes side length must be greater than or equal to 1!");
        }
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        if(side<1){
            throw new IllegalArgumentException("A cubes side length must be greater than or equal to 1!");
        }
        this.side = side;
    }

    public int calculateSurfaceArea() {
        return 6 * side * side;
    }

    public int calculateVolume() {
        return side * side * side;
    }

    public String toString(){
        return "Cube{side=" + side + "}";
    }

    public static void main(String[] args){
    }
}
