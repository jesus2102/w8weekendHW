package models;

import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Films")
public class Film {

    private int id;
    private String title;
    private Studio studio;
    private Director director;
    private List<Actor> actors;
    private Genre genre;

    public Film(){}

    public Film(String title, Genre genre, Studio studio, Director director) {
        this.title = title;
        this.genre = genre;
        this.studio = studio;
        this.director = director;
        this.actors = new ArrayList<Actor>();
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

    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @ManyToOne
    @JoinColumn(name = "studio_id", nullable = false)
    public Studio getStudio() {
        return studio;
    }

    public void setStudio(Studio studio) {
        this.studio = studio;
    }

    @ManyToOne
    @JoinColumn(name = "director_id", nullable = false)
    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    @ManyToMany
    @JoinTable(name = "Films_actors",
                joinColumns = {@JoinColumn(name = "actor_id", nullable = false, updatable = false)},
                inverseJoinColumns = {@JoinColumn(name = "film_id", nullable = false, updatable = false)})
    public List<Actor> getActors() {
        return actors;
    }

    public void setActors(List<Actor> actors) {
        this.actors = actors;
    }

    public void addActor(Actor actor){
        this.actors.add(actor);
    }

    @ManyToOne
    @JoinColumn(name = "genre_id", nullable = false)
    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }
}
