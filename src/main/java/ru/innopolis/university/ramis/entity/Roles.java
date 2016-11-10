package ru.innopolis.university.ramis.entity;

/**
 * Created by innopolis on 10.11.16.
 */
public enum Roles {

    ROLE_ADMIN("ROLE_ADMIN"),
    ROLE_USER("ROLE_USER"),
    ROLE_ANONIMUS("ROLE_ANONIMUS");

    private String role;

    private Roles(final String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return role;
    }
}
