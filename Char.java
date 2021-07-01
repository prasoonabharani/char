import java.util.*;
public class Char
{
public static void main(String args[])
{
Scanner sc =new Scanner(System.in);
int i,j;
int n=sc.nextInt();
char ch='A';
for(i=1;i<=n;i++)
{
for(j=1;j<=i;j++)
{
System.out.print(ch+" ");
ch++;
}
System.out.println();
}}}