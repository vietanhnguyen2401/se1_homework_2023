package Exercise1_and_2;

public class Counter {
    private int count;
    private int index;

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
}
