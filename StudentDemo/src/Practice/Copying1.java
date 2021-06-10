package Practice;


class A1{
int i,j;
}
public class Copying1 {
public static void main(String[] args) {
//deep copy
A1 o=new A1();
o.i=5;
o.j=6;
A1 h=new A1();
h.i=o.i;
h.j=o.j;
h.i=h.i+1;
System.out.println(o.i+" "+h.i);

}



}