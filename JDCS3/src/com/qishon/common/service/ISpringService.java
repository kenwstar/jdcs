package com.qishon.common.service;

import java.io.Serializable;
import java.util.List;

public interface ISpringService<T> {
	/**
	 * 获取所有数据
	 * 
	 * @param entityClass
	 *            参数T的反射类型
	 */
	public List<T> getAll(Class<T> entityClass);

	/**
	 * 获取所有数据
	 * 
	 */
	public List<T> getAll();
	
	/**
	 * 保存对象
	 * 
	 * @param entity
	 *            保存的实体对象
	 */
	public void save(T entity);

	/**
	 * 根据实体类与ID删除对象
	 * 
	 * @param clazz
	 *            实体类
	 * @param id
	 *            主键ID
	 */
	public void delete(Class<T> clazz, Serializable id);

	/**
	 * 根据实体类与ID删除对象
	 * 
	 * @param clazz
	 *            实体类
	 * @param id
	 *            主键ID
	 */
	public void delete(Serializable id);

	/**
	 * 根据实体类与ID获得对象
	 * 
	 * @param clazz
	 *            实体类
	 * @param id
	 *            主键ID
	 */
	public T get(Class<T> clazz, Serializable id);

	/**
	 * 根据id获得对象
	 * 
	 * @param id
	 *            主键ID
	 */
	public T get(Serializable id);
}
