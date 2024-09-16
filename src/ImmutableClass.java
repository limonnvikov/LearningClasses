public final class ImmutableClass {
    private final String name;
    private final int age;

    public ImmutableClass(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
public static void main(String[] args){
        ImmutableClass person = new ImmutableClass("Kostya", 23);
    System.out.println(person.getName() + ", " + person.getAge());
}
}
