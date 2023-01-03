public class chapter_4 {
    public static void main(String[] args) {

        System.out.println("エラーも内容によって捉えられるエラーと捉えられないエラーがある");

        try {
            int number = 0;
            int answer = 100 / number;
            System.out.println(answer);
        } catch (Exception e) {
            System.out.println("0では割り算できません");
            e.printStackTrace();
        } finally {
            System.out.println("これが通常");
        }

        System.out.println("");
        System.out.println("Integer.parseIntの場合");

        try {
            int number = Integer.parseInt("a");//Integer.parseIntは文字列を数字に変換している
            int answer = 100 / number;
            System.out.println(answer);
        } catch (NumberFormatException e) {
            System.out.println("ナンバーフォーマットエクセプションの場合");
            e.printStackTrace();
        } finally {
            System.out.println("種類の変更");
        }


        try {
            int number = Integer.parseInt("0");//Integer.parseIntは文字列を数字に変換している
            int answer = 100 / number;
            System.out.println(answer);
        } catch (ArithmeticException e) {
            System.out.println("算術クラスの例外を対象とする");
            e.printStackTrace();
        } finally {
            System.out.println("算術計算のエラーを補足する");
        }


    }
}
