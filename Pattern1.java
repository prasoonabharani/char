import java.util.*;
public class Pattern1
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int i,j;
int n=sc.nextInt();
for (i=0;i<=n;i++)
{
for(j=1;j<=i;j++)
{
System.out.print("*");
}
System.out.println();
}
for(i=n-1;i>=0;i--)
{
for(j=0;j<=i-1;j++)
{
System.out.print("*");
}
System.out.println();
}}}









