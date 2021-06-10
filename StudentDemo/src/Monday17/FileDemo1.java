package Monday17;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;



public class FileDemo1 {
public static void main(String[] args) throws IOException {
FileInputStream fi=new FileInputStream("a.txt");//read
FileOutputStream fo=new FileOutputStream("b.txt");//write
int i=0;
while((i=fi.read())!=-1) {
fo.write(i);
}
fi.close();
fo.close();
}
}