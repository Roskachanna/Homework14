package students;

public class PurffendyiStudent extends HogwartsStudents {
    private int hardworking;
    private int loyal;
    private int honest;

    public PurffendyiStudent(String name, int magic, int transgressionDistance, int hardworking, int loyal, int honest) {
        super(name, magic, transgressionDistance);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }

    public int getHardworking() {
        return hardworking;
    }

    public int getLoyal() {
        return loyal;
    }

    public int getHonest() {
        return honest;
    }
    private int calculateSumOfAttributes() {
        return hardworking + loyal + honest;
    }

    public void comparePurffendyiStudent(PurffendyiStudent purffendyiStudent) {
        if (this.calculateSumOfAttributes() > purffendyiStudent.calculateSumOfAttributes()) {
            System.out.println("This больше чем аргумент");
        }else if (calculateSumOfAttributes() < purffendyiStudent.calculateSumOfAttributes()) {
            System.out.println("This меньше чем аргумент");
        }else {
            System.out.println("Студенты Хогвартса равны");
        }
    }
}
