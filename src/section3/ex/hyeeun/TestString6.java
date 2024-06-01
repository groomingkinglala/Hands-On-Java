package section3.ex.hyeeun;

public class TestString6 {

    public static void main(String[] args) {
        //다시 해보기

        String str = "start hello java, hello spring, hello jpa";
        String key = "hello";

        int count = 0;
        int index = str.indexOf(key);

        while (index >= 0) {
            index = str.indexOf(key, index+1);
            count++;
        }

        System.out.println(count);

    }
}