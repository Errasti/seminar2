import java.util.ArrayList;
import java.util.HashMap;


public class Person {
    int id;
    String name;
    String gender;
    int age;
    HashMap<Integer, String> idOfRelatives;

    Person(int id, String name, String gender, int age, HashMap<Integer, String> idOfRelatives) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.idOfRelatives = idOfRelatives;
    }

    public void bio() {
        System.out.println("-------------------------------------------\n");
        System.out.printf("Карточка человека с ID: %d\n", id);
        System.out.println("==================*********================\n");
        System.out.printf("Имя: %s\n", name);
        System.out.printf("Пол: %s\n", gender);
        System.out.printf("Возраст: %d\n", age);
        System.out.println("-------------------------------------------\n");
        System.out.println("ID родственников, и степень родства:\n");
        if (!idOfRelatives.isEmpty()) {
            System.out.println(idOfRelatives.toString());
        } else {
            System.out.println("Родственников не найдено\n");
        }
        System.out.println("==================*********================\n");
    }

    public static void showAllPerson(ArrayList<Person> personList) {
        for (var person : personList) {
            person.bio();
        }
    }

    public static void showPersonById(ArrayList<Person> personList, int personId) {
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++\n");
        for (var person : personList) {
            if (person.id == personId) {
                person.bio();
            }
        }
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++\n");
    }

    public static HashMap<Integer, String> searchRelativeIds(ArrayList<Person> personList, int personId) {
        HashMap<Integer, String> relativeMap = null;
        for (var person : personList) {
            if (person.id == personId) {
                relativeMap = person.idOfRelatives;
            }
        }
        assert relativeMap != null;
        if (relativeMap.isEmpty()) {
            System.out.println("Совпадений не найдено");
        }
        return relativeMap;
    }

    public static StringBuilder createStringOfData(ArrayList<Person> personList) {
        StringBuilder sb = new StringBuilder();
        for (var person : personList) {
            sb.append("------------------------\n");
            sb.append("ID: ");
            sb.append(person.id);
            sb.append("\n");
            sb.append("Имя: ");
            sb.append(person.name);
            sb.append("\n");
            sb.append("Пол: ");
            sb.append(person.gender);
            sb.append("\n");
            sb.append("Возраст: ");
            sb.append(person.age);
            sb.append("\n");
            sb.append("------------------------\n");
        }
        return sb;
    }
}
