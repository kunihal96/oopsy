public class pro
{
public static final int fulltime=1;
public static final int parttime=2;

private final String comp;
private final int emprate;
private final int num_of_days;
private final int max_hrs;
private int totalempwage;


public pro(String comp,int emprate,int num_of_days,int max_hrs)
{
this.comp=comp;
this.emprate=emprate;
this.num_of_days=num_of_days;
this.max_hrs=max_hrs;

}

public void comempwage()
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

public String toString(){ 
return "total wage for comp. is :" +comp + " " + totalempwage;
}

public static void main(String []args) {
pro dmart=new pro("dmart",20,20,100); 
pro reliance=new pro("reliance",10,20,150);
dmart.comempwage();
System.out.println(dmart);
reliance.comempwage();
System.out.println(reliance);

}
}
