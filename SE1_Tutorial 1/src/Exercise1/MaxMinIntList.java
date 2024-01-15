package Exercise1;
import java.util.*;

public class MaxMinIntList extends ArrayList<Integer>{
    public Object getMin(){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < this.size(); i++) {
            if (this.get(i).intValue() < min) {
                min = this.get(i);
            }
        }
        return min;
   }
    public Object getMax(){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < this.size(); i++) {
            if (this.get(i).intValue() > max) {
                max = this.get(i);
            }
        }
        return max;
    }

    public boolean repOK(){
        if (this.size() == 0) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        MaxMinIntList maxMinIntList = new MaxMinIntList();
        maxMinIntList.add(1);
        maxMinIntList.add(2);
        maxMinIntList.add(3);
        System.out.println(maxMinIntList.getMin());
        System.out.println(maxMinIntList.getMax());
    }
}

