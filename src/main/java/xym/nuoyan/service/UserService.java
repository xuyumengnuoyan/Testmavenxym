package xym.nuoyan.service;

import xym.nuoyan.dao.UserDao;
import xym.nuoyan.entity.User;

import java.util.List;


public class UserService {
	/**
	 * 用户登陆
	 * @return
	 */
	public User Login(String name, String password) {
		UserDao user =new UserDao();
		return user.UserQuery(name, password);
	}
	/**
	 * 用户多条件查询
	 */
	public List<User>  MultipleUser() {
		UserDao user =new UserDao();
		List<User> list=user.MultipleUser();
		return list;
	}
	/**
	 * 
	 */
	public void update(User user) {
		UserDao us =new UserDao();
		if(user!=null) {
			us.updateUserDaoImpl(user);
		}
	}
	/**
	 * 根据ID查询用户
	 */
	public User queryById(String id) {
		UserDao us =new UserDao();
		return  us.queryById(id);
	}
	public void deleteuser(String uid) {
		UserDao us =new UserDao();
		  us.userDelById(uid);
	}
	/**
	 * 注册用户
	 */
	public void registeruser(User user) {
		UserDao us =new UserDao();
		us.adduser(user);
	}
}
