package Monday17;

class A implements Runnable{
public void run() {
evennumbers();
try {
Thread.sleep(1000);
} catch (InterruptedException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
oddnumbers();


}
void evennumbers() {
for(int i=1;i<10;i=i+2) {
System.out.println(i);
}

}
void oddnumbers() {
for(int i=2;i<10;i=i+2) {
System.out.println(i);
}

}
}




public class ThreadDemo{
public static void main(String[] args) {
A a=new A();
Thread t=new Thread(a);// to make an obj into thread
Thread t1=new Thread(a);
t.start();
t1.start();
}
}