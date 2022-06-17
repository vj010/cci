package CheckPermutation;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class CheckPermutation {
    public static void main(String[] args) {
        try {
            File file = new File("./CheckPermutation/input.txt");
            FileInputStream fInputtream = new FileInputStream(file);
            Scanner sc = new Scanner(new BufferedInputStream(fInputtream));
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            if (solution(s1, s2)) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static boolean solution(String s1, String s2) {
        if (s1 == null || s2 == null) {
            return false;
        }

        if (s1.length() != s2.length()) {
            return false;
        }

        Set<Character> set = s1.chars().mapToObj(e -> (char) e).collect(Collectors.toSet());

        for (Character c : s2.toCharArray()) {
            if (!set.contains(c)) {
                return false;
            }
        }

        return true;
    }
}
