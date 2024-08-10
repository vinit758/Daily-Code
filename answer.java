import java.util.*;
class easyarray4{
    int arr[];
    int n;

    easyarray4(int arr[],int n){
        this.arr=arr;
        this.n=n;

    }
    public void oddsum(int arr[],int n){
        int totalsum=0;
        for(int i=0;i<n;i++){
            totalsum+=arr[i];
        }
        if(totalsum%2!=0){
            System.out.println("The Maxium Total Sum Of oddNum:"+totalsum);
        }
        else{
            System.out.println("-1");
        }
    }
}
public class answer{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter The Size=");
        int n=sc.nextInt();

        int arr[]=new int[n];

        System.out.println("Enter The Elements=");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        easyarray4 obj=new easyarray4(arr,n);
        obj.oddsum(arr,n);

    }
} 