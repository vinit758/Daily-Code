import java.util.*;
class sparse{
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);

    System.out.println("Enter The Row Of Matrix=");
    int row=sc.nextInt();

    System.out.println("Enter The Col of Matrix=");
    int col=sc.nextInt();

    int arr[][]=new int[row][col];
    int temp=(row*col)/2;

    int count=0;

    System.out.println("Enter The Elements=");
    for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
            arr[i][j]=sc.nextInt();
        }
    }
    

    for(int v=0;v<row;v++){
        for(int k=0;k<col;k++){
            if(arr[v][k]==0){
                count++;
            }
        }
    }
    

    if(count>temp){
        System.out.println("It Is a Sparse Matrix");
    }
    else{
        System.out.println("It Is Not Sparse Matrix");
    }
}

}