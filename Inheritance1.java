class Animal
{  
  void eat()
  {
    System.out.println("eating...");
  }  
}  
class Pig extends Animal
{  
  void wee()
  {
    System.out.println("weeing...");
  }  
}  
class Inheritance
{  
  public static void main(String args[])
  {  
    Pig p=new Pig();  
    p.bark();  
    p.eat();  
  }
}  
