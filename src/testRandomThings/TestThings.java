package testRandomThings;
 
/**
 * testgame.java - idk what this is... maybe just exersise
 *
 * @author Thomas.P
 * @since Feb 4, 2025, 10:18:31 a.m.
 */
public class TestThings 
{

    /**
     * Default constructor, set class properties
     */
    public TestThings() {
        subStringTest();
        lastIndexOfTest();
        percentTest();
        
        
        test();
        
        testCompareTo();
    }
    
    private void subStringTest(){
        
        /**
         * public String substring(int beginIndex)
         * Returns a string that is a substring of this string. The substring begins with the character at the specified index and extends to the end of this string.
         * Examples:
         * "unhappy".substring(2) returns "happy"
         * "Harbison".substring(3) returns "bison"
         * "emptiness".substring(9) returns "" (an empty string)
         * 
         * Parameters:
         * beginIndex - the beginning index, inclusive. 
         * Returns:
         * the specified substring.
         * Throws:
         * IndexOutOfBoundsException - if beginIndex is negative or larger than the length of this String object.
         */
        
        String x = "subString does what now?";
        
        String y = x.substring(15);
        
        System.out.println(x);
        System.out.println(y);
        
    }
    
    private void lastIndexOfTest(){
        
        /**
         * public int lastIndexOf(String str) 
         * 
         * Returns the index within this string of the last occurrence of the 
         * specified substring. The last occurrence of the empty string "" is 
         * considered to occur at the index value this.length(). 
         * 
         * The returned index is the largest value k for
         * which: this.startsWith(str, k)
         *
         * If no such value of k exists, then -1 is returned. 
         * 
         * Parameters: str - the substring to search for. 
         * 
         * Returns: the index of the last occurrence of the specified substring,
         * or -1 if there is no such occurrence.
         */
        
        String x = "testing";
        
        System.out.println("finad an s: " + x.lastIndexOf("s"));
        System.out.println("find an x: " + x.lastIndexOf("x"));
        
        System.out.println("find a t: " + x.lastIndexOf("t"));
        System.out.println("find an e: " + x.lastIndexOf("e"));
        
        System.out.println("find an est: " + x.lastIndexOf("est"));
        
        /**
         * 
         * last index of will go left to right starting at index 0 and when asked
         * to find something it will look at the last possible instance of the requested
         * string and will return the index number. if it is searching for a string
         * of multiple chars it will return the index of the start of the String.
         * 
         */
        
    }
    
    private void percentTest(){
        
        /**
         * 
         * i think this is just a math thing i don't understand
         * 
         * i think % means divisible by? like 48 is divisible by 2,4,etc so it ==0
         * but for 7 i have no clue what gives it a six
         * 
         */
        
        /**
         * 
         * I REMEMBER WOOOOOOOOO
         * 
         * This operator is called modulo. Here is it's definition:
         * 
         * In computing and mathematics, the modulo operation returns the 
         * remainder or signed remainder of a division, after one number is 
         * divided by another, called the modulus of the operation.
         * 
         */
        
        int x = 48;
        int y = 2;
        
        System.out.println("modulo: " + x % 2);
        
        System.out.println("modulo: " + x % 7);
        
        System.out.println("modulo: " + y % 10);
        
    }
    
    private void math(){
        
        int x = 1;
        
        int y = 10;
        
        Math.abs(0);
        
        Math.ceilDiv(0, 0);
        
        Math.clamp(0, 0, 0);
        
        Math.floor(0);
        
        Math.getExponent(0);
        
        Math.max(0, 0);
        
        Math.min(0, 0);
        
        Math.pow(0, 0);
        
        Math.random();
        
    }
    
    private void test(){
        
        String oldSeq = "1100000111";
        String segment = "11";
        
        System.out.println("oldSeq before: " + oldSeq);
        
        String newSeq = oldSeq.substring(oldSeq.indexOf(segment) + 2, oldSeq.length() - 1);
        
        if((oldSeq.indexOf(segment) + 1) == (oldSeq.length() - 1)){
            System.out.println("test");
            oldSeq = oldSeq.substring(0, oldSeq.indexOf(segment));
        }else{
            oldSeq = oldSeq.substring(oldSeq.indexOf(segment),
                    oldSeq.indexOf(segment) + 2);
            oldSeq += oldSeq.substring(oldSeq.indexOf(segment) + 2);
        }
        
        System.out.println("oldSeq after: " + oldSeq);
        System.out.println("newSeq = " + newSeq);
        
    }
    
    private void testCompareTo(){
    
        /**
         * 
         * this is the compareTo method. from my understanding it converts the 
         * first char in the string into it's decimal number (ex: A = 65, a = 97)
         * and then it returns the difference between the numbers. However if the
         * first two chars in each string are == then it will move to the next chars
         * in the strings
         * 
         */
        
        String x = "due";
        String y = "dog";
        
        System.out.println(x.compareTo(y));
        
    }
    
}