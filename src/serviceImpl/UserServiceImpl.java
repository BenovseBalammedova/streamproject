package serviceImpl;

import entity.TapAz;
import entity.User;
import service.CommonService;
import service.TapAzService;
import service.UserService;

import java.util.ArrayList;
import java.util.List;

public class UserServiceImpl implements CommonService<User>, UserService {
    static List<User>userList=new ArrayList<>();
    static {
        userList.add(new User("Benovse",1,22,1500,"Aydinli"));
        userList.add(new User("Leyla",2,23,2500,"Eliyev"));
        userList.add(new User("Gunel",3,24,100,"Veliyev"));
        userList.add(new User("Tural",4,26,1000,"Hesenov"));
    }

    @Override
    public void add(User common) {
        userList.add(common);
    }

    @Override
    public void delete(int id) {
      userList.remove(id-1);
    }

    @Override
    public List<User> common() {
        return userList;
    }

    @Override
    public void update(User common) {
       List<String>list=new ArrayList<>();
       for (User user:userList){
           list.add(user.getName());


       }

    }

    @Override
    public User getById(int id) {
        return userList.get(id-1);
    }

    @Override
    public List<User> getByNameLenght(int lenght) {
        return userList.stream().filter(name->name.getName().length()>lenght).toList();
    }

    @Override
    public List<User> getId(int id) {
        return userList.stream().filter(user -> user.getId()==id).toList();
    }

    @Override
    public List<User> getByAge(int minage,int maxage) {
        return userList.stream().filter(user -> user.getAge()>=minage&&user.getAge()<=maxage).toList();
    }
}
