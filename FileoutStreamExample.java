import java.io.fileoutputStram;
public class FileStreamExample
{
public static void main(String args[])
{
try
{
fileoutputStream fout=new fileoutStream("D:\\testout.txt");
string s="welcome to java";
byte b[]=s.get_Bytes();
fout.write(b);
fout close;
System.out.println("success...");
}
catch(e)
{
System.out.println(e);
}
}
}