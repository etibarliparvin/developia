package com.example.Mesele005.externals;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "DbConfig")
@XmlAccessorType(XmlAccessType.FIELD)
public class DbConfig {

    @XmlElement(name = "url")
    private String url;
    @XmlElement(name = "username")
    private String username;
    @XmlElement(name = "password")
    private String password;

    public String getUrl() {
        return url;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
