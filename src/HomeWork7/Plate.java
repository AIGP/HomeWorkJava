package HomeWork7;

public class Plate {
    int food;

    public Plate() {
        food = 0;
    }

    void addFood(int count) {
        this.food += count;
        System.out.println("Теперь в тарелке "+this.food+" еды");
    }
    int getFood(){
        return food;
    }
    void eatFood(int num){
        this.food-=num;
    }
}
