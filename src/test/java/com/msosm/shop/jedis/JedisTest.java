package com.msosm.shop.jedis;

import org.junit.Test;

import redis.clients.jedis.Jedis;

public class JedisTest {

	
	//通过程序访问redis数据库
	
	@Test
	//获取单一的jedis对象操作数据对象
	public void test01() {
		
		//1获取链接对象
		Jedis jedis = new  Jedis("192.168.0.80", 6379);
		String userName = jedis.get("user");
		System.out.println(userName);
		
		jedis.set("addr", "西安");
		System.out.println(jedis.get("addr"));
		jedis.close();
	}
	
	
}
