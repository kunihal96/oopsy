public class pro
{
public static final int fulltime=1;
public static final int parttime=2;
public static final int emprate=20;
public static final int num_of_days=20;
public static final int max_hrs=100;
public static void main(String []args)
{
int emphrs=0;
int total_emphrs=0;
int total_workdays=0;
System.out.println("welcome to employee wage computation");
while (total_emphrs <= max_hrs && total_workdays < num_of_days) {
total_workdays++; 
int emp=(int)Math.floor(Math.random() * 10 ) % 3;
switch (emp) {
  case fulltime:
	emphrs=8;
	break;
  case parttime:
        emphrs=4;
	break;
  default: 
         emphrs=0;
     }
    total_emphrs+=emphrs;
   System.out.println("day is :" + total_workdays + "emp hours is :" + emphrs);
}
  int totalempwage=total_emphrs * emprate;
  System.out.println("totalwage :" + totalempwage);
}
}
