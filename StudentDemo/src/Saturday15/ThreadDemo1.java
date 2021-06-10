package Saturday15;

class Aa extends Thread{
public void run() {
numbers();


}
void numbers() {
for(int i=0;i<10;i++) {
System.out.println(i);
}

}
}




public class ThreadDemo1{
public static void main(String[] args) {
Aa a=new Aa();
a.start();

}
}
