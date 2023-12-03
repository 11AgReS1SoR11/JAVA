public class Triple<T extends Comparable<T>> {
    private T first;
    private T second;
    private T third;

    public Triple(T first, T second, T third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }

    public T getThird() {
        return third;
    }

    public T min() {
        if (first.compareTo(second) <= 0 && first.compareTo(third) <= 0) {
            return first;
        } else if (second.compareTo(first) <= 0 && second.compareTo(third) <= 0) {
            return second;
        } else {
            return third;
        }
    }

    public T max() {
        if (first.compareTo(second) >= 0 && first.compareTo(third) >= 0) {
            return first;
        } else if (second.compareTo(first) >= 0 && second.compareTo(third) >= 0) {
            return second;
        } else {
            return third;
        }
    }

    public double mean() {
        double sum = ((Number) first).doubleValue() + ((Number) second).doubleValue() + ((Number) third).doubleValue();
        return sum / 3;
    }

    public static void main(String[] args) {
        Triple<Integer> triple = new Triple<>(5, 10, 3);
        System.out.println("Min: " + triple.min());
        System.out.println("Max: " + triple.max());
        System.out.println("Mean: " + triple.mean());
    }
}