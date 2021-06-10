package Monday24;

import java.util.Iterator;
import java.util.LinkedList;



public class ArrayDemo {
public static void main(String[] args) {
LinkedList<String> al=new LinkedList<String>();
al.add("hi");
al.add(null);
al.add(null);
for(int i=0;i<al.size();i++) {
System.out.println(al.get(i));
 }

//foreach
 for(String s:al) {
 System.out.println(s);
 }


//Iterator
Iterator<String> i=al.iterator();//base address of the array list
while(i.hasNext()) {
System.out.println(i.next());
 }

}
}