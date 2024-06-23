public class Hufflepuff extends Hogwarts{

    private int diligence;
    private int loyalty;
    private int honest;

    public Hufflepuff(String name, int magicPover, int transgressionDistance, int diligence, int loyalty, int honest) {
        super(name, magicPover, transgressionDistance);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honest = honest;
    }

    public int getDiligence() {
        return diligence;
    }

    public void setDiligence(int diligence) {
        this.diligence = diligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonest() {
        return honest;
    }

    public void setHonest(int honest) {
        this.honest = honest;
    }

    public int sum() {
        return diligence+loyalty+honest;
    }

    public void compare(Hufflepuff other) {
        if (this.sum() > other.sum()) {
            System.out.println(this.getName() + " Лучший пуффендуец, чем " + other.getName());
        } else {
            System.out.println(other.getName() + " Лучший пуффендуец, чем " + this.getName());
        }
    }

    @Override
    public String toString() {
        return "diligence=" + diligence +
                ", loyalty=" + loyalty +
                ", honest=" + honest;
    }
}
