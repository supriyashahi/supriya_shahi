import java.util.Scanner;

/**
 * Animal.java
 * CS230 Lab on creating java user-defined classes.
 * Uses static var and method.
 * It uses command-line arguments
 * 
 * @author Sohie and Stella
 *
 */

public class Animal {
    // static variables
    private static int numOfAnimals = 0;// the number of all animal objects created

    // instance variables
    private String type; // like dog
    private String name; // like Spot
    private String voice; // like woof
    private boolean canFly;
    private int numberLegs;
    private int id; // unique for each Animal instance

    /**
     * @param t       the type of the animal
     * @param n       the name of the animal
     * @param v       the voice of the animal
     * @param fly     boolean, to indicate wether the animal can fly or not
     * @param numLegs the number of legs of this animal
     * @param health  boolean to indicate the good/bad health of this animal
     *
     */
    public Animal(String t, String n, String v,
            boolean fly, int numlegs) {
        this.type = t;
        this.name = n;
        voice = v;
        this.canFly = fly;
        this.numberLegs = numlegs;

        numOfAnimals++; // every time the constructor is called,
        // one more object of type Animal gets created

        id = numOfAnimals;
    }

    /**
     * It constructs an animal with the given type and name.
     * By default the animal is silent (no voice), has 4 legs,
     * cannot fly, and it is in good health
     *
     * @param t the type of the animal
     * @param n the name of the animal
     */
    public Animal(String t, String n) {
        this(t, n, "", false, 4);
    }

    /**
     * sets instance variable canFly to be true
     */
    public void tookFlyingLessons() {
        canFly = true;
    }

    /**
     * sets instance variable voice to be the empty string
     */
    public void caughtLaryngitis() {
        voice = "";
    }

    /**
     * sets instance variable voice to be "meow"
     */
    public void likesToImitateCats() {
        voice = "meow";
    }

    /**
     * Returns the voice of this animal
     *
     * @return The voice of this animal
     */
    public String getVoice() {
        return voice;
    }

    /**
     * Returns the type of the animal
     *
     * @return The type of this animal
     */
    public String getType() {
        return type;
    }

    /**
     * Returns the name of the animal
     *
     * @return The name of this animal
     */
    public String getName() {
        return name;
    }

    /**
     * Returns whether the animal can fly or not
     *
     * @return true if this animal can fly, false otherwise
     */
    public boolean getCanFly() {
        return canFly;
    }

    /**
     * Returns the number of legs of this animal
     *
     * @return the number of legs of this animal
     */
    public int getNumberLegs() {
        return numberLegs;
    }

    /**
     * Sets the voice of this animal to the input value
     *
     * @param the new voice of this animal
     */
    public void setVoice(String v) {
        voice = v;
    }

    /**
     * Sets the name of this animal to the input value
     *
     * @param the new name of this animal
     */
    public void setName(String n) {
        name = n;
    }

    /**
     * Sets the type of this animal to the input value
     *
     * @param the new type of this animal
     */
    public void setType(String t) {
        type = t;
    }

    /**
     * Sets the flying status of this animal to the input value
     *
     * @param the new flying of this animal
     */
    public void setCanFly(boolean fly) {
        canFly = fly;
    }

    /**
     * Prints the value of the voice of this animal 3 times
     */
    public void speak() {
        System.out.println(voice + " " + voice + " " + voice);
    }

    /**
     * Sets the number of legs of this animal to the input value
     *
     * @param the new number of legs for this animal
     */
    public void setNumberLegs(int legs) {
        numberLegs = legs;
    }

    /**
     * Returns a string representation of this animal
     *
     * @return A string containing all atributes of this animal
     */
    public String toString() {
        String s = "";
        String doesItFly = canFly ? "" : "not";

        s += name + " is a " + type + " with " + numberLegs +
                " legs" + " that can" + doesItFly + " fly" +
                " that says " + voice + ". It's id is " + id + ".";

        return s;
    }

    /*
     * Returns a string representation of conversation between two animals.
     * (the invoker and the input one)
     *
     * @param The animal this one is conversing with
     * 
     * @return The conversation between the two animals
     */
    public String converse(Animal other) {
        String header = "A conversation between " + this.name + " and " + other.name + ":" + "\n";
        String space = " ";
        String convo = space + this.voice + "\n";

        convo += space + other.voice + "\n";
        convo += space + this.voice + "\n";
        convo += space + other.getVoice() + "\n";

        return header + convo;
    }

