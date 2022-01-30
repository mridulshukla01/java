import java.util.*;
public class gcd {
//     public static void main(String[] args){
       
// int gcd=1;
//         for(int i=0;i<a && i<b;i++)
//         {
//             if (a%i==0 & b%i==0)
//             gcd=i;
//         }
// System.out.println(gcd);
//     }
    

  
public static void main(String[] args)   
{  
    Scanner sc=new Scanner(System.in);
    int x=sc.nextInt();
    int y=sc.nextInt();
    System.out.println(x +  " " + y);
    while(x!=y){
        if (x>y){
            x=x-y;
        }
        else y=y-x;
        
    }
int gcd=x;
System.out.println("GCD is"+ gcd);
    
    }
//x and y are the numbers to find the GCF  
// int gcd = 1;  
//running loop form 1 to the smallest of both numbers  
//for(int i = 1; i <= x && i <= y; i++)  
 
//returns true if both conditions are satisfied   
//if(x%i==0 && y%i==0)  
//storing the variable i in the variable gcd  
// gcd = i;  
// }  
//prints the gcd  
}  



