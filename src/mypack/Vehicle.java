package mypack;

// 抽象クラスはインスタンス化できない。抽象クラス型の配列を作ることはできる
public abstract class Vehicle {
    // アクセス修飾子　サブクラスからもアクセス可能
    protected int crewNum;
    public abstract void showCrewNum();
}
