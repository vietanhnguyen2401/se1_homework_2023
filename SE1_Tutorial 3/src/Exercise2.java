
public class Exercise2 {
//    public static int fact(int n) throws NonPosiveException{
//
//    }

    public static int searchForLoop(int[] a, int x) throws NullPointerException, NotFoundException {
        if (a == null) {
            throw new NullPointerException("Array is null");
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] == x) {
                return i; // Element found at index i
            } else if (a[i] > x) {
                throw new NotFoundException("Element not found");
            }
        }

        throw new NotFoundException("Element not found");
    }
    public static int searchWhileLoop(int[] a, int x) throws NullPointerException, NotFoundException {
        if (a == null) {
            throw new NullPointerException("Array is null");
        }
        int i = 0;
        try {
            while (true) {
                if (a[i] == x) {
                    return i; // Element found at index i
                } else if (a[i] > x) {
                    throw new NotFoundException("Element not found");
                }
                i++;
            }
        } catch (IndexOutOfBoundsException e) {
            throw new NotFoundException("Element not found");
        }
    }
}
