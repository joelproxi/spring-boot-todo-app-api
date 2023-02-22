package com.proxidev.spring_todoapp_api.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;
import java.util.Objects;



@Entity
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private Date date;
    private boolean is_completed;

    public Task() {
    }

    public Task(Long id, String title, Date date, boolean is_completed) {
        this.id = id;
        this.title = title;
        this.date = date;
        this.is_completed = is_completed;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getDate() {
        return this.date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public boolean isIs_completed() {
        return this.is_completed;
    }

    public boolean getIs_commpeted() {
        return this.is_completed;
    }

    public void setIs_completed(boolean is_completed) {
        this.is_completed = is_completed;
    }

    public Task id(Long id) {
        setId(id);
        return this;
    }

    public Task title(String title) {
        setTitle(title);
        return this;
    }

    public Task date(Date date) {
        setDate(date);
        return this;
    }

    public Task is_commpeted(boolean is_commpeted) {
        setIs_completed(is_commpeted);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Task)) {
            return false;
        }
        Task task = (Task) o;
        return Objects.equals(id, task.id) && Objects.equals(title, task.title) && Objects.equals(date, task.date)
                && is_completed == task.is_completed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, date, is_completed);
    }

    @Override
    public String toString() {
        return "{" +
                " id='" + getId() + "'" +
                ", title='" + getTitle() + "'" +
                ", date='" + getDate() + "'" +
                ", is_commpeted='" + isIs_completed() + "'" +
                "}";
    }
}
