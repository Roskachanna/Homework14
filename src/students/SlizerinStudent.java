package students;

public class SlizerinStudent extends HogwartsStudents {
    private int cunning;
    private  int determination;
    private int ambitiouness;

    public SlizerinStudent(String name, int magic, int transgressionDistance, int cunning, int determination, int ambitiouness) {
        super(name, magic, transgressionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambitiouness = ambitiouness;
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbitiouness() {
        return ambitiouness;
    }
    private int calculateSumOfAttributes() {
        return cunning + determination + ambitiouness;
    }

    public void compareSlizerinStudent(SlizerinStudent slizerinStudent) {
        if (this.calculateSumOfAttributes() > slizerinStudent.calculateSumOfAttributes()) {
            System.out.println("This больше чем аргумент");
        }else if (calculateSumOfAttributes() < slizerinStudent.calculateSumOfAttributes()) {
            System.out.println("This меньше чем аргумент");
        }else {
            System.out.println("Студенты Хогвартса равны");
        }
    }
}
