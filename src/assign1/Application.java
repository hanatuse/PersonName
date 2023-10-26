package assign1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Application {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        //friend1 - Maggie
        Person friend1 = new Person();
        friend1.setName("Maggie");
        friend1.setBirthday(dateFormat.parse("1997-02-22"));
        friend1.setHobbies(new String[]{"piano", "yoga"});
        System.out.println(friend1.toString());

        //friend2 - John Doe
        Person friend2 = new Person();
        friend2.setName("John Doe");
        friend2.setBirthday(dateFormat.parse("1950-01-01"));
        friend2.setHobbies(new String[]{"Gardening", "listening music", "playing soccer"});
        System.out.println(friend2.toString());

        //Clone friend and edit the name
        Person clonedFriend = friend2.clone();
        clonedFriend.setName("Tony");
        System.out.println(clonedFriend.toString());
    }
}
