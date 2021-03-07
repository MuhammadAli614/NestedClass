package AllOfThem;
import java.util.ArrayList;

public class House {

    public static void main(String[] args) {
        ArrayList<String> House = new ArrayList<String>();
        House.add("Kitchen");
        House.add("Bedroom");
        House.add("Bathroom");
        House.add("LivingRoom");

        House.remove("Stones");
        House.remove("Bats");
        House.remove("etc");

        House.set(House.size(), House.get(1));

        System.out.println("Kitchen"+" "+ "LivingRoom"+ " "+ "Bedroom"+" "+ "Bathroom" );
    }

}
