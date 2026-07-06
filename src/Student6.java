// Personクラスを継承したStudent6クラス
public class Student6 extends Person {
    private int stuNo;

    public void setStuNo(int s) {
        stuNo = s;
    }

    public void displayStuNo() {
        System.out.println("学籍番号：" + stuNo);
    }
    
    // オーバーライド
    public void display() {
        System.out.println("学籍番号：" + stuNo);
        System.out.println("名前：" + getName());

    }

}
