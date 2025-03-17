/** Required package class namespace */
package code;

/**
 * SearchingAndSorting - description
 *
 * @author Teddy Macdonald
 * @since Mar 13, 2025
 */
public class SearchingAndSorting {

    private String names[];

    /**
     * Default constructor, sets class properties
     */
    public SearchingAndSorting() {
        unsortNamesArray();
        System.out.println(findName("Norman"));
        System.out.println(findNamePosition("AJ"));
    }

    public void unsortNamesArray() {
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
    
    public void outputNames() {
        for (String name : names) {
            System.out.println("Name - " + name);
        }
    }
    
    public void sortNamesByLength() {
        boolean sorted = false;
        
        while (!sorted) {            
            
        }
    }

}
