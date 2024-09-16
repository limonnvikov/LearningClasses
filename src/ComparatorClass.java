import java.util.*;
class CmparatorClass{
}
class Person1 {
    String name;
    int age;

    Person1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + "(" + age + " years)";
    }
}
   class AgeComparator implements Comparator<Person1>{
                @Override
       public int compare(Person1 p1, Person1 p2){
                    return Integer.compare(p2.age, p1.age);
                }
   }