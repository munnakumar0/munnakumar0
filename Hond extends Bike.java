abstract class Bike
{
abstract void run();
}
class Honda extends Bike
{
void run()
{
System.out.println("Bike running safely");
}
public static void main(String args[])
{
Bike b=new Bike();
b.run();
}
