public class Slytherin extends Hogwarts{

    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lust;

    public Slytherin(String name, int magicPover, int transgressionDistance, int cunning, int determination, int ambition, int resourcefulness, int lust) {
        super(name, magicPover, transgressionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lust = lust;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getLust() {
        return lust;
    }

    public void setLust(int lust) {
        this.lust = lust;
    }

    public int sum() {
        return cunning+determination+ambition+resourcefulness+lust;
    }

    public void compare(Slytherin other) {
        if (this.sum() > other.sum()) {
            System.out.println(this.getName() + " Лучший слизеринец, чем " + other.getName());
        } else {
            System.out.println(other.getName() + " Лучший слизеринец, чем " + this.getName());
        }
    }

    @Override
    public String toString() {
        return "cunning=" + cunning +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness +
                ", lust=" + lust;
    }
}
