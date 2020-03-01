package HomeWork5;

public class Employee {
    String fio;
    String position;
    String email;
    String phone;
    String salary;
    int age;
    Employee(String fio, String position, String email, String phone, String salary, int age){
        this.fio=fio;
        this.position=position;
        this.email=email;
        this.phone=phone;
        this.salary=salary;
        this.age=age;
    }
    void printAboutEmployee(){
        System.out.println("ФИО:        "+fio);
        System.out.println("Должность: "+position);
        System.out.println("email:     "+email);
        System.out.println("Телефон:   "+phone);
        System.out.println("Зарплата:  "+salary);
        System.out.println("Возраст:   "+age);
    }
    int getAge(){
        return age;
    }
}
