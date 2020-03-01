package HomeWork6;

public class Animal {
    boolean run(double length){
        System.out.print("Животное. Бег на дистанцию "+length+" м");
        return true;
    }
    boolean jump(double length){
        System.out.print("Животное. Прыжок на высоту "+length+" м");
        return true;
    }
    boolean swim(double length){
        System.out.print("Животное. Заплыв на дистанцию "+length+" м");
        return true;
    }
}
