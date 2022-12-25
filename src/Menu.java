import java.io.IOException;
import java.util.*;

public class Menu {
    public static void userInterface() throws IOException {
        ArrayList<Person> data = PersonData.createPersonData();
        boolean flag = true;
        Scanner scan = new Scanner(System.in);
        Scanner secondScan = new Scanner(System.in);
        String searchValue;
        int userClick;
        int searchId;
        HashMap<Integer, String> relativeId;
        while (flag) {
            System.out.println("Добро пожаловать в демо-версию 'Древа семьи'!");
            System.out.println("=============================================");
            System.out.println("Введите цифру нужного пункта меню: ");
            System.out.println("1.Показать всех людей");
            System.out.println("2.Показать родственников конкретного человека");
            System.out.println("3.Экспорт в .txt");
            System.out.println("4.Поиск человека");
            System.out.println("5.Завершить работу");
            userClick = scan.nextInt();
            if (userClick == 1) {
                Person.showAllPerson(data);
            } else if (userClick == 2) {
                Person.showAllPerson(data);
                System.out.println("Введите ID нужного человека из списка выше: ");
                searchId = scan.nextInt();
                relativeId = Person.searchRelativeIds(data, searchId);
                if (!relativeId.isEmpty()) {
                    for (Map.Entry<Integer, String> pair : relativeId.entrySet()) {
                        System.out.println(pair.getValue() + "↓");
                        Person.showPersonById(data, pair.getKey());
                    }
                } else {
                    System.out.println("Совпадений не найдено");
                }
            } else if (userClick == 3) {
                FileExport.exportFile();
            } else if (userClick == 4){
                System.out.println("1.Поиск по имени");
                System.out.println("2.Поиск по ID");
                System.out.println("3.Выход в главное меню");
                userClick = scan.nextInt();
                if (userClick == 1){
                    System.out.println("Введите имя полностью или частично:");
                    searchValue = secondScan.nextLine();
                    Person.searchByName(data, searchValue);
                } else if (userClick == 2) {
                    System.out.println("Введите ID");
                    searchId = scan.nextInt();
                    Person.searchById(data, searchId);
                } else if (userClick == 3) {
                    userInterface();
                }
            }
            else if (userClick == 5) {
                System.out.println("Завершение работы");
                flag = false;
            } else {
                System.out.println("Некоректный ввод. Возврат в главное меню.");
                userInterface();
            }
        }
    }
}
