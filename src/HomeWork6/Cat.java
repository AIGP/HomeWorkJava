package HomeWork6;

import java.util.Random;

public class Cat extends Animal {
        int restriction;
        Cat(){
            Random random = new Random();
            if (random.nextInt(2)==0)
                this.restriction= -random.nextInt(101);
            else this.restriction=random.nextInt(101);
        }
        boolean run(double length){
            System.out.print("Кот. Бег на дистанцию "+length+" м");
            return length <= (double) (200 + this.restriction);
        }
        boolean jump(double length){
            System.out.print("Кот. Прыжок на высоту "+length+" м");
            return length <= (2 + ((double) this.restriction / 1000));
        }
        boolean swim(double length){
            System.out.print("Котик не будет плыть "+length+" м");
            return false;
        }
        int getRestriction(){
            return this.restriction;
        }
}
