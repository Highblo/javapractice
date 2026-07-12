public class Student9 implements Englishable {
    private String name;

    public Student9(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("名前：" + name);
    }

    public void displayEng() {
        System.out.println(Englishable.LANGUAGE);
        System.out.println("Name: " + name);
    }
}
