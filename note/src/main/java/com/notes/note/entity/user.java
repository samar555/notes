package com.notes.note.entity;


import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class user {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column
    private String username;
    @Column
    private String email;
    @Column
    private String password;
    private String role;
    private boolean enable;
    private String imageurl;
    @OneToMany(cascade = CascadeType.ALL ,mappedBy = "user")
    private List<notes> usernote=new ArrayList<>();

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public boolean isEnable() {
        return enable;
    }


    //constructor with fields
   

    //construtor without fields
    public user() {
    }

public user(int id, String username, String email, String password, String role, boolean enable, String imageurl,
            List<notes> usernote) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
        this.role = role;
        this.enable = enable;
        this.imageurl = imageurl;
        this.usernote = usernote;
    }

    //all getters and setter
    public void setEnable(boolean enable) {
        this.enable = enable;
    }

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
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

   
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<notes> getUsernote() {
        return usernote;
    }

    public void setUsernote(List<notes> usernote) {
        this.usernote = usernote;
    }

  

}
