package HomeWork7;
import java.util.stream.IntStream;

public class HomeWork7 {
    public static void main(String[] args) {
        Cat[] cat = new Cat[5];
        Plate plate = new Plate();
        plate.addFood(80);
        for(int i=0; i<5; i++){
            cat[i]=new Cat();
            cat[i].eat(plate);
            cat[i].printCat();
            System.out.println("Теперь в тарелке "+plate.getFood());
        }
    }
}
