
class p32 extends Thread {
    public void run() {
        System.out.println("Hello World");
        System.out.print("\nName : Dev Khunt_23DCS049 ");

    }

    public static void main(String[] args) {
        prac32 thread = new prac32();
        thread.start();
        
    }
}

// using Runnable interface
class prac32 implements Runnable {
     public void run() {
         System.out.println("Hello World");
        System.out.print("\nName : Dev Khunt_23DCS049 ");

     }

     public static void main(String[] args) {
         Thread thread = new Thread(new prac32());
         thread.start();
     }
 }
