package com.company;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class conn {
    Connection c;
    Statement s;

    public conn() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            this.c = DriverManager.getConnection("jdbc:mysql://localhost:3306/user-db?zeroDateTimeBehavior=convertToNull", "root", "");
            this.s = this.c.createStatement();
        } catch (SQLException | ClassNotFoundException var2) {
            System.out.println(var2);
        }

    }
}
