package ArrayAndString;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;

public class IsUnique {
    public static void main(String[] args) {
        try {
            File file = new File("./ArrayAndString/input.txt");
            FileInputStream fInputtream = new FileInputStream(file);
            Scanner sc = new Scanner(new BufferedInputStream(fInputtream));
            String line = sc.next();
            if (solution(line)) {
                System.out.println("yes");
            } else {
                System.out.println("no");

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static boolean solution(String str) {
        if (str == null) {
            return false;
        }
        if (str.length() > 256) {
            return false;
        }
        boolean[] ascii = new boolean[256];

        for (int i = 0; i < str.length(); i++) {
            if (ascii[str.charAt(i)]) {
                return false;
            }
            ascii[str.charAt(i)] = true;
        }
        return true;
    }
}