package section3.ex.hyeeun;

public class TestString5 {

    public static void main(String[] args) {
        String str = "hello.txt";
        String ext = ".txt";

        int index1 = str.indexOf("hello");
        int index2 = str.indexOf(".txt");

        //substring(index1,index2) index2는 포함 안함
        System.out.println("filename = " + str.substring(index1, index2));
        System.out.println("extName = " + str.substring(index2));
    }
}
