import java.util.*;
class okay{
    public static void main(String[] args){
       System.out.println("hello okay");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        //int m=sc.nextInt();

    for (int i=1;i<=n;i++){
                  
            //for left spaces
           int spaces= n-i;
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
           for(int j=i;j>0;j--)
           System.out.print(j);

           for(int j=1;j<=i;j++)
           if (i>1 && j>1){
           System.out.print(j);
           }
            //left half
            // for (int j=1;j<=n;j++){
            //    if(i==1 || i==n || j==n-i )
            //     System.out.print("*");
            // }
            //middle spaces
            // int sapces2 = n-2;
            // for (int j=1; j<= sapces2 ;j++){    
            //     if(i>1 && i < n){
            //         System.out.print(" ");
            //     }
            // }
            // for (int j=1;j<=(2*n);j++){
            //     if(i>1 && i < n && j== ((n-1)+ (n-2))){
            //         System.out.print("*");
            //     }
            // }
           

System.out.println();
         }
    
         
    
    
    
    }
}