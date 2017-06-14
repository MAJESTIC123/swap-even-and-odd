import java.util.*;
import java.io.*; 
class Swap
{
   public static String swapPairs(String a) {
    String even = "";
    String odd = "";
    int length = a.length();

    for (int i = 0; i <= length-2; i+=2) {          
        even += a.charAt(i+1) + "" + a.charAt(i);
    }

    if (length % 2 != 0) {          
        odd = even + a.charAt(length-1);
        return odd;
    } else {
        return even;
    }
}
public static void main(String[] args)
{
Swapeven sw= new Swapeven();
System.out.println("given string 'computer' ");
System.out.println(sw.swapPairs("computer"));

}
}
