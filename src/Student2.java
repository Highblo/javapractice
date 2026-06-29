public class Student2 {
    // 属性
    String name;
    int engScore;
    int mathScore;

    // 操作
    void setData(String n) {
        name = n;
    }
    // メソッドの名前が同じでも、引数の型や数が違えば、別のメソッドとして扱われる(オーバーロード)
    void setData(String n, int eng, int math) {
        name = n;
        engScore = eng;
        mathScore = math;
    }

    void setScore(int eng, int math) {
        engScore = eng;
        mathScore = math;
    }
        
    void display() {
        System.out.println("名前：" + name);
        System.out.println("英語：" + engScore + "点");
        System.out.println("数学：" + mathScore + "点");
    }
}
