package DB_connection;

import tableClasses.Children;

import java.util.ArrayList;
import java.util.Scanner;

public class DB_Test {
    public static void main(String[] args) {
        //  DB_Connector.connect("root", "2519");
        DB_Statements.connect("root", "Kanelsnegl713!");

        System.out.println("Hi user! What do you want to do?\n");
        System.out.println("1: Add new child to database");
        System.out.println("2: Get child by id");

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        switch (input) {
            case "1":
                addNewChild();
                break;

            case "2":
                System.out.println("Add id:");
                String id = sc.nextLine();
                DB_Statements.getChildNameById(id);
                break;

            case "3":

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
        DB_Statements.insertNewChildren(childName, birthDate);

        System.out.println("\nChild, " + childName + " was added to the Database, dont forget to refresh database ^^");

        System.out.println("Lets add the parent of " + childName);
        System.out.println("Name:");
        String parentName = sc.nextLine();
        System.out.println("Phone number: (+45 11 11 11 11)");
        String phoneNumber = sc.nextLine();
        System.out.println("Address:");
        String address = sc.nextLine();
        DB_Statements.insertNewParent(parentName, phoneNumber, address);

        System.out.println("\nParent," + parentName + " was added to the Database, dont forget to refresh database ^^");
    }



}
