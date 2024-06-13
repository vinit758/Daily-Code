import java.util.*;
class matrix{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter The Row Of Matrix 1=");
        int row1=sc.nextInt();

        System.out.println("Enter The Col Of Matrix 1=");
        int col1=sc.nextInt();


        System.out.println("Enter The Row Of Matrix 2=");
        int row2=sc.nextInt();

        System.out.println("Enter The Col Of Matrix 2=");
        int col2=sc.nextInt();

    
        int arr1[][]=new int[row1][col1];
        int arr2[][]=new int[row2][col2];
        int result[][]=new int [row1][col1];


        System.out.println("Enter The Elements of Matrix 1=");
        for(int i=0;i<row1;i++){
            for(int j=0;j<col1;j++){
                arr1[i][j]=sc.nextInt();
            }
        }

        System.out.println("Enter The Elements of Matrix 2=");
        for(int v=0;v<row2;v++){
            for(int k=0;k<col2;k++){
                arr2[v][k]=sc.nextInt();
            }
        }
        
        for(int i=0;i<row1;i++){
            for(int j=0;j<col1;j++){
                result[i][j]=arr1[i][j]+arr2[i][j];
            }
          
        }

        System.out.println("Addition of Matrix=");
        for(int g=0;g<row1;g++){
            for( int d=0;d<col1;d++){
                System.out.print(result[g][d]+"\t");
            }
            System.out.println();
        }
      









        
        
        


        

    }
}