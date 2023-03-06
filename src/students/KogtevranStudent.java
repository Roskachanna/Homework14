package students;

public class KogtevranStudent extends HogwartsStudents {
    private int wise;
    private int witty;
    private int creativity;

    public KogtevranStudent(String name, int magic, int transgressionDistance, int wise, int witty, int creativity) {
        super(name, magic, transgressionDistance);
        this.wise = wise;
        this.witty = witty;
        this.creativity = creativity;
    }

    public int getWise() {
        return wise;
    }

    public int getWitty() {
        return witty;
    }

    public int getCreativity() {
        return creativity;
    }
    private int calculateSumOfAttributes() {
        return wise + witty + creativity;
    }

    public void compareKogtevranStudent(KogtevranStudent kogtevranStudent) {
        if (this.calculateSumOfAttributes() > kogtevranStudent.calculateSumOfAttributes()) {
            System.out.println("This больше чем аргумент");
        }else if (calculateSumOfAttributes() < kogtevranStudent.calculateSumOfAttributes()) {
            System.out.println("This меньше чем аргумент");
        }else {
            System.out.println("Студенты Хогвартса равны");
        }
    }
}
