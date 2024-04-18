public class Main {
    public static void main(String[] args) {

        Pet doggo = new Pet("Fido", "Pittbull");
        Person josh = new Person("Josh", doggo);
        Person marry = new Person("Marry", "Bobo", "Mastiff");

        System.out.println(josh);
        System.out.println(marry);
    }
}