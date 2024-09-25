import  java.util.*;
import java.io.*;
public class String_Buffer {
    public static void main(String arg[]){
        StringBuffer sb= new StringBuffer("Shiva");/*declare a string buffer class */
        sb.append("Gupta");
        System.out.println(sb);
        sb.insert(1,"Shivam");
        System.out.println(sb);
        sb.replace(1,3,"bye");//replaces the items from 1 to 3 with bye
        System.out.println(sb);
        sb.delete(1,3);//deletes 1,3
        System.out.println(sb);
        sb.reverse();//reverses
        System.out.println(sb);
        sb.reverse();//reverses( bring it back to normal)
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        System.out.println(sb);
        System.out.println(sb.charAt(5));
        sb.deleteCharAt(3);
        System.out.println(sb);
        sb.ensureCapacity(999);/*It is used to increase the capacity of a StringBuffer object.
    The new capacity will be set to either the values we specify or twice the current capacity plus two (i.e. capacity+2), whichever is larger.
    Here, capacity specifies the size of the buffer.*/
    }
}