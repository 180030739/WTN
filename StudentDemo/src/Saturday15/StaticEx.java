package Saturday15;

class A1{
static int a=50;
static class B{
void m() {
System.out.println(a);
}

}



}
public class StaticEx {
public static void main(String[] args) {

A1.B a=new A1.B();
a.m();
}

}