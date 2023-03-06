package students;

abstract public class HogwartsStudents {
    private final String name;
    private final int magic;
    private final int transgressionDistance;

    public HogwartsStudents(String name,int magic, int transgressionDistance) {
        this.name = name;
        this.magic = magic;
        this.transgressionDistance = transgressionDistance;
    }
    public String getName(){
        return name;
    }
    public int getMagic() {
        return magic;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    private int calculateBasicAttributesSum() {
        return magic + transgressionDistance;
    }
    public void compareByBasicAttributes(HogwartsStudents hogwartsStudents) {
        if (calculateBasicAttributesSum() > hogwartsStudents.calculateBasicAttributesSum()) {
            System.out.println("This больше чем аргумент");
        }else if (calculateBasicAttributesSum() < hogwartsStudents.calculateBasicAttributesSum()) {
            System.out.println("This меньше чем аргумент");
        }else {
            System.out.println("Студенты Хогвартса равны");
        }
    }


}
