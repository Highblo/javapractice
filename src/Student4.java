public class Student4 {
    // 属性
    String name;
    // インスタンス内で共通の変数
    static int counter = 0;

    // コンストラクタ
    Student4(String n) {
        name = n;
        counter++;
        System.out.println(name + "さんをインスタンス化しました");
    }
    
    // インスタンス内で共通のメソッド
    static void display() {
        System.out.println(counter + "人です");
    }
}
