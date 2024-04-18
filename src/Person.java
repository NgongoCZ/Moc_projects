public class Person {

    private String name;
    private Pet pet;

    public Person(String name, Pet pet){
        this.name = name;
        this.pet = pet;
    }

    public Person(String name, String pet_name, String pet_race){
        this.name= name;
        this.pet = new Pet(pet_name, pet_race);
    }

    @Override
    public String toString(){
        return "Name: " + this.name + ", Pet: " + this.pet;
    }
}
