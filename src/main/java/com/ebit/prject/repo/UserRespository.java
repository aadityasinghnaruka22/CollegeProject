package com.ebit.prject.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ebit.prject.entity.User;

public interface UserRespository extends JpaRepository<User, Integer> {

}
