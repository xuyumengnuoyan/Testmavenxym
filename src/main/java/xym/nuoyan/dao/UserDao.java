package xym.nuoyan.dao;

import xym.nuoyan.entity.User;
import xym.nuoyan.util.DbUtil;
import xym.nuoyan.util.Stringutil;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class UserDao {
	/**
	 * 登陆
	 *
	 * @param name
	 * @param password
	 * @return
	 */
	public User UserQuery(String name, String password) {
		String sql = "select * from user where USER_USER_NAME=? and USER_PASSWORD=?";
		ArrayList<HashMap<String, Object>> list = DbUtil.executeQuery(sql, name, password);
		User user = null;
		if (list.size() > 0) {
			user = new User();
			user.setUserId(Stringutil.valueof(list.get(0).get("USER_ID")));
			user.setUserUserName(Stringutil.valueof(list.get(0).get("USER_USER_NAME")));
			user.setUserPassword(Stringutil.valueof(list.get(0).get("USER_PASSWORD")));
			user.setUserTelphone(Stringutil.valueof(list.get(0).get("USER_TELPHONE")));
			user.setUserAddress(Stringutil.valueof(list.get(0).get("USER_ADDRESS")));
			user.setUserShopName(Stringutil.valueof(list.get(0).get("USER_SHOP_NAME")));
			user.setUserComment(Stringutil.valueof(list.get(0).get("USER_COMMENT")));
			user.setUserStatus(new Byte(Stringutil.valueof(list.get(0).get("USER_STATUS"))));
		}
		return user;
	}

	/**
	 * 多条件查询用户
	 */
	public List<User> MultipleUser() {

		String sql = " select * from user ";
		ArrayList<HashMap<String, Object>> list = DbUtil.executeQuery(sql);

		List<User> list1 = new ArrayList<User>();
		for (int i = 0; i < list.size(); i++) {
			User user = new User();
			user.setUserAddress(list.get(i).get("USER_ADDRESS").toString());
			user.setUserComment(Stringutil.valueof(list.get(i).get("USER_COMMENT")));
			user.setUserId(list.get(i).get("USER_ID").toString());
			user.setUserShopName(list.get(i).get("USER_SHOP_NAME").toString());
			user.setUserTelphone(list.get(i).get("USER_TELPHONE").toString());
			user.setUserUserName(list.get(i).get("USER_USER_NAME").toString());
			user.setUserStatus(Byte.parseByte(list.get(i).get("USER_STATUS").toString()));
			list1.add(user);
		}

		return list1;
	}

	/**
	 * 修改用户
	 */
	public void updateUserDaoImpl(User user) {
		if (user != null) {
			String sql = "update user set  USER_USER_NAME=?,USER_PASSWORD=?,USER_TELPHONE=?,USER_ADDRESS=?,USER_SHOP_NAME=?, USER_COMMENT=? where USER_ID = ?";
			int i = DbUtil.executeUpdate(sql, user.getUserUserName(), user.getUserPassword(), user.getUserTelphone(),
					user.getUserAddress(), user.getUserShopName(), user.getUserComment(), user.getUserId());
		}
	}

	/**
	 * 根据ID查询用户
	 *
	 * @param id
	 * @return
	 */
	public User queryById(String id) {
		String sql = "select * from user where USER_ID=?";
		ArrayList<HashMap<String, Object>> list1 = DbUtil.executeQuery(sql, id);
		User user = null;
		if (list1.size() > 0) {
			user = new User();
			user.setUserId(Stringutil.valueof(list1.get(0).get("USER_ID")).toString());
			user.setUserUserName(Stringutil.valueof(list1.get(0).get("USER_USER_NAME")).toString());
			user.setUserPassword(Stringutil.valueof(list1.get(0).get("USER_PASSWORD")).toString());
			user.setUserTelphone(Stringutil.valueof(list1.get(0).get("USER_TELPHONE")).toString());
			user.setUserAddress(Stringutil.valueof(list1.get(0).get("USER_ADDRESS")).toString());
			user.setUserShopName(Stringutil.valueof(list1.get(0).get("USER_SHOP_NAME")).toString());
			user.setUserComment(Stringutil.valueof(list1.get(0).get("USER_COMMENT")).toString());
			user.setUserStatus(new Byte(Stringutil.valueof(list1.get(0).get("USER_STATUS")).toString()));
		}
		return user;
	}

	/**
	 * 删除用户
	 */
	public void userDelById(String uid) {
		System.out.println(uid + "3");
		String sql = "delete from user where USER_ID=?";
		int i = DbUtil.executeUpdate(sql, uid);
	}
	public void adduser(User user) {
		String sql="insert into user values (?,?,?,?,?,?,?,?)";
		DbUtil.executeUpdate(sql, user.getUserId(),user.getUserUserName(),user.getUserPassword(),user.getUserTelphone(),user.getUserAddress(),user.getUserShopName(),user.getUserComment(),user.getUserStatus());
	}
}