    /**
     * Returns true if this animal and the input one have
     * the same type and the same name, false othrwise
     * 
     * @param The animal to be compared to this one
     * @return true if the two animals are the same, false otherwise
     */

    public boolean equals(Animal other) {
        return (this.type).equals(other.type) &&
                (this.name).equals(other.name);
    }

    /*
     * Uses a scanner to read information about an animal from the user.
     * Then it creates the animal, and at the end returns it.
     * 
     * @return Animal instance, created according
     * to the input collected from the user
     */
    public static Animal readAndCreateAnimal() {
        Scanner s = new Scanner(System.in);

        // ask for and read input from the user
        System.out.println("What kind of animal is this?");
        String kind = s.nextLine();

        System.out.println("What is the name of it?");
        String name = s.nextLine();

        System.out.println("What sound does it make?");
        String sound = s.nextLine();

        System.out.println("Can it fly (true/false)?");
        boolean fly = s.nextBoolean();

        System.out.println("How many legs does it have?");
        int legs = s.nextInt();

        boolean h = true;
        System.out.println("Is this animal in good health (y/n)?");
        String str = s.next();
        if (str.equalsIgnoreCase("n")) {
            h = false;
        }

        // Create the animal and return it
        return new Animal(kind, name, sound, fly, legs);
    }

    /**
     * main() method for testing
     *
     */
    public static void main(String[] args) {
        System.out.println("--------------Starting Round 1--------------");

        System.out.println("(expect 0) So far, " + Animal.numOfAnimals + " animals have been created.\n");

        Animal pet1 = new Animal("spider", "charlotte", " ", false, 8);
        Animal pet2 = new Animal("dog", "lassie");
        Animal pet3 = new Animal("frog", "bill", "ribbit", false, 4);
        System.out.println(pet1);
        System.out.println(pet2);
        System.out.println(pet3);

        Animal a;

        // use command-line args
        if (args.length >= 2) {
            a = new Animal(args[0], args[1]);
        } else {
            System.out.println("This program expects two command-line args");
        }

        System.out.println("(expect 3 or 4) So far, " + Animal.numOfAnimals + " animals have been created.\n");

        /*
         * System.out.println("animal's name: " + a1.getName());
         * System.out.println("animal's voice: " + a1.getVoice());
         * System.out.println("can the animal fly: " + a1.getCanFly());
         * System.out.println("number of legs the animal has: " +
         * a1.getNumberLegs());
         * 
         * System.out.println(pet3);
         * System.out.println(pet3.getType());
         * pet3.setType("prince");
         * System.out.println(pet3.getType());
         * pet3.setNumberLegs(2);
         * System.out.println(pet3);
         * System.out.println("--------------Ending Round 1--------------");
         * 
         * System.out.println("--------------Starting Round 2--------------");
         * Animal a2 = new Animal("cow","helga","moooo",false,4);
         * System.out.println(a1.conversation(a2));
         * 
         * a1.setVoice("everyone dance!");
         * System.out.println(a1.conversation(a2));
         * System.out.println("--------------Ending Round 2--------------");
         * 
         * Animal a3 = new Animal("dog","lassie");
         * System.out.println(a3);
         * 
         * Animal a4 = new Animal("flamingo","pinky");
         * System.out.println(a4);
         * 
         * a1.speak();
         * 
         * System.out.println(pet1);
         * pet1.speak();
         * 
         * System.out.println(pet2);
         * pet2.speak();
         * 
         * System.out.println(pet3);
         * pet3.speak();
         * pet3.likesToImitateCats();
         * pet3.speak();
         * pet3.tookFlyingLessons();
         * System.out.println(pet3);
         * 
         * //this is an interesting way of creating a worm!
         * Animal inch = new Animal("worm","Pete");
         * System.out.println(inch);
         * inch.setNumberLegs(0);
         * System.out.println(inch);
         * 
         * inch.speak();
         * inch.setVoice("everybody dance!");
         * inch.speak();
         * 
         * System.out.println(inch.conversation(pet3));
         */
    }
}
