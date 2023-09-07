package com.ebit.prject.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ebit.prject.entity.User;
import com.ebit.prject.repo.UserRespository;
import com.ebit.prject.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRespository userRepo;

	@Override
	public List<User> getUser() {

		return userRepo.findAll();
	}

	@Override
	public void save(User user) {
		userRepo.save(user);
	}

	@Override
	public User findById(Integer id) {
		return userRepo.findById(id).get();
	}

	@Override
	public void delete(User user) {
		userRepo.delete(user);
	}
}