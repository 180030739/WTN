package Saturday15;

abstract class Am{
abstract void m();
}
public class AnnonyEx {
public static void main(String[] args) {
Am b=new Am() {



@Override
void m() {
// TODO Auto-generated method stub
System.out.println("hi this is inner class");

}
};
b.m();
}



}