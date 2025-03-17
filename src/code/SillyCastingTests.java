/** Required package class namespace */
package code;


/**
 * SillyCastingTests - description
 * 
 * @author Teddy Macdonald
 * @since Mar 17, 2025
 */
public abstract class SillyCastingTests 
{
    
    /**
     * Tests some rounding issues and double casting logic
     */
    public static void testBooleanCastRules() {
        double double1 = (double)(1 / 2); // Does int logic then boolean cast for 0.0 not 0.5!!!!
        double double2 = 3 * 4;
        double double3 = (double1 * double2);
        double double4 = (double)(double1 * double2);
        double double1CastAsDouble = (double)1/2;
        double double5 = (double1CastAsDouble * double2);
        System.out.println("double1: " + double1);
        System.out.println("double2: " + double2);
        System.out.println("double3: " + double3);
        System.out.println("double4: " + double4);
        System.out.println("double1CastAsDouble: " + double1CastAsDouble);
        System.out.println("double5: " + double5);
        System.out.println("1/2: " + 1/2);
        System.out.println("1/2: " + (double)1/2);
        
        // Takaway: brackets make the computer preform int logic firts,
        // sout dosnt require a cast, and logic with established doubles
        // does not need to be re cast (double5 logic)
    }
    
}
