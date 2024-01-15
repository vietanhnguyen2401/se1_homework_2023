package Exercise1_and_2;

public class Counter3 extends Counter{
    int n;
    /**
     * @effects Makes this contain n
    */
    public Counter3(int n){
        this.n=0;
    }
    /**
     * @modifies this
     * @effects If n > 0 adds n to this
     */
    public void incr(int n){
        if(n>0){
            this.n=n+1;
        }
    }
    /**
     * Counter3 is not a legitimate subtype of Counter.
     * The void incr() method in Counter3 is not a subtype of the void incr() method in Counter, because the method in Counter3 has a parameter.
     *
     */
}
