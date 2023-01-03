public class chapter_3 {
    public static void main(String[] args) {

        System.out.println("hey!");

        try {
            int number = 0;
            int answer = 100 / number;
            System.out.println(answer);
        } catch (Exception e) {
            System.out.println("0では割り算出来ません"); //このようにする事でエラー表示を分かりやすくする事が出来る
            System.out.println(e);  //e変数でも例外メッセージを表示出来る
            System.err.println("0では割り算出来ません");//実行時エラーのみに表示させる記述の仕方　この記述を標準エラー出力という
          //  e.printStackTrace();  //この記述でエラーを出力している
        } finally {
            System.out.println("Java!!");
        }
    }
}
