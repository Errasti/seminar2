import java.util.ArrayList;
import java.util.HashMap;

public class PersonData {
    public static ArrayList<Person> createPersonData() {
        ArrayList<Person> personList = new ArrayList<>();
        HashMap<Integer, String> personOneRelative = new HashMap<>();
        personOneRelative.put(2, "Отец");
        personOneRelative.put(3, "Мать");
        Person personOne = new Person(1, "Глуховской Ян", "Мужской", 24, personOneRelative);
        HashMap<Integer, String> personTwoRelative = new HashMap<>();
        personTwoRelative.put(4, "Отец");
        personTwoRelative.put(5, "Мать");
        HashMap<Integer, String> personThreeRelative = new HashMap<>();
        personThreeRelative.put(6, "Отец");
        personThreeRelative.put(7, "Мать");
        Person personTwo = new Person(2, "Глуховской Аркадий", "Мужской", 58, personTwoRelative);
        Person personThree = new Person(3, "Глуховская Анна", "Женский", 56, personThreeRelative);
        HashMap<Integer, String> personFourRelative = new HashMap<>();
        HashMap<Integer, String> personFiveRelative = new HashMap<>();
        HashMap<Integer, String> personSixRelative = new HashMap<>();
        HashMap<Integer, String> personSevenRelative = new HashMap<>();
        Person personFour = new Person(4, "Глуховской Игорь", "Мужской", 79, personFourRelative);
        Person personFive = new Person(5, "Глуховская Ольга", "Женский", 80, personFiveRelative);
        Person personSix = new Person(6, "Моженков Александр", "Мужской", 75, personSixRelative);
        Person personSeven = new Person(7, "Моженкова Инна", "Женский", 76, personSevenRelative);
        personList.add(personOne);
        personList.add(personTwo);
        personList.add(personThree);
        personList.add(personFour);
        personList.add(personFive);
        personList.add(personSix);
        personList.add(personSeven);
        return personList;
    }

}
