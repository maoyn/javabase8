package java8Thread;

/**
 * Author:Administrator
 * Date:  2016/8/17
 * Time: 16:36
 */
public class threadTest {
String A ="1231";
   String B= A ;
   Object a = new Object();
   public void m4t1() {
      synchronized(a) {
         int i = 1;
         while( i-- > 0) {
            System.out.println(Thread.currentThread().getName()  + " : " + i);
            try {
               Thread.sleep(500);
            } catch (InterruptedException ie) {
            }
         }
      }
   }
   public synchronized void m4t2() {

         int i = 5;
         while (i-- > 0) {
            System.out.println(Thread.currentThread().getName() + " : " + i);
            try {
               Thread.sleep(500);
            } catch (InterruptedException ie) {
            }
         }
   }
   public static void main(String[] args) {
      final threadTest myt2 = new threadTest();
    int i =0;
      try {
         i=i+1;
         Thread t1 = new Thread(  new Runnable() {  public void run() { myt2.m4t1(); }  }, "t1"  );
         Thread t2 = new Thread(  new Runnable() {  public void run() { myt2.m4t2();  }  }, "t2"  );
         t1.start();
         t2.start();
         //t1.join();
         t2.join();

      }
      catch (Exception e){

      }finally {
         System.out.println("执行完毕" );
      }

System.out.println(i);

   }
}
