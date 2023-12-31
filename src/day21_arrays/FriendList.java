package day21_arrays;

import java.util.*;

public class FriendList {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("How many friends to you have: ");
        int numOfFriends = input.nextInt(); // 7

        // Here you to add how many dynamic numbers the user asks Array container.
        String[] friendNameList = new String[numOfFriends];  // 7 - > 0, 1, 2, 3, 4, 5, 6

        // How can I ask a user to enter each friend's name and store it into the array?
        for (int i = 0; i < numOfFriends; i++) {

            System.out.print("Enter your friends name: ");
            String name = input.next();
            friendNameList[i] = name;
        }

        System.out.println(Arrays.toString(friendNameList));

    }
}
