package cn.msosm.shop.service;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.alibaba.druid.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import cn.msosm.shop.jedis.JedisClient;
import cn.msosm.shop.mapper.MisiUsersMapper;
import cn.msosm.shop.pojo.MisiUsers;

@Service
public class UserServiceImpl implements UserService {

	private static final Logger LOGGER = Logger.getLogger(UserServiceImpl.class);
	
	@Autowired
	private MisiUsersMapper userMpper;
	
	//用户唯一标识
	@Value("${USER_IDENTITY}")
	private String USER_IDENTITY;
	
	@Autowired
	private JedisClient jedisClient;
	
	public MisiUsers addUser(MisiUsers user) {
		int count = userMpper.insert(user);
		if(count>0) {
			LOGGER.info("数据添加到数据库--->"+count);
			Long result = jedisClient.hset(USER_IDENTITY, user.getUserId(), JSONObject.toJSONString(user));
			LOGGER.info("数据添加到Redis--->"+result);
			return user;
		} 
		return null;
	}

	public MisiUsers getUserByUserId(String userId) { 
		MisiUsers user = null; 
		String result = jedisClient.hget(USER_IDENTITY, userId);
		if(!StringUtils.isEmpty(result)) {
			LOGGER.info("数据从Redis 中获取。。。。。");
			 JSONObject jsonObj = (JSONObject) JSON.parse(result); 
			return  JSONObject.toJavaObject(jsonObj, MisiUsers.class);
		}else {
			LOGGER.info("数据从数据库中获取。。。。。");
			user = userMpper.selectByPrimaryKey(userId);
		} 
		return user;
	}
	
	
	public void updateUserByUser(MisiUsers users) {
		String userId= users.getUserId(); 
		String result = jedisClient.hget(USER_IDENTITY, userId);
		if(!StringUtils.isEmpty(result)) {
			 LOGGER.info("从缓存中获取到数据.....");
			 JSONObject jsonObj = (JSONObject) JSON.parse(result); 
			 MisiUsers user =  JSONObject.toJavaObject(jsonObj, MisiUsers.class);
			 String upUserId =  user.getUserId(); 
			 user.setUsername(users.getUsername());
			 Long lcount =  jedisClient.hset(USER_IDENTITY, upUserId, JSONObject.toJSONString(user));
			 LOGGER.info("Redis 修改数据  。。。lcount。。"+lcount);
			 
			 MisiUsers record = new MisiUsers();
			 record.setUserId(userId);
			 record.setUsername(users.getUsername());
			userMpper.updateByPrimaryKeySelective(record );  
		}else {
			 LOGGER.info("从数据库中获取到数据.....");
			 MisiUsers record = new MisiUsers();
			 record.setUserId(userId);
			 record.setUsername(users.getUsername());
			 userMpper.updateByPrimaryKeySelective(record ); 
			 Long lcount =  jedisClient.hset(USER_IDENTITY, userId, JSONObject.toJSONString(record));
			
		}
		
		
		
		
	}
	
	
	

}
