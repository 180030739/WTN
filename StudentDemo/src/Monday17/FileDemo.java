package Monday17;

import java.io.FileInputStream;
import java.io.IOException;



public class FileDemo {
public static void main(String[] args) throws IOException {

FileInputStream fo=new FileInputStream("a.txt");
int i=0;
while((i=fo.read())!=-1) {
System.out.print((char)i);
}


}



}