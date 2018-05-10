import java.util.ArrayList;

public interface IListHelper {
    /**
     * Returns an array of integers between from and to (including both from and to)
     *
     * @param from - Starting index
     * @param to - Ending index
     * @return An array of integers between from and to
     */
    ArrayList<Integer> range(int from, int to);

    /**
     * Returns a sublist of given list containing only even numbers
     * @param list - Original list
     * @return Sublist containing only even number
     */
    ArrayList<Integer> getEven(ArrayList<Integer> list);

    /**
     * Returns a sublist of given list containing only odd numbers
     * @param list - Original list
     * @return Sublist containing only odd number
     */
    ArrayList<Integer> getOdd(ArrayList<Integer> list);

    /**
     * Multiplies each item in a list by a given integer
     * @param list - Original list
     * @param by - Value of which is each item multiplied
     * @return List of multiplied items
     */
    ArrayList<Integer> multiply(ArrayList<Integer> list, int by);

    /**
     * Joins two lists together
     * @param listOne - First list
     * @param listTwo - Second list
     * @return Joined list
     */
    ArrayList<Integer> add(ArrayList<Integer> listOne, ArrayList<Integer> listTwo);

    /**
     * Adds each item in a list and returns it
     * @param list Original list
     * @return Sum of each item in a list
     */
    int sum(ArrayList<Integer> list);

    /**
     * Computes an average value of items in a given list
     * @param list Original list
     * @return Average value of items in a given list
     */
    int average(ArrayList<Integer> list);

    /**
     * Computes fibonacci numbers from 0 to a given amount
     * @param amount Max value for a fibonacci sequence
     * @return List of fibonacci numbers
     */
    ArrayList<Integer> fibonacci(int amount);

    /**
     * Creates a list of base number multiplied by multiplier from -100 to 100
     * @param base Base number
     * @param multiplier Multiplier number
     * @return List of base numbers multiplied by multiplier
     */
    ArrayList<Integer> linear(double base, double multiplier);

    /**
     * Creates a list of base number raised to a power of exponent number
     * @param base Base number
     * @param exponent Exponent number
     * @return List of base numbers raised to a power of exponent number
     */
    ArrayList<Integer> exponential(double base, double exponent);
}
