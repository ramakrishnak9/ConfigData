package com.zeroandone.demo;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Team {

    public Long getId() {
        return id;
    }

    public Team setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Team setName(String name) {
        this.name = name;
        return this;
    }

    public String getLocation() {
        return location;
    }

    public Team setLocation(String location) {
        this.location = location;
        return this;
    }

    public Set<Player> getPlayerSet() {
        return playerSet;
    }

    public Team setPlayerSet(Set<Player> playerSet) {
        this.playerSet = playerSet;
        return this;
    }

    public Team() {
    }

    public Team(String name, String location, Set<Player> playerSet) {
        this.name = name;
        this.location = location;
        this.playerSet = playerSet;
    }

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String location;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "teamId")
    private Set<Player> playerSet;


}
