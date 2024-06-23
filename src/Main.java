public class Main {
    public static void main(String[] args) {

        Hogwarts dambldore = new Hogwarts("Альбус", 100, 100);

        Gryffindor harry = new Gryffindor("Гарри", 60, 23, 23, 56,23);
        Gryffindor ron = new Gryffindor("Рон", 30, 40, 52, 70,30);
harry.compare(ron);
harry.compare(dambldore);

        Slytherin drako = new Slytherin("Драко",70,60,30,50,80,42,39);
        Slytherin grab = new Slytherin("Грэб",40,50,20,43,11,24,40);

        drako.compare(grab);
        drako.compare(harry);

    }
}