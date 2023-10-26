package assign1;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Person implements Cloneable{

    private String name;
    private Date birthday;
    private String[] hobbies;


    //Clone method
    @Override
    public Person clone() {
        try {
           return (Person) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    // Getters and setters methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String[] getHobbies() {
        return hobbies;
    }

    public void setHobbies(String[] hobbies) {
        this.hobbies = hobbies;
    }

    //Display object values using toString method
    public String toString(){
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String parsedBirthday = dateFormat.format(getBirthday());
        String hobbyList = String.join(", ", getHobbies());

        return "Name: %s\nDoB: %s\nHobbies: %s.".formatted(getName(), parsedBirthday, hobbyList);
    }
}
