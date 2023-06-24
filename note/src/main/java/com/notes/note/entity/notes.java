package com.notes.note.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class notes {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column
    private String note;
    @Column(name = "noteHeading")
    private String noteheading;
    @ManyToOne
    private user user;
    @Column(name = "nImage")
    private String image;

    // all constructor
    public notes(int id, String note, String noteheading, com.notes.note.entity.user user, String image) {
        this.id = id;
        this.note = note;
        this.noteheading = noteheading;
        this.user = user;
        this.image = image;
    }

    public notes() {
    }

    // all getter and setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getNoteheading() {
        return noteheading;
    }

    public void setNoteheading(String noteheading) {
        this.noteheading = noteheading;
    }

    public user getUser() {
        return user;
    }

    public void setUser(user user) {
        this.user = user;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

}
