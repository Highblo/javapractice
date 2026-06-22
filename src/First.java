public class First {
    public static void main(String[] args) {
        //Hello Worldの出力
        System.out.println("Hello World");

        //変数
        int month;
        month = 6;
        int day = 14;

        System.out.println("今日は" + month + "月" + day + "日です");

        //基本データ型,参照型
        float weight = 70.3f;
        double height = 175.5;
        char bloodType = 'O';

        String name = "○○";

        System.out.println("私は" + name + "です");
        System.out.println("身長は" + height + "cm、体重は" + weight + "kg");
        System.out.println("血液型は" + bloodType + "型です");

        //配列
        int[] score = new int[3];
        score[0] = 80;
        score[1] = 100;
        score[2] = 70;

        String[] arrayName = {"田中", "佐藤" ,"山田"};

        System.out.println(arrayName[0] + "さん：" + score[0] + "点");
        System.out.println(arrayName[1] + "さん：" + score[1] + "点");
        System.out.println(arrayName[2] + "さん：" + score[2] + "点");
        System.out.println("受験者数：" + score.length + "名");

        //多次元配列
        int[][] allScore = new int[2][3];

        int[][] multiArray = { {10,20,30}, {40,50,60} };

        System.out.println(allScore.length);
        System.out.println(allScore[0].length);
        System.out.println(multiArray[0][0]);
        System.out.println(multiArray[0][1]);
        System.out.println(multiArray[0][2]);

        //javaコマンド実行時にargsにデータを渡せる
        System.out.println(args[0]);
        System.out.println(args[1]);
        // System.out.println(args[2]);
        // System.out.println(args[3]);
        // System.out.println(args[4]);
        // System.out.println(args.length);

        //演算子
        //文字列を数値に変換
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        //算術演算子
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b)); // 割り切れない場合は切り捨て
        System.out.println("a % b = " + (a % b));

        //関係演算子
        System.out.println("a >= 0 : " + (a >= 0));

        //論理演算子
        System.out.println("(a >= 0) && (b >= 0) = " + ((a >= 0) && (b >= 0)));

        //型変換
        int price = Integer.parseInt(args[0]);
        double tax = 0.08;
        int amount;

        //キャスト　小⇒大は自動で変換されるが、大⇒小は明示的にキャストする必要がある
        amount = (int)(price * (1 + tax));
        System.out.println("税込価格：" + amount + "円");
    }

}
