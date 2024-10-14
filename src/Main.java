public class Main {
    public static void main(String[] args) {
        Aquatic aquatic = new Aquatic("Crustacean", "Lobster", 2, false, "Atlantic Ocean");
        Terrestrial terrestrial = new Terrestrial("Elephant", "Dumbo", 10, false, 4);
        Dauphin dolphin = new Dauphin("Orcinus orca", "Willy", 7, true, "Pacific Ocean", 22.3f);
        Pengiun penguin = new Pengiun("Aptenodytes forsteri", "Pingu", 6, false, "Antarctica", 30.7f);


        System.out.println(aquatic);
        System.out.println(terrestrial);
        System.out.println(dolphin);
        aquatic.swim();
        dolphin.swim();
        penguin.swim();

    }
}