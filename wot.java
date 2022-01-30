import java.util.Scanner;

public class wot {
    public static void main(String[] args){
      
       //masttttttt
        // int x=1,y=2;
        // int  a=(x>y)?x:y;
        // int b=(x<y)?x:y;
        // System.out.println(a + " " +b);
Scanner sc=new Scanner(System.in);
int count=sc.nextInt();
int n1=0,n2=1;
System.out.print(n1 + " " + n2);
for (int i=2;i<=count;++i)
{
int n3=n2+n1;
System.out.print(" " + n3);
n1=n2;
n2=n3;

}

    }
}
