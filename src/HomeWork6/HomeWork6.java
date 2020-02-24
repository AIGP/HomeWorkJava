package HomeWork6;

public class HomeWork6 {
    public static void main(String[] args) {
        Animal a=new Animal();
        Cat c=new Cat();
        Dog d=new Dog();

        System.out.println(" -> "+a.jump(5));
        System.out.println(" -> "+a.run(5));
        System.out.println(" -> "+a.swim(5));

        System.out.println("\nОграничение на прыжок "+((2+(double) c.getRestriction()/1000))+", на бег "+(200+c.getRestriction()));
        System.out.println(" -> "+c.jump(1.5));
        System.out.println(" -> "+c.run(5));
        System.out.println(" -> "+c.swim(5));

        System.out.println("\nОграничение на прыжок "+((0.5+(double)d.getRestriction()/1000))+", на бег "+(500+d.getRestriction())+", на заплыв "+(10+(double)d.getRestriction()/10));
        System.out.println(" -> "+d.jump(0.5));
        System.out.println(" -> "+d.run(5));
        System.out.println(" -> "+d.swim(5));
    }
}
