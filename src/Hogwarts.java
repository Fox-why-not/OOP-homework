public class Hogwarts {

    private String name;
    private int magicPover;
    private int transgressionDistance;

    public Hogwarts(String name, int magicPover, int transgressionDistance) {
        this.name = name;
        this.magicPover = magicPover;
        this.transgressionDistance = transgressionDistance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMagicPover() {
        return magicPover;
    }

    public void setMagicPover(int magicPover) {
        this.magicPover = magicPover;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public void setTransgressionDistance(int transgressionDistance) {
        this.transgressionDistance = transgressionDistance;
    }


    public void compare(Hogwarts other) {

        if (magicPover > other.magicPover) {
            System.out.println(name + " обладает большей мощностью магии, чем " + other.getName());
        } else {
            System.out.println(other.getName() + " обладает большей мощностью магии, чем " + name);
        }

        if (transgressionDistance > other.transgressionDistance) {
            System.out.println(name + " обладает большей дистанцией магии, чем " + other.getName());
        } else {
            System.out.println(other.getName() + " обладает большей дистанцией магии, чем " + name);
        }
    }

    @Override
    public String toString() {
        return "Hogwarts{" +
                "name='" + name + '\'' +
                ", magicPover=" + magicPover +
                ", transgressionDistance=" + transgressionDistance +
                '}';
    }
}
