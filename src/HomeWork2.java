import java.util.Random;
import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {
        int arr[]=new int[]{1, 1, 1, 2, 1};
        createArrayChange();
        createArraySize8();
        createArrayLess6();
        createMatrix();
        System.out.println("\n\nЗадание №6:");
        System.out.println(isSum(arr));
    }
    /*1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например:
     [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;*/
    public static void createArrayChange(){
        System.out.println("\n\nЗадание №1:");
        int arr[] = new int[] {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for(int i=0;i<arr.length;i++)
            switch (arr[i]){
            case 0:
                arr[i]=1;
                break;
            case 1:
                arr[i]=0;
                break;
        }

        for (int i : arr){
            System.out.print(i+" ");
        }

    }
    /*2. Задать пустой целочисленный массив размером 8.
    С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;*/
    public static void createArraySize8(){
        int arr[]=new int[8];
        System.out.println("\n\nЗадание №2:");
        for(int i=0, j=0;i<arr.length;i++,j+=3)
            arr[i]=j;
        for (int i : arr){
            System.out.print(i+" ");
        }
    }
    /*3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
    пройти по нему циклом, и числа меньшие 6 умножить на 2; */
    public static void createArrayLess6(){
        int arr[]=new int[] { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("\n\nЗадание №3:");
        for(int i=0;i<arr.length;i++)
            if(arr[i]<6)
                arr[i]=arr[i]*2;
        for (int i : arr){
            System.out.print(i+" ");
        }
    }
    /*4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
     и с помощью цикла(-ов) заполнить его диагональные элементы единицами;*/
    public static void createMatrix(){
        Scanner in = new Scanner(System.in);
        System.out.println("\n\nЗадание №4:");
        System.out.print("Введите размер матрицы: ");
        int size = in.nextInt();
        if(size>0) {
            int arr[][] = new int[size][size];
            for (int i=0; i<arr.length;i++) {
                for (int j = 0; j < arr[i].length; j++)
                        arr[i][j] = 0;
            }
            for (int i=0; i<arr.length;i++)
                for (int j = 0; j < arr[i].length; j++) {
                    if (i == j) {
                        arr[i][j] = 1;
                        arr[i][arr[j].length-1-j]=1;
                    }
                }

            for (int i=0; i<arr.length;i++) {
                for (int j = 0; j < arr[i].length; j++)
                    System.out.print(arr[i][j]);
                System.out.println();
            }
        }
    }
    /*6. ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны. Примеры:
     checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true, граница показана символами ||, эти символы в массив не входят.*/
    public static boolean isSum(int arr[]){
        int left;
        int right;
        for(int border=0; border<arr.length; border++)
        {
            left=0;
            right=0;
            for(int i=0; i<border; i++)
                left+=arr[i];
            for(int i=border;i<arr.length;i++)
                right+=arr[i];
            if(left==right)
                return true;
        }
        return false;
    }
}