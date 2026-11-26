public class Counter{
    int num=10;
    void increment(){
        num++;
    }
    public static void main(String[] args) {
        Counter obj=new Counter();
        obj.increment();
        obj.increment();
        System.out.println("Object 1 increment"+obj.num);
                Counter obj2=new Counter();
        obj2.increment();
        System.out.println("Object 2 increment"+obj2.num);

    }
}