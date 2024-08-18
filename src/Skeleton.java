public class Skeleton extends Boss {
    private int numberOfArrows;

    public Skeleton(int health, int damage, Weapon weapon, int numberOfArrows) {
        super(health, damage, weapon);
        this.numberOfArrows = numberOfArrows;
    }

    public int getNumberOfArrows() {
        return numberOfArrows;
    }

    public void setNumberOfArrows(int numberOfArrows) {
        this.numberOfArrows = numberOfArrows;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Number of Arrows: " + numberOfArrows);
    }
}
