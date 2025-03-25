package classexamples;
 
/**
 * TeddySearchAlgo.java - description
 *
 * @author Thomas.P
 * @since Mar 21, 2025, 9:41:08 a.m.
 */
public class TeddySearchAlgo 
{

    /**
     * Default constructor, set class properties
     */
    public TeddySearchAlgo() {
        
    }
    
      public int[] sillySort(int[] orgin) {
        int[] sortedArray = orgin;
        
        for (int i = 0; i < orgin.length; i++) {
            int lastIndex = i - 1;
            int curent = orgin[i];
            if (lastIndex > -1) {
                int last = orgin[lastIndex];
                
                if (curent > last) {
                    System.out.println("int[" + i + "] (" + curent + ") is greater than int[" + lastIndex + "] (" + last + ")");
                    System.out.println("[" + lastIndex + "] is now " + curent);
                    sortedArray[lastIndex] = curent;
                    System.out.println("[" + i + "] is now " + last);
                    sortedArray[i] = last;
                    
                    System.out.println("New array step: ");
                    //outputInts(sortedArray);
                    
                    return sillySort(sortedArray);
                }
            } else {
                System.out.println("int[" + i + "] (" + curent + ") This was the first int the array");
            }
        }
        
        return sortedArray;
    }

    
}