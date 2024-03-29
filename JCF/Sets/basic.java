import java.util.HashSet;
import java.util.Set;

public class basic {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<Integer>();

        System.out.println(set.size()); // 4

        set.clear();
        System.out.println(set); // []
    }
}
