import java.util.*;
class array{
    public static void main(String[] args){
        System.out.println("Enter array size");
        Scanner sc=new Scanner(System.in);
        int size = sc.nextInt();
        int marks[]=new int[size];

        for(int i=0;i<size;i++){
            System.out.printf("enter %d element of array :  ",i+1); 
            marks[i]=sc.nextInt();
        }
        System.out.print("Array : ");
        for (int i=0;i<size;i++){
            System.out.printf("%d  ",marks[i]);
        }
        


    }
}