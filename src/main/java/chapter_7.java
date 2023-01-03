public class chapter_7 {
    public static void main(String[] args) {
        //throw  を使用すると故意にエラーを起こす事が出来る

        try {
            int number = 2;
            int answer = 100 / number;
            System.out.println(answer);
            throw new ArithmeticException("強制エラー");//引数を付ける事でエラー分も表示させる事が出来る
        } catch (ArithmeticException e) {
            System.out.println("0では割り算出来ません");
        } finally {
            System.out.println("Hey");
        }
    }
}
