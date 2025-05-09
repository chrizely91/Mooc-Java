import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};

        System.out.println("Index of the smallest number: " + MainProgram.indexOfSmallest(array));
    }

    public static int smallest(int[] array){
        // write your code here
        int num = array[0];

        for (int arr : array) {
            if (arr < num) {
                num = arr;
            }
        }
        return num;
    }


    public static int indexOfSmallest(int[] array){
        // write your code here
        int num = smallest(array);
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) {
                index = i;
                break;
            }
        }
        return index;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int index = startIndex;
        int num = table[index];

        for (int i = startIndex; i < table.length; i++) {
            if (table[i] < num) {
                num = table[i];
                index = i;
            }
        }
        return index;
    }


    public static void swap(int[] array, int index1, int index2) {
        // write your code here
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;

        System.out.println(Arrays.toString(array));
    }


    public static void sort(int[] array) {

        System.out.println(array.toString());

        for (int i = 0; i < array.length; i++) {
            int index = indexOfSmallestFrom(array, i);
            swap(array, index, i);
        }
    }

}
