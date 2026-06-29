public class Student3 {
    // 属性
    String name;
    int engScore;
    int mathScore;

    // コンストラクタ
    Student3(String n) {
        name = n;
    }
    
    Student3(String n, int eng, int math) {
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
