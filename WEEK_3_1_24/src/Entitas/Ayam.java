package Entitas;

public class Ayam {
    String name;
    int health,energy;
    boolean bernyawa = true;
    public Ayam(String name) {
        this.name = name;
        this.health = 50;
        this.energy = 50;
    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getHealth() {
        return health;
    }
    public void setHealth(int health) {
        this.health = health;
    }
    public int getEnergy() {
        return energy;
    }
    public void setEnergy(int energy) {
        this.energy = energy;
    }
    public boolean isBernyawa() {
        return bernyawa;
    }
    public void setBernyawa(boolean bernyawa) {
        this.bernyawa = bernyawa;
    }

    
    

}
