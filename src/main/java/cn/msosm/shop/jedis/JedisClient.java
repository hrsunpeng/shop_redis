package cn.msosm.shop.jedis;

public interface JedisClient {

	String set(String key,String value);
		
	String get(String key);
	/**
	 *  是否存在
	 * @param key
	 * @return
	 */
	Boolean exists(String key);
	/**
	 * 过期时间
	 * @param key
	 * @param seconds
	 * @return
	 */
	Long expire(String key,int seconds);
	
	Long ttl(String key);

	Long incr(String key);
	
	Long hset(String key,String field,String value);
	
	String hget(String key,String field);
	
	Long hdel(String key,String...fields);
	
}

