import java.util.*;
import java.util.stream.Collectors;

public class NotComparatorClass {
}

class MyClass {
    private List<Integer> numbers;
    private String name;

    public MyClass(List<Integer> numbers, String name) {
        this.numbers = numbers;
        this.name = name;
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "MyClass{name='" + name + "', numbers=" + numbers + "}";
    }
}


