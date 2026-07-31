import java.util.Random;
class SharedNumber{
public static volatile int num = 0;
}
class NumberGenerator extends Thread{
Random rand = new Random();
public void run(){
while(true)
{
SharedNumber.num = rand.nextInt(100);
System.out.println("GEnerated Number:"+SharedNumber.num);

try{
Thread.sleep(1000);
}catch(InterruptedException e)
{
System.out.println(e);
}
}
}
}

class SquareCalculator implements Runnable{
public void run(){
while(true)
{
int n = SharedNumber.num;
System.out.println("sqaure"+(n*n));

try{
Thread.sleep(1000);
}catch(InterruptedException e)
{
System.out.println(e);
}
}
}
}
class CubeCalculator implements Runnable{
public void run(){
while(true)
{
int n = SharedNumber.num;
System.out.println("cube"+(n*n*n));

try{
Thread.sleep(1000);
}catch(InterruptedException e)
{
System.out.println(e);
}
}
}
}
public class MultiThreadDemo{
public static void main(String[]args)
{
NumberGenerator t1 = new NumberGenerator();
Thread t2 = new Thread(new SquareCalculator());
Thread t3 = new Thread(new CubeCalculator());
t1.start();
t2.start();
t3.start();
}
}









