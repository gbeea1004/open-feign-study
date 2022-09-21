package com.geonhee.openfeigndemo.user.repository;

import com.geonhee.openfeigndemo.user.entity.User;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Component
public class UserRepository {

  private final Map<Long, User> userStorage = new HashMap<>();
  private Long idCounter = 1L;

  public void save(User user) {
    user.setId(idCounter++);
    userStorage.put(user.getId(), user);
  }

  public Optional<User> findById(Long id) {
    return Optional.ofNullable(userStorage.get(id));
  }
}
