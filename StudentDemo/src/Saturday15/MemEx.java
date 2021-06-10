package Saturday15;

class Outer{

int a=50;
class Inner {
void m() {
System.out.println(a);
}
}
}
public class MemEx {
public static void main(String[] args) {
Outer o=new Outer();
Outer.Inner i=o.new Inner();
i.m();

}



}