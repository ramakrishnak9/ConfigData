package com.zeroandone.demo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

@RestResource(path = "teamss",rel = "team")
public interface TeamRepository extends CrudRepository<Team, Long> {

}
