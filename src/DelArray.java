public class DelArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int delNum = 3;
        int index_del = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == delNum) {
                index_del = i;
                break;
            }
        }
        if (index_del != -1) {
            for (int i = index_del; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }
        }
        System.out.print("Mảng sau khi xoá phần tử " + delNum + ": ");
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println(arr[arr.length - 1]);

    }
}

