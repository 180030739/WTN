package Practice;

class Emp implements Cloneable{
int empno;
String empname;
Emp(int empno,String empname){
this.empname=empname;
this.empno=empno;
}
//Cloneable is having a predefined method called clone()
public Object clone() throws CloneNotSupportedException{
return super.clone();
}


}
public class Copying2 {
public static void main(String[] args) throws CloneNotSupportedException {
Emp e1=new Emp(101,"kk");
Emp e2= (Emp) e1.clone();//object

//1. it creates sepreate address 2. it copies the content

System.out.println(e1+" "+e2);
System.out.println(e2.empname);
}



}