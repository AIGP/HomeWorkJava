package HomeWork6;

import java.util.Random;

public class Dog extends Animal{
    int restriction;
    Dog(){
        Random random = new Random();
        if (random.nextInt(2)==0)
            this.restriction=-random.nextInt(101);
        else this.restriction=random.nextInt(101);
    }
    boolean run(double length){
        System.out.print("Пес. Бег на дистанцию "+length+" м");
        return length <= (500 + this.restriction);
    }
    boolean jump(double length){
        System.out.print("Пес. Прыжок на высоту "+length+" м");
        return length <= (0.5 + ((double) this.restriction / 1000));
    }
    boolean swim(double length){
        System.out.print("Пес. Заплыв на дистанцию "+length+" м");
        return length <= (10 + ((double) this.restriction / 10));
    }
    int getRestriction(){
        return this.restriction;
    }
}