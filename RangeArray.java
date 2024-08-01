// import java.util.*;

// class RangeArray{
//     int start;
//     int end;
//     RangeArray(int start,int end){
//         this.start=start;
//         this.end=end;

//     }
//     boolean found=false;
//     public void checknumber(int arr[]){
//         for(int i=start;i<=end;i++){
//             boolean found=false;
//             for(int j=0;j<arr.length;j++){
//                 if(arr[j]==i){
//                     found=true;
//                     break ;
//                 }
//             }
        
//         if(!found){
//             System.out.println("Number Not Found="+i);
//         }
//         else{
//             System.out.println("Number Found="+i);
//         }
//     }


//  }
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         int i=0;

//         System.out.println("Enter The Size=");
//         int n=sc.nextInt();

//         int arr[]=new int[n];
//         System.out.println("Enter The Elements=");
//         for( i=0;i<n;i++){
//             arr[i]=sc.nextInt();
//         }
//         System.out.println("Enter The Start =");
//         int start=sc.nextInt();

//         System.out.println("Enter The End=");
//         int end =sc.nextInt();
//         RangeArray obj=new RangeArray(start, end);
//        obj.checknumber(arr);



//     }
// }

import java.util.Scanner;

class RangeArray {
    int start;
    int end;

    RangeArray(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public void checkNumber(int arr[]) {
        for (int i = start; i <= end; i++) {
            boolean found = false;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == i) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("Number " + i + " Not Found");
            } else {
                System.out.println("Number " + i + " Found");
            }
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Size of the array:");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter The Elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter The Start of the range:");
        int start = sc.nextInt();

        System.out.println("Enter The End of the range:");
        int end = sc.nextInt();

        RangeArray obj = new RangeArray(start, end);
        obj.checkNumber(arr);

        sc.close();
    }
}
