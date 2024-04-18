public class Pet {

    private String name;
    private String race;

    public Pet(String name, String race){
        this.name = name;
        this.race = race;
    }

    @Override
    public String toString(){
        return "Pet name: " + this.name + ", Pet race: " + this.race;
    }
}
