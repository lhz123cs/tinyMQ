package com.shildon.tinyMQ.core;

/**
 * 进行序列化的实体类，之所以要用该类对内容进行包装是为了方便序列化。
 * @author shildon<shildondu@gmail.com>
 * @date May 6, 2016
 */
public class MQEntity {
	
	private Class<?> clazz;
	private Object content;

	public Class<?> getClazz() {
		return clazz;
	}
	public MQEntity setClazz(Class<?> clazz) {
		this.clazz = clazz;
		return this;
	}
	public Object getContent() {
		return content;
	}
	public MQEntity setContent(Object content) {
		this.content = content;
		return this;
	}

}
