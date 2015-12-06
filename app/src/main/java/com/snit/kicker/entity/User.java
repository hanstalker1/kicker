package com.snit.kicker.entity;

/**
 * @author Ilya Snitavets
 */
public class User {

    public static final String TABLE = "user";
    public static final String ID = "id";
    public static final String NAME = "name";

    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
