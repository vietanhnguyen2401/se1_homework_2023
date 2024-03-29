/**
 * @overview
 *  Represents a collection of utility procedures that are commonly used in applications.  
 *   
 * @author dmle
 */
public class Toolkit {
  
  /**
   * @Overview: count the addition of x and y
   * @effects 
   *    return the arithmetic sum of x, y;
   *    i.e. result = x + y.
   */
  public static int add(int x, int y) {
    return x + y;
  }

  /**
   * @Overview: find the remainder of x in its division by y
   * @effects 
   *    return the remainder of x in its division by y;
   *    i.e. result = x - (((int) x/y) * y).
   */
  public static int remainder(int x, int y) {
    return x % y;
  }
  
  /**
   * @Overview: find the larger of a and b
   * @effects
   *    return the larger of a and b (result is the argument closer to positive infinity);
   *    <pre>
   *    i.e.  
   *    if a = b 
   *      result = a
   *    else if a = NaN OR b = NaN
   *      result = NaN 
   *    else if {a,b} = {0+,0-} (one is positive zero and the other negative zero), 
   *      result = 0+ (note: negative zero < positive zero)
   *    else if a > b
   *      result = a
   *    else 
   *      result = b
   *      </pre> 
   */
  public static double max(double x, double y) {
    return Math.max(x,y);
  }

  /**
   * @Overview: calculate the sum of all elements in list a. if array is null or empty, return -1
   * @effects 
   *    if a is null or empty
   *        return -1
   *    else
   *        return the arithmetic sum of the elements of a        
   */
  public static long sum(int[] a) {
    long s = 0;
    for (int x : a) {
      s += x;
    }
    
    return s;
  }

  /**
   * @Overview: find the product of all the elements in a. If a is null or empty, return -1
   * @effects 
   *    if a is null or empty
   *        return -1
   *    else if exists x in a s.t x = 0
   *        return 0
   *    else
   *        return the product of the elements of a        
   */
  public static long product(int[] a) {
    long p = 0;
    for (int x : a) {
      p *= x;
    }
    
    return p;
  }

  /**
   * @Overview: find the number of characters in s. if s is null, throw exception
   * @effects 
   *    if s is null 
   *        throws NullPointerException
   *    else if s is empty
   *        return 0
   *    else
   *        return the number of characters in s
   */
  public static int lenString(String s) throws NullPointerException {
    if (s == null)
      throw new NullPointerException("Toolkit.lenString(null)");

    return s.length();
  }
  
  /**
   * @Overview: find substring of a String, from start position to end position. 
   * If input error, throw exception (string s is null or start point not in s or end point not in s or end point < start point)
   * 
   * 
   * @effects 
   *    if s is null OR startPos * endPos < 0 OR startPos >= endPos OR endPos > length(s)
   *        throws IllegalArgumentException
   *    else 
   *        returns a new string as a substring of s, which 
   *        begins at the character at startPos and 
   *        extends to the character at endPos - 1 
   *        (thus, length(result) = endPos-startPos).
   *        
   *    <p>e.g.:
   *    <pre>
   *        subString("hamburger",4, 8) = "urge"
   *        subString("smiles",1, 5) returns "mile"
   *     </pre>
   */
  public static String subString(String s, int startPos, int endPos) throws IllegalArgumentException {
    if (s == null || startPos * endPos < 0 || startPos >= endPos || endPos > s.length())
      throw new IllegalArgumentException(String.format("Toolkit.subString(%s, %d, %d)", s, startPos, endPos));
    
    return s.substring(startPos, endPos);
  }
  
  // self-testing
  public static void main(String[] args) {
    System.out.println(
        subString("smiles", 1,5)
        //subString(null, 1,5)
        );
    //lenString(null);
  }
}
