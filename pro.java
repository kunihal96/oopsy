public class pro
{
public static final int fulltime=1;
public static final int parttime=2;
public static final int emprate=20;
public static final int num_of_days=20;
public static void main(String []args)
{
int emphrs=0;
int empwage=0;
int totalwage=0;
System.out.println("welcome to employee wage computation");
for (int day=0; day < num_of_days; day++ ) {
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
    empwage=emphrs*emprate;
    totalwage+=empwage;
   System.out.println("wage :" + empwage);
}
  System.out.println("totalwage :" + totalwage);
}
}
