import java.util.*;
class check{
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);

    System.out.println("Enter The String=");
    String ch=sc.next();
        int i;
        char v=0;
        int count=0;
    
             for( i=0;i<ch.length();i++){
             v=ch.charAt(i);
    

    
           if(v=='a'|| v=='e' ||v=='i'|| v=='o' || v=='u'){
            count++;

        }
    }
    
    System.out.println("Count Of Vowles="+count);


    }
}