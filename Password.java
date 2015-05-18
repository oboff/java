//package com.company;

import java.io.Console;
import java.util.Arrays;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Password {

    public static void main(String[] args) throws IOException {
        Console c = System.console();
        if (c == null) {
            System.err.println("No console");
            System.exit(1);
        }

        Map<String, String> credentials = new HashMap<>();
        credentials.put("ob","orlando");

        String login = " ";
        char [] oldPassword = { };

        if (verify(login, oldPassword, credentials)) {
            boolean noMatch;

            do {
                char [] newPassword1 = c.readPassword("Enter your new password: ");
                char [] newPassword2 = c.readPassword("Enter your new password: ");
                noMatch = ! Arrays.equals(newPassword1, newPassword2);
                if (noMatch) {
                    c.format("Passwords don't match. Try again.%n");
                } else {
                    change(login, newPassword1);
                }
                Arrays.fill(newPassword1, ' ');
                Arrays.fill(newPassword2, ' ');
            } while(noMatch);
        }
    }

    private static void change(String login, char[] newPassword1) {
        System.out.format("Password for user %s changed to ", login);
        for (char c : newPassword1) {
            System.out.print(c);
        }
        System.out.format(".%n");
    }

    private static boolean verify(String login, char [] oldPassword, Map<String, String> credentials) {
        String s = new String(oldPassword);

        do {
                login = System.console().readLine("Enter your login: ");
                if (!credentials.containsKey(login)) {
                    System.out.println("**Invlaid login**");
                }
        } while (!credentials.containsKey(login));
        do {
                oldPassword = System.console().readPassword("Enter your old password: ");
                s = new String(oldPassword);
                System.out.println(credentials.get(login) + " <> " + s);
                if (!credentials.get(login).equals(s)) {
                    System.out.println("**Invalid password**");
                }   
        } while (!credentials.get(login).equals(s));
        return true;
    }
}