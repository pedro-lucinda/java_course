import java.util.Arrays;

public class ArrayClass {

    public static void arr(){
        int[] a = new int[4];

        int[] b = new int[10];

        int[] initial = {12, 34, 56, 78, 90};

        int[] myArr = new int[10];

        myArr[0] = 9999;

        System.out.println(Arrays.toString(myArr));

    }
    public static void twoDimensionalArray(){
        int[][] arr1 = {{1, 2, 3}, {4, 5, 6}};
        outputArray(arr1);
    }

    public static void outputArray(int[][] array){
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }


    public static void loopArr(){
        int[] arr = {1,2,3,3};
        int total = 0;

        for (int i = 0; i < arr.length; i++){
            total += arr[i];
        }

        System.out.println("Total: " + total);
    }


    public static  void loopArr2(){
        int[] arr = {1,2,3,3};
        int total = 0;

        for(int number: arr){
            total += number;
        }

        System.out.println(total);
    }
}
