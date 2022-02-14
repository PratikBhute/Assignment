package com.example.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
public class Post implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String titel, discription;
    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(
            name = "tags_posts",    // intermediate physical table name
            joinColumns = {
                    @JoinColumn(name = "posts_id")  // column to connect with posts
            },
            inverseJoinColumns = {
                    @JoinColumn(name = "tags_id")   // column to connect with posts
            }
    )
    private Set<Tag> tags =new HashSet<>();

    public Post() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    public Set<Tag> getTags() {
        return tags;
    }

    public void setTags(Set<Tag> tags) {
        this.tags = tags;
    }

    public Post(Long id, String titel, String discription, Set<Tag> tags) {
        this.id = id;
        this.titel = titel;
        this.discription = discription;
        this.tags = tags;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Post post = (Post) o;
        return Objects.equals(id, post.id) && Objects.equals(titel, post.titel) && Objects.equals(discription, post.discription) && Objects.equals(tags, post.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, titel, discription, tags);
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", titel='" + titel + '\'' +
                ", discription='" + discription + '\'' +
                ", tags=" + tags +
                '}';
    }
}
