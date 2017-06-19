import java.util.*;
import java.util.Scanner;
class Natural
{
public static void main(String[] args)
{
int m,i=1;
Scannersc=new Scanner(System.in);
m=sc.nextInt();
int sum=0;
while(i<=m)
{
sum=sum+i;
i++;
}
System.out.println("Sum of "+m+" natural numbers is:"+sum);
}
}
