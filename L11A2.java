/*
Write a program to explain the multithreading with the use of multiplication tables.
Three threads must be defined. Each one must create one multiplication table;
they are 5 table, 7 table and 13 table.
*/

public class L11A2 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MultiplicationTable(5));
        Thread t2 = new Thread(new MultiplicationTable(7));
        Thread t3 = new Thread(new MultiplicationTable(13));
        t1.start();
        t2.start();
        t3.start();
    }
}
class MultiplicationTable implements Runnable {
    int n;
    MultiplicationTable(int n) {
        this.n = n;
    }
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + n * i);
        }
    }
}