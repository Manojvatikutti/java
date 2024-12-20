class Emp
{
int id ;
int salary ;
String grade;
public static void main(String [] args)
{
Emp e1 = new Emp();
e1.id = 67;
e1.salary = 30000;
e1.grade = "A";
System.out.println(e1.id);
System.out.println(e1.salary);
System.out.println(e1.grade);
System.out.println("**********************");
Emp e2 = new Emp();
e2.id = 77;
e2.salary = 40000;
e2.grade = "A";
System.out.println(e2.id);
System.out.println(e2.salary);
System.out.println(e2.grade);
}
}