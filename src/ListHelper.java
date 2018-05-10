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
        return list
            .stream()
            .map(i -> i * by)
            .collect(Collectors.toCollection(ArrayList::new));
    }

    @Override
    public ArrayList<Integer> add(ArrayList<Integer> listOne, ArrayList<Integer> listTwo) {
        ArrayList<Integer> finalList = new ArrayList<>();

        finalList.addAll(listOne);
        finalList.addAll(listTwo);

        return finalList;
    }

    @Override
    public int sum(ArrayList<Integer> list) {
        return list
            .stream()
            .reduce(0, (acc, cur) -> acc + cur);
    }

    @Override
    public int average(ArrayList<Integer> list) {
        return this.sum(list) / list.size();
    }

    private ArrayList<Integer> fibonacci(int amount, ArrayList<Integer> list) {
        if (amount == 0) {
            return list;
        }

        list.add(list.get(list.size() - 1) + list.get(list.size() - 2));

        return fibonacci(amount - 1, list);
    }

    @Override
    public ArrayList<Integer> fibonacci(int amount) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(0);
        list.add(1);

        return fibonacci(amount - 2, list);
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
