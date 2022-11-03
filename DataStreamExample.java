import java.io.fileinputStream;
public class DataStreamExample
{
public static void main(String aregs[])
{
try
{
fileinputStream fin=new fileinputStream("D:\\testout.txt");
int i=fin.read();
System.out.println((char)i);
fin.close();
}
catch(exception)
{
System.out.println(e);
}
}
}