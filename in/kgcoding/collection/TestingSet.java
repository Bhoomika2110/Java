package in.kgcoding.collection;

import java.util.HashSet;
import java.util.Set;

public class TestingSet {
    public static void main(String[] args) {
        Set<String> name = new  HashSet<>();
        System.out.println(name.add("pihu"));
        System.out.println(name.add(" kg coding"));
        System.out.println(name.add(" prashnat"));
        Utility.print(name);
        System.out.println(name.add(" sanchit"));
        System.out.println(name.size());
        Utility.print(name);
    }
}
