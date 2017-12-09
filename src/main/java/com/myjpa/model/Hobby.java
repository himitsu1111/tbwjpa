package com.myjpa.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by book on 09.12.2017.
 */
@Entity
public class Hobby {
    private String hobbyId;

    @Id
    @javax.persistence.Column(name = "hobby_id")
    public String getHobbyId() {
        return hobbyId;
    }

    public void setHobbyId(String hobbyId) {
        this.hobbyId = hobbyId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Hobby hobby = (Hobby) o;

        if (hobbyId != null ? !hobbyId.equals(hobby.hobbyId) : hobby.hobbyId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return hobbyId != null ? hobbyId.hashCode() : 0;
    }
}
