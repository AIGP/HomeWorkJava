package HomeWork7;

import java.util.Random;

public class Cat {
    boolean satiety;
    int appetite;

    Cat() {
        Random random = new Random();
        this.satiety = false;
        this.appetite = random.nextInt(30)+5;
    }

    void eat(Plate p){
        if(satiety){
            System.out.println("Котик уже наелся. (* ^ ω ^)");
        }
        else {
            if (this.appetite <= p.getFood()) {
                satiety = true;
                p.eatFood(appetite);
            }
            else{
                System.out.println("Котику мало. o(>ω<)o");
            }
        }
    }

    void printCat(){
        if(this.satiety){
            System.out.println("Котик наелся. (* ^ ω ^)");
        }
        else{
            System.out.println("Котик голоден. o(>ω<)o");
        }
    }
    int getAppetite(){
        return appetite;
    }
}
