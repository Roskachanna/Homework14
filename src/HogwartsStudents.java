abstract public class HogwartsStudents {
    private final int magic;
    private final int transgressionDistance;

    public HogwartsStudents(int magic, int transgressionDistance) {
        this.magic = magic;
        this.transgressionDistance = transgressionDistance;
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

    }
}
