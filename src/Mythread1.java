//public class Mythread1 implements Runnable {
//    @Override
//    public void run(){
//        Thread.currentThread().setName("E custom thread");
//        for(int i=0;i<10;i++){
//            System.out.println(Thread.currentThread().getName());
//
//        }
//
//    }
//
//}
class Test1{
    public static void main(String[] args) {
       // Mythread obj=new Mythread();
        Thread obj1=new Thread(()-> {
            Thread.currentThread().setName("E custom thread");
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName());
            }
        });
        obj1.start();
        for (int i=0;i<10;i++){
            System.out.println("mainthread");
        }
    }
}