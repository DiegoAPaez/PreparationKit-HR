package org.week1;


import java.util.Scanner;

public class CamelCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String[] parts = scanner.nextLine().split(";");
            String operation = parts[0];
            String type = parts[1];
            String words = parts[2];

            if (operation.equals("S")) {
                System.out.println(splitCamelCase(words));
            } else if (operation.equals("C")) {
                System.out.println(combineWords(words, type));
            }
        }
        scanner.close();
    }

    private static String splitCamelCase(String words) {
        return words.replaceAll("([a-z])([A-Z])", "$1 $2").replaceAll("\\(\\)", "").toLowerCase();
    }

    private static String combineWords(String words, String type) {
        String[] parts = words.split(" ");
        StringBuilder sb = new StringBuilder(parts[0]);
        for (int i = 1; i < parts.length; i++) {
            sb.append(Character.toUpperCase(parts[i].charAt(0))).append(parts[i].substring(1));
        }
        if (type.equals("M")) {
            sb.append("()");
        } else if (type.equals("C")) {
            sb.replace(0, 1, String.valueOf(Character.toUpperCase(sb.charAt(0))));
        }
        return sb.toString();
    }
}
