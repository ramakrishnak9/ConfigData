package com.zeroandone.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

//@RestController
public class TeamController {

    //@Autowired
    private TeamRepository teamRepository;

    @GetMapping("/teams")
    public Iterable<Team> getTeams() {
        return teamRepository.findAll();
    }

    @GetMapping("teams/{id}")
    public Team getTeam(@PathVariable("id") long id){
        return teamRepository.findOne(id);
    }

}
