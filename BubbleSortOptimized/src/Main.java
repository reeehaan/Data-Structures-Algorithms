import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int arraySize = scn.nextInt();
        int[] array = new int[arraySize];
        System.out.println("Enter the array elements: ");
        for(int i = 0; i < array.length; i++){
            array[i] = scn.nextInt();
        }
        bubbleSort(array);
        System.out.println("Sorted array----------------!");
        printArray(array);
    }

    public static void bubbleSort(int[] array) {
        for(int i = 0; i < array.length - 1; i++) {
            boolean flag = false;
            for(int j = 0; j < array.length - i - 1; j++) {
                if(array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    flag = true;
                }
            }
            if(flag == false) {
                break;
            }
        }
    }

    public static void printArray(int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i]);
        }
    }
}
