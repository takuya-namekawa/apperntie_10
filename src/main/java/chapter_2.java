public class chapter_2 {
    public static void main(String[] args) {

        System.out.println("Hello world");
//tryを用いて例外処理が起こる場所を囲む
        try {
            int number = 0;
            int answer = 100 / number;
            System.out.println(answer);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Hello java");
        }
    }
}
