package DB_connection;

import DB_connection.DB_Statements;

public class DB_Test {
    public static void main(String[] args) {
        //  DB_Connector.connect("root", "2519");
        DB_Statements.connect("root","2519");
        DB_Statements.insertInto("children","Tim Joker", "2019.01.01.");
    }
}
