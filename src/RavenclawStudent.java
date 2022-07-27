public class RavenclawStudent extends HogwartsStudent{

    private int intelligence;
    private int wisdom;
    private int wit;
    private int creativity;

    public RavenclawStudent(String name, int magic, int transgression, int intelligence, int wisdom, int wit, int creativity) {
        super(name, magic, transgression);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    public void compareRavenClaw(RavenclawStudent ravenclawStudent){
        int ability1 = ability();
        int ability2 = ravenclawStudent.ability();
        if (ability1 > ability2) {
            System.out.printf("Student %s is better than student %s: %d VS %d%n", getName(), ravenclawStudent.getName(), ability1, ability2);
        } else if (ability2 >  ability1) {
            System.out.printf("Student %s is better than student %s: %d VS %d%n", ravenclawStudent.getName(), getName(), ability1, ability2);
        } else {
            System.out.printf("Student %s has the same level as student %s: %d VS %d%n", ravenclawStudent.getName(), getName(), ability1, ability2);

        }

    }
    private int ability(){
        return intelligence + wisdom + wit + creativity;
    }

    @Override
    public String toString(){
        return String.format("%s; intelligence: %d; wisdom: %d; wit: %d; creativity: %d", super.toString(), intelligence, wisdom, wit, creativity);
    }
}
