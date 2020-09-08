package com.casestudy.rest.webservices.restfulwebservices.jwt;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class JwtInMemoryUserDetailsService implements UserDetailsService {

  static List<JwtUserDetails> inMemoryUserList = new ArrayList<>();

  static {
    inMemoryUserList.add(new JwtUserDetails(1L, "in28minutes",
        "$2a$10$3zHzb.Npv1hfZbLEU5qsdOju/tk2je6W6PnNnY.c1ujWPcZh4PL6e", "ROLE_USER_2"));
    inMemoryUserList.add(new JwtUserDetails(2L, "test1",
            "$2a$10$GlSoOzeY4N59xTgr7KK1/eIKNUpIh7yX2fNQGqpvZYb5Il3SlltoS", "ROLE_USER_3"));
    //$2a$10$h9S6HPda1UuwZCsMUCqzx.jJIYwT5haBhpEAzGOp1v58.KuonojeW
    inMemoryUserList.add(new JwtUserDetails(3L, "test2",
            "$2a$10$UJ3JZYgr8R7I3PQPLLaPq.aJCXVpF2IFS72DgRdG9zBqejbCG.oMC", "ROLE_USER_4"));
  }

  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    Optional<JwtUserDetails> findFirst = inMemoryUserList.stream()
        .filter(user -> user.getUsername().equals(username)).findFirst();

    if (!findFirst.isPresent()) {
      throw new UsernameNotFoundException(String.format("USER_NOT_FOUND '%s'.", username));
    }

    return findFirst.get();
  }

}


