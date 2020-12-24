public class Person {
    protected String name;
    protected int[] birthday;
    protected int id;

    public Person(String name, int[] birthday, int id) {
        this.name = name;
        this.birthday = birthday;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int[] getBirthday() {
        return birthday;
    }

    public int getId() {
        return id;
    }
}
