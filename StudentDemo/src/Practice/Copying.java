package Practice;

class A{
int i,j;
}
public class Copying {
public static void main(String[] args) {
//shallow copy
A o=new A();
o.i=5;
o.j=6;
A h=new A();
h=o;
h.i=h.i+1;
System.out.println(h.i+" "+o.i);

}



}