public abstract class HogwartsStudent {
    private String name;
    private int magic;
    private int transgression;

    public HogwartsStudent (String name, int magic, int transgression) {
        this.name = name;
        this.magic = magic;
        this.transgression = transgression;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMagic() {
        return magic;
    }

    public void setMagic(int magic) {
        this.magic = magic;
    }

    public int getTransgression() {
        return transgression;
    }

    public void setTransgression(int transgression) {
        this.transgression = transgression;
    }

    public void print(){
        System.out.println(this);
    }

    public void compareHogwarts(HogwartsStudent hogwartsStudent){
        int ability1 = ability();
        int ability2 = hogwartsStudent.ability();
        if (ability1 > ability2) {
            System.out.printf("Student %s is better than student %s: %d VS %d%n", getName(), hogwartsStudent.getName(), ability1, ability2);
        } else if (ability2 >  ability1) {
            System.out.printf("Student %s is better than student %s: %d VS %d%n", hogwartsStudent.getName(), getName(), ability2, ability1);
        } else {
            System.out.printf("Student %s has the same level as student %s: %d VS %d%n", hogwartsStudent.getName(), getName(), ability1, ability2);

        }

    }

    private int ability(){
        return magic + transgression;
    }

    @Override
    public String toString(){
        return String.format("Student %s; magic: %d; transgression: %d", name, magic, transgression);

    }


}
