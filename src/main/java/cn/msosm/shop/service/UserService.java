package cn.msosm.shop.service;

import cn.msosm.shop.pojo.MisiUsers;

public interface UserService {

	public MisiUsers addUser(MisiUsers user);
	
	public MisiUsers getUserByUserId(String userId);
	
	public void updateUserByUser(MisiUsers users) ;
}
