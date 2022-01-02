/*
Write a program to illustrate thread sleep. Create and run a thread. Then make it sleep.
*/

public class L11A5 extends Thread{
    public void run(){
        for(int i=1;i<5;i++){
            try{
                Thread.sleep(500);
            }catch(InterruptedException e){System.out.println(e);}
            System.out.println(i);
        }
    }
    public static void main(String[] args){
        L11A5 t1=new L11A5();
        L11A5 t2=new L11A5();
        t1.start();
        t2.start();
    }
}