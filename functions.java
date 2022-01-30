import java.util.*;
class functions {
    // public static int gcd(int a, int b){
    //     int c,gcd=1;
       

    //     } 
    //     return gcd;


    // }


public static void main(String[] args){
System.out.println("okay");
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int gcd=1;
if(a==0 || b==0)
System.out.println("eroooorrr");

for (int i=0;i<a && i<b;i++){
   
    if (a%i==0 & b%i==0)
    gcd=i;}
System.out.println("gcd is" + gcd);
}
    
}