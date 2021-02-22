package se.lexicon.model;

import java.util.Objects;

public class AppUser {
    private int userId;
    private String name;
    private String email;
    private String password;
    private String address;

    public AppUser() {
    }

    public AppUser(String name, String email, String password, String address) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.address = address;
    }

    public AppUser(int userId, String name, String email, String password, String address) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.password = password;
        this.address = address;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AppUser appUser = (AppUser) o;
        return userId == appUser.userId && Objects.equals(name, appUser.name) && Objects.equals(email, appUser.email) && Objects.equals(password, appUser.password) && Objects.equals(address, appUser.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, name, email, password, address);
    }

    @Override
    public String toString() {
        return "AppUser{" +
                "userId=" + userId +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
