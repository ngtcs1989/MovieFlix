package training.movieflix.service;

import java.util.List;

import training.movieflix.entity.User;

public interface UserService {

	public List<User> findAll();

	public User findById(String id);

	public User create(User emp);

	public User update(String id, User emp);

	public void delete(String id);
}
