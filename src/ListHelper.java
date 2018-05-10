import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ListHelper implements IListHelper {

    @Override
    public ArrayList<Integer> range(int from, int to) {
        return IntStream
            .range(from, to + 1)
            .boxed()
            .collect(Collectors.toCollection(ArrayList::new));
    }

    @Override
    public ArrayList<Integer> getEven(ArrayList<Integer> list) {
        return list
            .stream()
            .filter(i -> i % 2 == 0)
            .collect(Collectors.toCollection(ArrayList::new));
    }

    @Override
    public ArrayList<Integer> getOdd(ArrayList<Integer> list) {
        return list
            .stream()
            .filter(i -> i % 2 != 0)
            .collect(Collectors.toCollection(ArrayList::new));
    }

    @Override
    public ArrayList<Integer> multiply(ArrayList<Integer> list, int by) {
        return null;
    }

    @Override
    public ArrayList<Integer> add(ArrayList<Integer> listOne, ArrayList<Integer> listTwo) {
        return null;
    }

    @Override
    public int sum(ArrayList<Integer> list) {
        return 0;
    }

    @Override
    public int average(ArrayList<Integer> list) {
        return 0;
    }

    @Override
    public ArrayList<Integer> fibonacci(int amount) {
        return null;
    }

    @Override
    public ArrayList<Integer> linear(double base, double multiplier) {
        return null;
    }

    @Override
    public ArrayList<Integer> exponential(double base, double exponent) {
        return null;
    }
}
