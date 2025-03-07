package notes;
 
/**
 * BooleanLogic.java - description
 *
 * @author Thomas.P
 * @since Feb 7, 2025, 10:20:50 a.m.
 */
public class BooleanLogic 
{

    /**
     * 
     * boolean logic:
     * The reason that boolean logic is binary is because binary is a base 2 system
     * and only represented by to numbers in witch booleans are also something that
     * only have two states to represent itself
     * 
     * ========================================================================= 
     * a two state system is a run off of a base 2 system represented by 1 and 0
     * and this is known as binary. 
     *                +
     *      1   |     0
     *      2   |     1
     *      3   |    10
     *      4   |    11
     *      5   |   100
     *                +
     * there is a pattern in binary though the first column represented by + above
     * is always 01010101010101 and every column after that is doubled 
     * (ex: 0011 | 00001111 | 0000000011111111, etc)
     * =========================================================================
     * 
     * BIT - "binary digit"
     * 
     * MSB - "most significant BIT"
     * 
     * =========================================================================
     * addition is as easy as it seems
     *                                           1
     *      101100  |   101100  |   101100  |   101100  |   101100  |   101100  |
     *     +101011  |  +101011  |  +101011  |  +101011  |  +101011  |  +101011  |
     *     -------  |  -------  |  -------  |  -------  |  -------  |  -------  |
     *           1  |       11  |      111  |     0111  |    10111  |  1010111  |
     * =========================================================================
     * 
     * to convert a number into a binary you must divide the number.
     * dividing done in this context is dividing the number by two with only remainders
     * and no decimals until the number being divided goes below zero. then you 
     * format the remainders into a binary number starting from last to first
     * 
     * ---------+-----------+-----------+-----------+-----------+-----------+
     * 286/2    |   143/2   |   71/2    |   35/2    |   17/2    |   8/2     |
     * -----    |   -----   |   ----    |   ----    |   ----    |   ---     |
     * 143|R0   |   71|R1   |   35|R1   |   17|R1   |   8|R1    |   4|R0    |
     * ---------+-----------+-----------+-----------+-----------+-----------+
     * 4/2      |   2/2     |   1/2     |                       |
     * ---      |   ----    |   ----    |   100011110 == 286    |
     * 2|R0     |   1|R0    |   0/R1    |                       |
     * ---------+-----------+-----------+-----------------------+
     * =========================================================================
     * 
     * turning a binary back into it's number form is done through multiplication.
     * in order to convert a binary into a hexidecimal number you have to multiply
     * every number from front to back by two to the exponent of the index number you 
     * are on (rise to fall) and add it all up to get your number.
     * 
     * 100011110
     * ------------+-----------+-----------+-----------+------------+-----------+
     * 1*2^8 = 256 | 0*2^7 = 0 | 0*2^6 = 0 | 0*2^5 = 0 | 1*2^4 = 16 | 1*2^3 = 8 |
     * ----------+-+---------+-+---------+-+-----------+------------+-----------+
     * 1*2^2 = 4 | 1*2^1 = 2 | 0*2^0 = 0 |  == 286
     * ----------+-----------+-----------+
     * 
     * =========================================================================
     * 
     * converting a char or string to binary is done using the ASCII method using
     * the ASCII table which is stored inside of every machine. for a char it will
     * 
     * =========================================================================
     * 
     * Boolean --> 0,1 --> T,F
     * Logic --> axiomatic --> number system
     *   |
     *   |
     *  \ /
     * prob solve --> algebra
     *      |
     *      |
     *     \ /
     *      code --> algorithm
     * 
     * =========================================================================
     * 
     * axiomatic operations does math operations with the known common operations
     * where as boolean has different math operations to the common ones.
     * 
     * the boolean operations are Not, And, Or.
     * 
     * -------------------------------------------------------------------------
     * 
     * Not: is shown as (0'=1, ¬0=1, or overline) read as 0 not 1
     * 
     *      *0 false, 1 true
     * 
     *      x | Not
     *    ----+----
     *      0 | 1
     *    ----+----
     *      1 | 0
     *    ----+----
     * 
     * -------------------------------------------------------------------------
     * 
     * And: represented as (xy) in boolean algebra read as x and y.
     * 
     *      *0 false, 1 true
     * 
     *      x | y | And
     *    ----+---+----
     *      0 | 0 | 0
     *    ----+---+----
     *      0 | 1 | 0
     *    ----+---+----
     *      1 | 0 | 0
     *    ----+---+----
     *      1 | 1 | 1
     *    -------------
     * 
     * -------------------------------------------------------------------------
     * 
     * Or: represented as (x+y) in boolean algebra read as x or y.
     * 
     *      *0 false, 1 true
     * 
     *      x | y | Or
     *    ----+---+----
     *      0 | 0 | 0
     *    ----+---+----
     *      0 | 1 | 1
     *    ----+---+----
     *      1 | 0 | 1
     *    ----+---+----
     *      1 | 1 | 1
     *    -------------
     * -------------------------------------------------------------------------
     * 
     *      ¬xy + ¬(xy) + z = q
     *  
     *      this equation is read as (not x or y and x or y not and z = q)
     * 
     *      if: x = 0, y = 1, z = 1,
     * 
     *      ¬01 + ¬(01) + 1 = q
     *      --------------------
     *      ¬1 + ¬1 + 1 = q
     *      ---------------
     *      0 + 0 + 1 = q
     * -------------------
     *      0 + 1 = q
     * ----------------
     *      0 = q
     *      
     * =========================================================================
     * 
     *  [HYPERLINK BLOCKED]
     * 
     * 0101 1011 0100 1000 0101 1001 0101 0000 0100 0101 0101 0010 0100 1100 0100 1001 0100 1110 0100 1011 0010 0000 0100 0010 0100 1100 L
     * 
     */
    
}