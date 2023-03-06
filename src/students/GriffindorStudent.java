package students;

public class GriffindorStudent extends HogwartsStudents {

    private int nobility;
    private int honor;
    private int courage;

    public GriffindorStudent(String name, int magic, int transgressionDistance, int nobility, int honor, int courage) {
        super(name, magic, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getCourage() {
        return courage;
    }
    private int calculateSumOfAttributes(){
        return nobility + honor + courage;
    }
    public void compareGriffindorStudent(GriffindorStudent griffindorStudent) {
        if (this.calculateSumOfAttributes() > griffindorStudent.calculateSumOfAttributes()) {
            System.out.println("This больше чем аргумент");
        }else if (calculateSumOfAttributes() < griffindorStudent.calculateSumOfAttributes()) {
            System.out.println("This меньше чем аргумент");
        }else {
            System.out.println("Студенты Хогвартса равны");
        }
    }
}
