import java.util.*;
class matrix3{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter The Row Of Matrix 1=");
        int row1=sc.nextInt();

        System.out.println("Enter The Col Of Matrix 1=");
        int col1=sc.nextInt();


        

    
        int arr1[][]=new int[row1][col1];
        int result[][]=new int [col1][row1];


        System.out.println("Enter The Elements of Matrix 1=");
        for(int i=0;i<row1;i++){
            for(int j=0;j<col1;j++){
                arr1[i][j]=sc.nextInt();
            }
        }

        
        
        for(int i=0;i<row1;i++){
            for(int j=0;j<col1;j++){
                result[j][i]=arr1[i][j];
            }
          
        }

        System.out.println("Transpose Matrix=");
        for(int g=0;g<col1;g++){
            for( int d=0;d<row1;d++){
                System.out.print(result[g][d]+"\t");
            }
            System.out.println();
        }
      









        
        
        


        

    }
}