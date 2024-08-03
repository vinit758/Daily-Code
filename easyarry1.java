import java.util.*;

class easyarray1 {
    int arr[];
    int n;

    easyarray1(int arr[], int n) {
        this.arr = arr;
        this.n = n;
    }

    public void sort(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.println("The Final Array Element at index " + i + " = " + arr[i]);
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Size Of Array=");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter The elements=");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        easyarray1 obj = new easyarray1(arr, n); 
        obj.sort(arr, n);
    }
}
