package DB_connection;

import java.util.Scanner;

public class DB_Test {
    public static void main(String[] args) {
        //  DB_Connector.connect("root", "2519");
        DB_Statements.connect("root", "2519");

        System.out.println("Hi user! What do you want to do?");
        System.out.println("1: Add new child to database");

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        switch (input) {
            case "1":
                addNewChild();
                break;
            default:
                System.out.println("Wrong input, bye!");
                break;
        }
    }

    public static void addNewChild() {
        System.out.println("Lets add a new kid!\n");
        Scanner sc = new Scanner(System.in);
        System.out.println("Name:");
        String childName = sc.nextLine();
        System.out.println("Birthdate (Format: \"2018.01.01\")");
        String birthDate = sc.nextLine();
        DB_Statements.insertNewChildren("children", childName, birthDate);

        System.out.println("\n" + childName + " was added to the Database, dont forget to refresh database ^^");
    }
}
