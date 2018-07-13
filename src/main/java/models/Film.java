package models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Films")
public class Film {

    private int id;
    private String title;
    private Studio studio;
    private Director director;
    private List<Actor> actors;

    public Film(){}

    public Film(String title, Studio studio, Director director) {
        this.title = title;
        this.studio = studio;
        this.director = director;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "studio")
    public Studio getStudio() {
        return studio;
    }

    public void setStudio(Studio studio) {
        this.studio = studio;
    }

    @Column(name = "director")
    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    @Column(name = "actors")
    public List<Actor> getActors() {
        return actors;
    }

    public void setActors(List<Actor> actors) {
        this.actors = actors;
    }
}
