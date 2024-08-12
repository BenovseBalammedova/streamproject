package service;

import entity.User;

import java.util.List;

public interface UserService {
    List<User>getByNameLenght(int lenght);
    List<User>getId(int id);
    List<User>getByAge(int minage,int maxage);
}
