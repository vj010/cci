package ArrayAndString;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.Arrays;
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
        String[] characters = str.split("");
        Arrays.sort(characters);
        for (int i = 1; i < characters.length; i++) {
            if (characters[i] == characters[i - 1]) {
                return false;
            }
        }
        return true;
    }
}