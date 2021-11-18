public class Test {
    public static void main(String[] args) {
        Thread obj=  Thread.currentThread();//Current thread method is a static method
        obj.setName("Raj");
        System.out.println(obj.isAlive());//returns boolean value weather the thread is in running state or not
        System.out.println(obj.getName());
        System.out.println(obj.isDaemon());//low priority background running threads are known as daemons threads and returns boolean value
        obj.setPriority(Thread.MAX_PRIORITY);//for setting the priority
        System.out.println(obj.getPriority());//by using this we will get priority value min prior=1 ,norm prior=5 ,max prior=10
        System.out.println(obj.getId());//to get the unique identity
        System.out.println(obj.getState());
        System.out.println(obj.getContextClassLoader());
    }
}
