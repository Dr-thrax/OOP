
package threaddemo1;


class counting{
    int count = 0;
    public synchronized void increment(){
        count++;
    }
}
 

public class ThreadSynchronization {
   
    public static void main(String[] args) throws InterruptedException
    {
        counting ob = new counting();
        Thread t1=new Thread(new Runnable(){
            @Override
            public void run(){
                for(int i=0; i<100; i++){
                    ob.increment();
                }
            }
        });
   
        Thread t2=new Thread(new Runnable(){
            @Override
            public void run(){
                for(int i=0; i<100; i++){
                    ob.increment();
                }
            }
        });
     
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Value of count is --> " + ob.count);
    }
}