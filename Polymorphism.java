class CircArea 
{
 double area(double x)
 {
  return 3.14 * x;
 }
}
class SqArea 
{
 int area(int x)
 {
  return x * x;
 }
}
class RectArea 
{
 int area(int x, int y)
 {
  return x * y;
 }
}
class TriArea 
{
 int area(int y, int x)
 {
  return (y * x)/2;
 }
}
class Polymorphism 
{
 public static void main(String args[])
 {
  CircArea ca = new CircArea();
  SqArea sa = new SqArea();
  RectArea ra = new RectArea();
  TriArea ta = new TriArea();
  System.out.println("Circle area = "+ ca.area(1));
  System.out.println("Square area = "+ sa.area(2));
  System.out.println("Rectangle area = "+ ra.area(3,4));
  System.out.println("Triangle area = "+ ta.area(6,3));
 }
}
