/*
Write a program to name the thread. In the main program change the name of the thread.
*/

class ThreadNaming extends Thread {
    ThreadNaming(String name)
    {super(name);}
    @Override public void run()
    {System.out.println("Thread is running");}
}
class L11A3 {
    public static void main(String[] args) {
        ThreadNaming t1 = new ThreadNaming("ICT Department");
        ThreadNaming t2 = new ThreadNaming("CCE");
        System.out.println("Thread 1: " + t1.getName());
        System.out.println("Thread 2: " + t2.getName());
        t1.start();
        t2.start();
    }
}