public class pro
{
public static void main(String []args)
{
int fulltime=1;
int parttime=2;
int emprate=20;
int emphrs=0;
int empwage=0;
System.out.println("welcome to employee wage computation");
double emp=Math.floor(Math.random() * 10 ) % 2;
if (emp==fulltime)
      {
	emphrs=8;
	System.out.println("employee is present");
      }
else if (emp==parttime)
        {
         emphrs=4;
        System.out.println("employee is absent");
	}
else
     emphrs=0;
    empwage=emphrs*emprate;
   System.out.println("wage :" + empwage);
}
}
