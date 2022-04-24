import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserLogin {

    public static void main(String[] args) {

        String name;
        String lastName;
        int age;
        String date;
        String fullNameWithDate;
        Scanner in = new Scanner(System.in);
        Pattern pattern = Pattern.compile("^([A-Z][a-z]{1,9}) ([A-Z][a-z]{1,20}) (\\d{1,3}) ([a-z]{3}.) (\\d{2}.\\d{2}.\\d{4})$");


        Matcher matcher;
        do {
            System.out.println("Podaj imie:");
            name = in.next();
            System.out.println("Podaj nazwisko:");
            lastName = in.next();
            System.out.println("Podaj wiek:");
            age = in.nextInt();
            System.out.println("Podaj dzisiejszą date wedlug wzoru: dd.mm.rrrr lub dd-mm-rrrr lub dd_mm_rrrr");
            date = in.next();
            fullNameWithDate = name + " " + lastName + " " + age + " " + "lat." + " " + date;
            matcher = pattern.matcher(fullNameWithDate);
            System.out.println("Czy wprowadzone dane sa prawidlowe?: " + matcher.matches());
            if(matcher.matches()){
                String nameMatcher = matcher.group(1);
                String lastNameMatcher = matcher.group(2);
                int ageMatcher = Integer.parseInt(matcher.group(3));
                String ageWordMatcher = matcher.group(4);
                String dateMatcher = matcher.group(5);
                System.out.println("Podales prawidlowe dane! Witaj " + nameMatcher + " " + lastNameMatcher + " " + ageMatcher + " " + ageWordMatcher + " " + dateMatcher);
            }else {
                System.out.println("Podaj prawidlowe dane!");
            }


        } while (!(matcher.matches()));

    }

}
