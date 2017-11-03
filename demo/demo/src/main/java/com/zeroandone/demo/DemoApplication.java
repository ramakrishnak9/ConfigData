package com.zeroandone.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@SpringBootApplication
public class DemoApplication {

    @Autowired
    private TeamRepository teamRepository;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }


    @PostConstruct
    public void init() {

        List<Team> list = new ArrayList<>();

        Set<Player> playerSet = new HashSet<>();

        playerSet.add(new Player("Rama", "opening"));
        playerSet.add(new Player("Krishna", "opening-nonstricker"));
        playerSet.add(new Player("Ram", "firstdown"));


        Team team = new Team("Kak-A-Team", "Kak", playerSet);
        Team team1 = new Team("Kak-B-Team", "Kak", null);
        list.add(team);
        list.add(team1);


        teamRepository.save(list);
    }

}
