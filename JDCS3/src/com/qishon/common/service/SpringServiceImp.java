package com.qishon.common.service;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.qishon.common.dao.HibernateDaoImp;
import com.qishon.common.utils.ReflectUtils;

@Service
public class SpringServiceImp<T> implements ISpringService<T> {

	protected Class<T> entityClass; // T的反射类型

	@Autowired
	@Qualifier("hibernateDaoImp")
	protected HibernateDaoImp<T> hibernateDaoImp;

	/**
	 * 在构造函数中利用反射机制获得参数T的具体类
	 */
	public SpringServiceImp() {
		entityClass = (Class<T>) ReflectUtils.getClassGenricType(getClass());
	}

	/**
	 * 获取所有数据
	 * 
	 * @param entityClass
	 *            参数T的反射类型
	 */
	public List<T> getAll(Class<T> entityClass) {
		return hibernateDaoImp.getAll(entityClass);
	}

	/**
	 * 获取所有数据
	 * 
	 * @param entityClass
	 *            参数T的反射类型
	 */
	public List<T> getAll() {
		return getAll(entityClass);
	}

	/**
	 * 保存对象
	 * 
	 * @param entity
	 *            保存的实体对象
	 */
	public void save(T entity) {
		hibernateDaoImp.save(entity);
	}

	/**
	 * 根据实体类与ID删除对象
	 * 
	 * @param clazz
	 *            实体类
	 * @param id
	 *            主键ID
	 */
	public void delete(Class<T> clazz, Serializable id) {
		hibernateDaoImp.delete(clazz, id);
	}

	/**
	 * 根据实体类与ID删除对象
	 * 
	 * @param clazz
	 *            实体类
	 * @param id
	 *            主键ID
	 */
	public void delete(Serializable id) {
		delete(entityClass, id);
	}

	/**
	 * 根据实体类与ID获得对象
	 * 
	 * @param clazz
	 *            实体类
	 * @param id
	 *            主键ID
	 */
	public T get(Class<T> clazz, Serializable id) {
		return (T) hibernateDaoImp.get(clazz, id);
	}

	/**
	 * 根据id获得对象
	 * 
	 * @param id
	 *            主键ID
	 */
	public T get(Serializable id) {
		return (T) get(entityClass, id);
	}
}
