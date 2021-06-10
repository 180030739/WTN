package Monday17;

class Aa implements Runnable{
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




public class ThreadDemo1{
public static void main(String[] args) {
Aa a=new Aa();
Thread t=new Thread(a);// to make an obj into thread

t.start();

}
}