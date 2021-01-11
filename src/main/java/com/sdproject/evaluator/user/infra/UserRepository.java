package com.sdproject.evaluator.user.infra;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserJPA, String> {
    UserJPA findByNickname(String nickname);
    UserJPA findByEmail(String email);
}
