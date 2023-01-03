public class chapter_5 {
    public static void main(String[] args) {
        //例外処理は一つの例外だけを対応するのではなく、複数のエラーに対応するように記述する事が出来る
        //子要素を対象に上から順に処理する　もし親要素のエラーを先に記述すると、コンパイルエラーを起こす点に注意する事
        try {
            int number = Integer.parseInt("0");
            int answer = 100 / number;
            System.out.println(answer);
        } catch (NumberFormatException e) {
            System.err.println("文字列を数値に変換できません");
        } catch (ArithmeticException e) {
            System.err.println("0では、割り算できません");
        } catch (Exception e) {
            System.err.println("例外を捕捉しました");
        }
    }
}
