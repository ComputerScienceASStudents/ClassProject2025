/** Required package class namespace */
package code;

import java.util.ArrayList;

/**
 * SearchingAndSorting - description
 *
 * @author Teddy Macdonald
 * @since Mar 13, 2025
 */
public class SearchingAndSorting {

    private String names[];
    private ArrayList<String> nameList;

    /**
     * Default constructor, sets class properties
     */
    public SearchingAndSorting() {
        nameList = new ArrayList();
        
        unsortNames();
//        System.out.println(findName("Norman"));
//        System.out.println(findNamePosition("AJ"));
        System.out.println(findNameInList("Rowan"));
        System.out.println(findNamePositionInList("Teacher Man"));
        int[] ages = {
            5,
            2,
            7,
            10,
            0
        };
        System.out.println("ages: ");
        outputInts(ages);
        
        int[] sortedAges = sillySort(ages);
        
        System.out.println("sortedAges: ");
        outputInts(sortedAges);
    }

    public void unsortNames() {
        String names[] = {
            "Teddy",
            "AJ",
            "Rowan",
            "Tristan",
            "Teacher Man",
            "Norman",
            "Danier",
            "Florence",
            "Nate"
        };
        
        nameList.clear();
        
        for (String name : names) {
            nameList.add(name);
        }
        
        this.names = names;
    }

    public boolean findName(String targetName) {
        for (String name : names) {
            if (name == targetName) return true;
        }
        return false;
    }
    
    public int findNamePosition(String targetName) {
        for (int i = 0; i < names.length; i++) {
            if (names[i] == targetName) return i;
        }
        return -1;
    }
    
    public boolean findNameInList(String targetName) {
        for (String name : nameList) {
            if (name == targetName) return true;
        }
        
        return true;
    }
    
    public int findNamePositionInList(String targetName) {
        for (int i = 0; i < nameList.size(); i++) {
            if (nameList.get(i) == targetName) return i;
        }
        
        return -1;
    }
    
    public void outputNames() {
        for (String name : names) {
            System.out.println("Name - " + name);
        }
    }
     public void outputInts(int[] ints) {
        for (int interger : ints) {
            System.out.println("int - " + interger);
        }
    }
    
    /**
     * The silly ass sort function I made while bored
     * 
     * @param orgin
     * @return 
     */
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
                    outputInts(sortedArray);
                    
                    return sillySort(sortedArray);
                }
            } else {
                System.out.println("int[" + i + "] (" + curent + ") This was the first int the array");
            }
        }
        
        return sortedArray;
    }

}
