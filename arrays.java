import java.util.*;
class product{
    int arr1[];
    int arr2[];
    int n1;
    int n2;

    product(int arr1[],int arr2[],int n1,int n2){
        this.arr1=arr1;
        this.arr2=arr2;
        this.n1=n1;
        this.n2=n2;
    }

    public void checkproduct(int arr1[],int arr2[],int n1,int n2){
        int max=arr1[0];
        int min=arr2[0];
        for(int i=0;i<n1;i++){
            if(arr1[i]>max){
                max=arr1[i];
            }
        }
        for(int j=0;j<n2;j++){
            if(arr2[j]<min){
                min=arr2[j];
            }
        }
        int product=max*min;
        System.out.println("The Product="+product);


    }

}
public class arrays{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter The Size Of Array1 and Array2:");
        int n1=sc.nextInt();
        int n2=sc.nextInt();

        int arr1[]=new int [n1];
        int arr2[]=new int [n2];

        System.out.println("Enter The Array1 Elements=");
        for(int i=0;i<n1;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.println("Enter The Array2 Elements=");
        for(int j=0;j<n2;j++){
            arr2[j]=sc.nextInt();
        }
        product pd=new product(arr1,arr2,n1,n2);
        pd.checkproduct(arr1,arr2,n1,n2);

    }

}