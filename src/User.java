import enums.Gender;
import exceptions.IllegalAgeException;
import exceptions.IllegalEmailFormatException;

import java.util.Objects;

public class User implements Comparable<User> {

    private String firstName;
    private String lastName;
    private String email;
    private int age;
    private Gender gender;

    public User(String firstName, String lastName, String email, int age, Gender gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
        this.gender = gender;
//        this.isAdult = true;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) throws IllegalEmailFormatException {
        if (!email.contains("@")) {
            throw new IllegalEmailFormatException("Błąd");
//            throw new IllegalArgumentException("Incorrect email address");
//            System.out.println("Incorrect email address");
        } else {
            this.email = email;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws IllegalAgeException {
        if (age < 18) {
            throw new IllegalAgeException("Błąd");
        } else {
            this.age = age;
        }
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age && Objects.equals(firstName, user.firstName) && Objects.equals(lastName, user.lastName) && Objects.equals(email, user.email) && gender == user.gender;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, email, age, gender);
    }

    @Override
    public int compareTo(User user) {
        int compareResult = this.getFirstName().compareTo(user.getFirstName());
        if (compareResult == 0) {
            compareResult = this.getLastName().compareTo(user.getLastName());
        }
        return compareResult;
    }
}
