public class Ravenclaw extends Hogwarts{

private int creativity;
private int witty;
private int wisdom;
private int intelligence;

    public Ravenclaw(String name, int magicPover, int transgressionDistance, int creativity, int witty, int wisdom, int intelligence) {
        super(name, magicPover, transgressionDistance);
        this.creativity = creativity;
        this.witty = witty;
        this.wisdom = wisdom;
        this.intelligence = intelligence;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    public int getWitty() {
        return witty;
    }

    public void setWitty(int witty) {
        this.witty = witty;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int sum() {
        return creativity+witty+wisdom+intelligence;
    }

    public void compare(Ravenclaw other) {
        if (this.sum() > other.sum()) {
            System.out.println(this.getName() + " Лучший когтевранец, чем " + other.getName());
        } else {
            System.out.println(other.getName() + " Лучший когтевранец, чем " + this.getName());
        }
    }

    @Override
    public String toString() {
        return "creativity=" + creativity +
                ", witty=" + witty +
                ", wisdom=" + wisdom +
                ", intelligence=" + intelligence ;

    }
}
