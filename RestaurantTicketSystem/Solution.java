package RestaurantTicketSystem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    private static String[] menu = {"Burger", "Fries", "Chicken", "Pizza", "Sandwich", "Onionrings", "Milkshake", "Coke"};
    public static void main(String[] args) {
        System.out.println(getOrder("milkshakecokemilkshake"));
        //shake Milkshake Coke
    }

    public static String getOrder(String input) {
        if(input.isEmpty()) {
            return "";
        }
        String[] notOrganized = toArray(input);
        ArrayList<String> organized = new ArrayList<>();
        int count = 0;
        int counter = 0;

        //capitalize
        for (int i = 0; i < notOrganized.length ; i++) {
            notOrganized[i] = notOrganized[i].substring(0, 1).toUpperCase() + notOrganized[i].substring(1, notOrganized[i].length());
        }

        //sort
        for (int i = 0; i < menu.length; i++) {
            count = countOccurences(notOrganized, menu[i]);

            for (int j = 0; j < count ; j++) {
                organized.add(menu[i]);
            }
        count ++;
        }

        String answer = organized.toString();
        answer = answer.replace(",", "");
        answer = answer.replace("[", "");
        answer = answer.replace("]", "");
        return answer;
    }



    public static String[] toArray(String input) {
        String current;
        String newy;


        for (int i = 0; i < menu.length; i++) {
                current = menu[i].toLowerCase();
                newy = current + " ";
                input = input.replaceAll(current, newy);
        }

        String[] order = input.split(" ");

        return order;
    }

    public static int countOccurences(String[] order, String word){
        int count = 0;
        for (int i = 0; i < order.length; i++) {
            if (order[i].equals(word)) {
                count ++;
            }
        }
        return count;
    }

}



