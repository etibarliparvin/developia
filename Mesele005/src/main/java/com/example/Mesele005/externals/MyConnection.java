package com.example.Mesele005.externals;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;

public class MyConnection {

    public Connection connect() throws Exception {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            JAXBContext context = JAXBContext.newInstance(DbConfig.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            DbConfig dbConfig = (DbConfig) unmarshaller.unmarshal(new File("C:\\Users\\LENOVO\\Desktop\\dbconfig.xml"));
            return DriverManager.getConnection(dbConfig.getUrl(), dbConfig.getUsername(), dbConfig.getPassword());
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
