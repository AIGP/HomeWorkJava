package HomeWork5;

public class HomeWork5 {
    public static void main(String[] args) {
        Employee e[] = new Employee[5];
        e[0]=new Employee("Иванов И.И.","Разработчик","iii@mail.ru","+7(999)123-11-11","10000", 34);
        e[1]=new Employee("Петров П.П.","Тимлид разработки","ppepep@mail.ru","+7(999)123-91-11","20000", 44);
        e[2]=new Employee("Смирнов С.С.","Младший разработчик","sss@mail.ru","+7(985)123-32-11","30000", 21);
        e[3]=new Employee("Попов П.П.","Сотрудник поддержки","ppp@mail.ru","+7(999)123-11-89","40000", 35);
        e[4]=new Employee("Матвеев М.М.","Директор","mmm@mail.ru","+7(985)123-34-11","50000", 48);
        for(Employee i:e){
            if(i.getAge()>=40) {
                System.out.println("___________________________");
                i.printAboutEmployee();
                System.out.println("___________________________");
            }
        }
    }
}
