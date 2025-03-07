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
        
        int x = 48;
        
        System.out.println(x % 2);
        
        System.out.println(x % 7);
        
    }
    
}