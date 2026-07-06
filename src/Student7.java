public class Student7 extends Person2 {
    private int stuNo;

    public Student7(String name) {
        // this()はこのクラスのコンストラクタを呼び出す
        this(name, 999);
    }

    public Student7(String name, int stuNo) {
        // super()はスーパークラスのコンストラクタを呼び出す
        super(name);
        this.stuNo = stuNo;
    }

    public void display() {
        // super.display()でスーパークラスのdisplay()を呼び出す
        super.display();
        System.out.println("Student7学籍番号：" + stuNo);
    }

}