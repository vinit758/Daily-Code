import java.util.*;
class EasyArray3{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter The Size Of Array=");
        int n=sc.nextInt();

        int arr1[]=new int[n];

        System.out.println("Enter The Elements=");
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.println("Enter The Index Which You Have To Remove=");
        int x=sc.nextInt();

        for(int j=x;j<arr1.length-1;j++){
            arr1[j]=arr1[j+1];
        }

        int arr2[]=new int[arr1.length-1];
        for(int k=0;k<arr2.length;k++){
            arr2[k]=arr1[k];
            System.out.println(arr2[k]);
        }
    }
}