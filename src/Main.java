import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        MyClass obj1 = new MyClass(Arrays.asList(1, 2, 3), "First");
        MyClass obj2 = new MyClass(Arrays.asList(4, 5, 6), "Second");
        MyClass obj3 = new MyClass(Arrays.asList(7, 8, 9), "Third");
        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj3);

        List<MyClass> myClassList = Arrays.asList(obj1, obj2, obj3);

        Set<String> resultSet = myClassList.stream()

                .sorted(Comparator.comparing(MyClass::getName).reversed())

                .flatMap(myClass -> myClass.getNumbers().stream())

                .map(number -> "Element: " + number)

                .collect(Collectors.toSet());

        resultSet.forEach(System.out::println);
    }
}