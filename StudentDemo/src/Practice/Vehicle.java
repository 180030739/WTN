package Practice;

class Car{
void display() {
System.out.println(" this is car");
}
void sys() {
System.out.println("this is sys");
}
}
class Bike extends Car{
void display() {
System.out.println("this is bike");
}
void m() {
System.out.println("this is m");
}
}
// when ever we are performing DMD the methods which are
//under the overriding still stick on with the process
public class Vehicle{
public static void main(String[] args) {
Car c=new Bike();
c.display();
c.sys();
}
}