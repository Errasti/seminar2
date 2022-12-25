import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


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

    public static void searchByName(ArrayList<Person> personList, String name) {
        int count = 0;
        for (var person : personList) {
            if (person.name.toLowerCase().equals(name.toLowerCase())
                    | person.name.toLowerCase().contains(name.toLowerCase())) {
                person.bio();
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Совпадний не найдено");
        }
    }

    public static void searchById(ArrayList<Person> personList, int id) {
        int count = 0;
        for (var person : personList) {
            if (person.id == id) {
                person.bio();
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Совпадений не найдено");
        }
    }

   /* public static void addPerson(ArrayList<Person> personList) {
        HashMap<Integer, String> relativeHash = null;
        String relation;
        int relativeId = 0;
        String gender;
        boolean flag = true;
        Scanner scan = new Scanner(System.in);
        Scanner scann = new Scanner(System.in);
        int id = personList.size() + 1;
        System.out.println("Введите ФИО");
        String name = scan.nextLine();
        while (flag) {
            System.out.println("Выберите пол");
            System.out.println("1.Мужской");
            System.out.println("2.Женский");
            int userClick = scann.nextInt();
            if (userClick == 1) {
                gender = "Мужской";
                flag = false;
            } else if (userClick == 2) {
                gender = "Женский";
                flag = false;
            } else {
                System.out.println("Некорректный ввод. Повторите попытку.");
            }
        }
        System.out.println("Введите количество полных лет:");
        int age = scann.nextInt();
        System.out.println("Если в базе есть ваш родственник - добавьте его.");
        System.out.println("1.Добавить");
        System.out.println("2.Пропустить шаг");
        int userClick = scann.nextInt();
        if (userClick == 1) {
            while (flag) {
                System.out.println("Введите ID родственника");
                relativeId = scann.nextInt();
                for (var person : personList) {
                    if (person.id == relativeId) {
                        flag = true;
                    } else {
                        System.out.println("ID не найден. Повторите попытку");
                    }
                }
            }
            System.out.println("Кем вам приходится этот человек: ");
            relation = scan.nextLine();
            relativeHash.put(relativeId, relation);
        } else if (userClick == 2) {

        }
    } */
}
