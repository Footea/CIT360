import java.util.*;

public class test {
    public static void main(String[] args) {

        System.out.println("-- List --");
        List list = new ArrayList();
        list.add("Hi");
        list.add("my");
        list.add("name");
        list.add("is");
        list.add("Troy");
        list.add("Hi");

        for (Object str : list) {
            System.out.println((String) str);
        }
    }
}
