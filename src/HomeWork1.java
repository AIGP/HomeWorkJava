import java.util.Calendar;
import java.util.GregorianCalendar;
///////////////////////////////////
public class HomeWork1 {
    public static void main(String[] args) {
        byte val1 = -120;
        short val2 = 1234;
        int val3 = -100;
        long val4 = 2000L;
        float val5 = 12.234f;
        double val6 = 123.456;
        char val7 = '!';
        boolean val8 = true;

        System.out.println(findAnswer(1,2,3,4));
        System.out.println(findLimit(10,10));
        System.out.println(findLimit(10,0));
        positiveNegative(10);
        positiveNegative(-10);
        System.out.println(isNegative(-10));
        System.out.println(isNegative(10));
        printName("Анастасия");
        whatIsYear(2020);

    }

    /*3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий
    результат,где a, b, c, d – входные параметры этого метода;*/
    public static double findAnswer(double a, double b, double c, double d){
        return a*(b+(c/d));
    }

    /*4. Написать метод, принимающий на вход два числа, и проверяющий
     что их сумма лежит в пределах от 10 до 20(включительно), если да – вернуть true, в противном случае – false;*/
    public static boolean findLimit(double a, double b){
        return (a+b) > 10 && (a+b)<=20;
    }

    /*5. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль
     положительное ли число передали, или отрицательное; Замечание: ноль считаем положительным числом.*/
    public static void positiveNegative(int a){
        System.out.print("Число "+a+" является ");
        if(a>=0)
            System.out.println("позитивным");
        else
            System.out.println("негативным");
    }

    /*6. Написать метод, которому в качестве параметра передается целое число,
     метод должен вернуть true, если число отрицательное;*/
    public static boolean isNegative(int a){
        return a<0;
    }

    /*7. Написать метод, которому в качестве параметра передается строка, обозначающая имя,
     метод должен вывести в консоль сообщение «Привет, указанное_имя!»;*/
    public static void printName(String name){
        System.out.println("Привет, "+name+"!");
    }

    /*8. * Написать метод, который определяет является ли год високосным, и выводит сообщение в консоль.
     Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.*/
    public static void whatIsYear(int year){
        if(((GregorianCalendar) Calendar.getInstance()).isLeapYear(year))
            System.out.println("Год високосный");
        else
            System.out.println("Год не високосный");
    }
}