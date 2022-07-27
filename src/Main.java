import java.util.Random;

public class Main {

    private static final Random RANDOM = new Random();
    public static void main(String[] args) {
        GryffindorStudent harry = generateGryffindorStudent("Harry Potter");
        GryffindorStudent ron = generateGryffindorStudent("Ron Weasley");
        RavenclawStudent jou = generateRavenclawStudent("Jou Chang");
        SlytherinStudent draco = generateSlytherinStudent("Draco Malfoy");
        HufflepuffStudent cedric = generateHufflepuffStudent("Cedric Diggory");

        harry.print();
        ron.print();
        jou.print();
        draco.print();
        cedric.print();

        harry.compareHogwarts(draco);
        harry.compareGryffindor(ron);



    }

    private static GryffindorStudent generateGryffindorStudent(String name) {
        return new GryffindorStudent (
                name,
                RANDOM.nextInt (100),
                RANDOM.nextInt (100),
                RANDOM.nextInt (100),
                RANDOM.nextInt (100),
                RANDOM.nextInt (100)
        );
    }

    private static RavenclawStudent generateRavenclawStudent(String name){
        return new RavenclawStudent(
                name,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100)
        );
    }

    private static HufflepuffStudent generateHufflepuffStudent(String name) {
        return new HufflepuffStudent (
                name,
                RANDOM.nextInt (100),
                RANDOM.nextInt (100),
                RANDOM.nextInt (100),
                RANDOM.nextInt (100),
                RANDOM.nextInt (100)

        );
    }
    private static SlytherinStudent generateSlytherinStudent(String name) {
        return new SlytherinStudent (
                name,
                RANDOM.nextInt (100),
                RANDOM.nextInt (100),
                RANDOM.nextInt (100),
                RANDOM.nextInt (100),
                RANDOM.nextInt (100),
                RANDOM.nextInt (100),
                RANDOM.nextInt (100)
        );
    }
}