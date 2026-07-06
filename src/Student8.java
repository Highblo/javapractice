public class Student8 {
    private String name;
    private Club club;

    // 引数として、名前とオブジェクトを受け取る
    public Student8(String name, Club club) {
        this.name = name;
        this.club = club;
    }

    public void display() {
        System.out.println("名前：" + name);
        // Club型なのでClubクラスのdisplayメソッドが呼ばれる。オーバーライドされている場合は、継承先のクラスのdisplayメソッドが呼ばれる。
        club.display();
    }

    public void practice() {
        // Club型なのでClubクラスのpracticeメソッドが呼ばれる。オーバーライドされている場合は、継承先のクラスのpracticeメソッドが呼ばれる。
        club.practice();
    }
}
