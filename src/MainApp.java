import enums.Gender;
import enums.WeeksDays;
import exceptions.IllegalEmailFormatException;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class MainApp {

    public static void main(String[] args) {

//        LEKCJA 1
//        System.out.println(WeeksDays.SRODA.getName());
//
//        if ("Środa".equals(WeeksDays.SRODA.getName())){
//            System.out.println("Jest ok");
//        } else  {
//            System.out.println("Nie jest ok");
//        }

//        LEKCJA 2
//        try {
//            BufferedReader bufferedReader = new BufferedReader(new FileReader("test.txt"));
//
//            String line = bufferedReader.readLine();
//            while (line != null) {
//                System.out.println(line);
//                line = bufferedReader.readLine();
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//        LEKCJA 3
//        try {
//            BufferedReader bufferedReader = new BufferedReader(new FileReader("test1.txt"));
//
//            String line = bufferedReader.readLine();
//            while (line != null) {
//                System.out.println(line);
//                line = bufferedReader.readLine();
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            System.out.println("TO WYKONA SIĘ ZAWSZE");
//        }

//       TO CO PONIŻEJ TO NIE JEST REKOMENDOWANE
//        BufferedReader bufferedReader = new BufferedReader(new FileReader("test1.txt"));
//        String line = bufferedReader.readLine();
//        while (line != null) {
//            System.out.println(line);
//            line = bufferedReader.readLine();
//        }

//        LEKCJA 4/ 5

//        User users = new User("Bartek", "Testowy", "wp@wp.pl", 25);
//        System.out.println(users.getFirstName());

//        NullPointerException
//        users = null;
//        System.out.println(users.getFirstName());

//        IndexOutOfBoundsException
//        List<String> names = new ArrayList<>();
//        names.add("Bartek");
//        System.out.println(names.get(1));

//        IllegalStateException
//        List<User> users = new ArrayList<>();
//        users.add(new User("Bartek", "Testowy", "wp@wp.pl", 25));
//        users.add(new User("Franek", "Testowy", "wpwp.pl", 25));

//        String names = users.stream()
//                .map(User::getFirstName)
//                .filter(u -> u.startsWith("A"))
//                .findFirst()
//                .orElseThrow(() -> new IllegalStateException("Brak"));
//        System.out.println(names);

//        IllegalArgumentException
//        User users = new User("Bartek", "Testowy", "w", 25);
//        users.setEmail("e");

//        UnsupportedOperationException

//        ZADANIE DOMOWE

//        1. ENUMS
//        List<User> users = new ArrayList<>();
//        users.add(new User("Bartek", "Testowy", "wp@wp.pl", 25, Gender.MALE));
//        users.add(new User("Anna", "Testowy", "wp@wp.pl", 25, Gender.FEMALE));
//        users.add(new User("Ola", "Testowy", "wp@wp.pl", 25, Gender.FEMALE));
//        users.add(new User("Bartek", "Testowy", "wp@wp.pl", 25, Gender.MALE));

//        users.stream()
//                .filter(u -> u.getGender().equals(Gender.FEMALE))
//                .forEach(u -> System.out.println(u));

//        2. WYJĄTKI

//        List<String> names = new ArrayList<>();
//
//        try {
//            BufferedReader bufferedReader = new BufferedReader(new FileReader("names.txt"));
//
//            String line = bufferedReader.readLine();
//            while (line != null){
//                names.add(line);
//                line = bufferedReader.readLine();
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        System.out.println(names);

//        3. Sprawdzić w streamie czy lista zawiera jakieś imię, jeśli nie to rzucić wyjątkiem
//        String name = names.stream()
//                .filter(u -> u.equals("Michał"))
//                .findFirst()
//                .orElseThrow(() -> new IllegalStateException("Brak"));
//        System.out.println(name);

//        4. Utworzyć własny wyjątek
//        User user = new User("Bartek", "Testowy", "wp@wp.pl", 25, Gender.MALE);
//        user.setAge(10);
//        System.out.println(user);
    }
}
