package Saturday15;

class Ab{
void display() {
//in a method can i define a class??
class B{
void m() {
System.out.println("hi");
}
}
B b=new B();
b.m();
System.out.println("hello");

}
}
public class LocalEx {
public static void main(String[] args) {
Ab a =new Ab();
a.display();

}



}