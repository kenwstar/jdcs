package com.qishon.common.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.criterion.Criterion;

public interface IHibernateDao<T> {
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

	/**
	 * 删除对象
	 * 
	 * @param entity
	 *            实体类
	 */
	public void delete(Object entity);

	/**
	 * 根据ID删除对象
	 * 
	 * @param id
	 *            主键ID
	 */
	public void delete(Serializable id);

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
	 * 保存对象
	 * 
	 * @param entity
	 *            保存的实体对象
	 */
	public void save(Object entity);

	/**
	 * 获取所有数据
	 * 
	 * @param entityClass
	 *            参数T的反射类型
	 */
	public List<T> getAll(Class<T> entityClass);

	/**
	 * 获取所有数据
	 */
	public List<T> getAll();

	/**
	 * 根据条件获取数据
	 * 
	 * @param criterions
	 *            数量可变的Criterion
	 */
	public List<T> query(Criterion... criterions);

	/**
	 * HQL方式查询
	 * 
	 * @param hql
	 *            符合HQL语法的查询语句
	 * @param values
	 *            数量可变的条件值,按顺序绑定
	 */
	public Query createQuery(String hql, Object... values);

	/**
	 * SQL方式查询
	 * 
	 * @param sql
	 *            符合SQL语法的查询语句
	 * @param values
	 *            数量可变的条件值,按顺序绑定
	 */
	public SQLQuery createSQLQuery(String sql, Object... values);

	/**
	 * 根据类型创建查询对象
	 * 
	 * @param clazz
	 *            类型
	 */
	public Criteria createCriteria(Class<T> clazz);

	/**
	 * 对象化查询
	 * 
	 * @param modelClass
	 *            参数T的反射类型
	 * @param criterions
	 *            数量可变的Criterion
	 */
	public Criteria createCriteria(Class<T> clazz, Criterion... criterions);

	/**
	 * 对象化查询
	 * 
	 * @param criterions
	 *            数量可变的Criterion
	 */
	public Criteria createCriteria(Criterion... criterions);
}
