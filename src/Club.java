// abstractメソッドが含まれているクラスは抽象クラスと呼ばれる。抽象クラスはインスタンス化できない。
public abstract class Club {
    private String name;

    public Club(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("クラブ名：" + name);
    }

    // 中身がないメソッドを抽象メソッドと呼ぶ。abstractをつけることで、継承先で必ずオーバーライドする必要がある。
    public abstract void practice();
}
