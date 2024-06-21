import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter The Size=");
        int n = sc.nextInt();
        
        int arr[] = new int[n];
        int i;
        int largest;
        int smallest;
        
        System.out.println("Enter The elements=");
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        largest = arr[0];
        smallest = arr[0];
        
        for (int k = 0; k < n; k++) {
            if (arr[k] > largest) {
                largest = arr[k];
            }
            if (arr[k] < smallest) {
                smallest = arr[k];
            }
        }
        
        System.out.println("largest = " + largest);
        System.out.println("smallest = " + smallest);
    }
}
