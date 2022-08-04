import java.util.Arrays;

public class test {
    static String outArray(int [] array) {
        return Arrays.toString(array)
                .replace(",", " ");
    }

    static int arrSum(int [] array) {
        int sum = 0;
        for (int i=0; i<array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    static int averageOfArr(int [] array) {
        int count = array.length;
        return arrSum(array)/count;
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Here is array: " + Arrays.toString(array1));
        System.out.println("Here is the array without comma: ");
        System.out.println(outArray(array1));
        System.out.println("Here is sum of the array: ");
        System.out.println(arrSum(array1));
        System.out.println("Here is average of the array: ");
        System.out.println(averageOfArr(array1));
    }
}