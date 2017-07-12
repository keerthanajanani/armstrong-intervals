# armstrong-intervals
import java.io.*
import java.util.*;
public class armstrong intervals
{
public static void main(String args[])throws IOException
{
int a=999,b=99999,digits=0,result=0;
int d=i;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the input:");
n=Integer.parseInt(br.readLine());
for(i=a+1;i<b;i++)
{
while(d!=0)
{
d=d/10;
digit ++;
}
d=i;
while(d!=0)
{
int rem=d%10;
result +=Math.pow(rem,digits);
d=d/10;
}
if(result==i)
System.out.println(i+" ");
}
}
}
