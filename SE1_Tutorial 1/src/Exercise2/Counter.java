package Exercise2;

public class Counter {
    int count;
    int index;

    /**
     * @effects Makes this contain 0
     */
    public Counter() {
        this.count = 0;
    }

    /**
     *
     * @effects Returns the value of this
     */
    public int get() {
        return this.index;
    }

    /**
     * @modifies this
     * @effects Increments the value of this
     */
    public void incr() {
        this.count++;
    }
    public static void main(String[] args) {
        Counter c = new Counter();
        c.incr();
        System.out.println(c.get());
    }

}
