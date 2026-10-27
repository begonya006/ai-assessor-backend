package com.team.ai_assessor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public List<User> getAllUsers() { return userMapper.findAll(); }
    public void addUser(User user) { userMapper.insert(user); }
    public void updateUser(User user) { userMapper.update(user); }
    public void deleteUser(Long id) { userMapper.deleteById(id); }
}