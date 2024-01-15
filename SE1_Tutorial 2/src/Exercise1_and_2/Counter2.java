package Exercise1_and_2;

public class Counter2 extends Counter{
    int count;
    /**
     * @effects: Makes this contain 0.
     */
    public Counter2(){
        this.count=0;
    }
    /**
     * @modifies this
     * @effects Makes this contain twice its current value.
     */
    public void incr(){
        count *=2;
    }
    public static void main(String[] args) {
        Counter c = new Counter2();
        c.incr();
        System.out.println(c.get());

    }
}
