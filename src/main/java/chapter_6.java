import java.util.*;
public class chapter_6 {
    public static void main(String[] args) {

        String[] player = {"戦士", "勇者", "魔法使い"};


        try {
            Scanner sc = new Scanner(System.in);
            int number = Integer.parseInt(sc.next());

            System.out.println(player[number] + "は、モンスターを倒した！");
        } catch (ArrayIndexOutOfBoundsException e) {//配列の範囲を超える数値を捉えた場合のエラーを検知して、エラー分を出力する
            System.out.println("0から" + (player.length - 1) + "を入力してください");
        } catch (NumberFormatException e) {//数値以外の入力があった場合にエラーを検知してくれる
            System.out.println("数値を入力してください");
        } finally {
            System.out.println("次の冒険が始まった");
        }



    }
}
