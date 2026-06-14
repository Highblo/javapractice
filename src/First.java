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
    }
}
