import java.util.Scanner;
class Exception
{
    public static void main(String args[])
    {
        try{
            Scanner sc=new Scanner(System.in);
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=a/b;
            System.out.println(c);
        }
        catch(ArithmeticException Exception){
            System.out.println("you are not allowed todivide try zero");
        }
        finally
        {
            System.out.println("this is finall block");
        }
    }
}