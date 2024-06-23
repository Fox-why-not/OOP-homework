public class Gryffindor extends Hogwarts{

    private int nobility;
    private int honor;
    private int bravery;


    public Gryffindor(String name, int magicPover, int transgressionDistance, int nobility, int honor, int bravery) {
        super(name, magicPover, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    public int sum() {
        return bravery+honor+nobility;
    }

    public void compare(Gryffindor other){
if (this.sum() > other.sum()){
    System.out.println(this.getName() + " Лучший гриффиндорец, чем " + other.getName());
}else {
    System.out.println(other.getName() + " Лучший гриффиндорец, чем " + this.getName());
}

    }

    @Override
    public String toString() {
        return super.toString() +
                ", nobility=" + nobility +
                ", honor=" + honor +
                ", bravery=" + bravery;
    }
}
