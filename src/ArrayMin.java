import java.util.Arrays;
import java.util.Scanner;

public class ArrayMin {
    public static void main(String[] args) {
        int[] arr = {1, 2, 333, 555, 7};
        int min = arr[0];
        for (int i = arr[1]; i < arr.length ; i++) {
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("Phan tu nho nhat la: " + min);

    }
}
