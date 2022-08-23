public class Character {
    // Attributes
    int strength;
    int agility;
    int intelligence;
    String name;

    // Method
    public void sayMyName() {
        System.out.println("Hello I am " + name);
    }
    public void sayMyStrength() {
        System.out.println("My strength is " + strength);
    }

    public void sayMyAgility() {
        System.out.println("My agility is " + agility);
    }

    public void sayMyIntelligence() {
        System.out.println("My intelligence is " + intelligence);
    }

    // Constructor
    public Character(int str, int agi, int intel, String characterName) {
        strength = str;
        agility = agi;
        intelligence = intel;
        name = characterName;
    }
}
