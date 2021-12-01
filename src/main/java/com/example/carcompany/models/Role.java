package com.example.carcompany.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Role {
    @Id
    private long id;
    private String user;
    private String admin;

    public Role() {
    }

    public Role(long id, String user, String admin) {
        this.id = id;
        this.user = user;
        this.admin = admin;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getAdmin() {
        return admin;
    }

    public void setAdmin(String admin) {
        this.admin = admin;
    }

    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", user='" + user + '\'' +
                ", admin='" + admin + '\'' +
                '}';
    }
}
