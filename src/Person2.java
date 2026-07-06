public class Person2 {
    private String name;

    public Person2(String name) {
        // this はこのオブジェクトを表す
        this.name = name;
    }

    public void display() {
        System.out.println("Person2名前：" + name);
    }
}