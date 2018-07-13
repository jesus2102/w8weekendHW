package models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "director")
public class Director extends Employee {

    private List<Film> films;

    public Director() {
    }

    public Director(String firstName, String lastName) {
        super(firstName, lastName);
    }

    @OneToMany(mappedBy = "director", fetch = FetchType.LAZY)
    public List<Film> getFilms() {
        return films;
    }

    public void setFilms(List<Film> films) {
        this.films = films;
    }
}
