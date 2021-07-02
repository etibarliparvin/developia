package com.example.Mesele005.core.concretes;

import com.example.Mesele005.core.abstracts.MyConnectionService;
import com.example.Mesele005.externals.MyConnection;

import java.sql.Connection;

public class MyConnectionServiceAdapter implements MyConnectionService {
    @Override
    public Connection connect() throws Exception {
        MyConnection myConnection = new MyConnection();
        return myConnection.connect();
    }
}
