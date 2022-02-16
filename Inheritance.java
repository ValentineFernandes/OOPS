class Employee
{
 float salary=50000;
}

class Boss extends Employee
{
  int bonus=15000;
  public static void main(String args[])
  {
   Boss b=new Boss();
   System.out.println("Boss salary is:"+b.salary);
   System.out.println("Bonus of Boss is:"+b.bonus);
}
}
