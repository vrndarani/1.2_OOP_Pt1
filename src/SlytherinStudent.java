public class SlytherinStudent extends HogwartsStudent {
    private int cunning;
    private int determined;
    private int ambition;
    private int ingenuity;
    private int thirstForPower;

    public SlytherinStudent(String name, int magic, int transgression, int cunning, int determined, int ambition, int ingenuity, int thirstForPower) {
        super(name, magic, transgression);
        this.cunning = cunning;
        this.determined = determined;
        this.ambition = ambition;
        this.ingenuity = ingenuity;
        this.thirstForPower = thirstForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermined() {
        return determined;
    }

    public void setDetermined(int determined) {
        this.determined = determined;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getIngenuity() {
        return ingenuity;
    }

    public void setIngenuity(int ingenuity) {
        this.ingenuity = ingenuity;
    }

    public int getThirstForPower() {
        return thirstForPower;
    }

    public void setThirstForPower(int thirstForPower) {
        this.thirstForPower = thirstForPower;
    }

    public void compareSlytherin(SlytherinStudent slytherinStudent){
        int ability1 = ability();
        int ability2 = slytherinStudent.ability();
        if (ability1 > ability2) {
            System.out.printf("Student %s is better than student %s: %d VS %d%n", getName(), slytherinStudent.getName(), ability1, ability2);
        } else if (ability2 >  ability1) {
            System.out.printf("Student %s is better than student %s: %d VS %d%n", slytherinStudent.getName(), getName(), ability1, ability2);
        } else {
            System.out.printf("Student %s has the same level as student %s: %d VS %d%n", slytherinStudent.getName(), getName(), ability1, ability2);

        }

    }
    private int ability(){
        return cunning + determined + ambition + ingenuity + thirstForPower;
    }
    @Override
    public String toString() {
        return String.format ("%s; cunning: %d; determined: %d; ambition: %d; ingenuity: %d; thirstForPower: %d",
                super.toString(),
                cunning,
                determined,
                ambition,
                ingenuity,
                thirstForPower
        );
    }
}
