import java.util.Scanner;
class sc
{
  public static void main(String[] args)
{
  int option; 
do
{     Scanner sc = new Scanner(System.in);
    System.out.println("1.area of triangle");
    System.out.println("2.area of rect");
    System.out.println("3.area of sqr");
    System.out.println("4.exit");
   

 System.out.println("enter your option");
  option=sc.nextInt();
switch(option)
{
 case 1:
System.out.println("enter base and height");
int bre=sc.nextInt();
int height=sc.nextInt();
double ar=(bre*height)/2;
  System.out.println("area"+ar);

break;

 case 2:
System.out.println("enter lenght and width");
int len=sc.nextInt();
int wid=sc.nextInt();
 ar=(len*wid);
  System.out.println("area"+ar);
break;

 case 3:
System.out.println("enter lenght of sqr");
 len=sc.nextInt();
ar=(len*len);
  System.out.println("area"+ar);
break;
}
}while(option<4);

}}

