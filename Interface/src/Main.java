public class Main {

    public static void main(String[] args) {

        ISaveable character;

        character = new Player("Man", 10, 15);
        System.out.println(character);

        character = new Monster("Demon", 30, 25);
        System.out.println(character);
    }
}