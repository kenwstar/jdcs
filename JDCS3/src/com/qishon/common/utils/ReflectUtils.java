package com.qishon.common.utils;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * 反射工具类
 * 
 * @author Kenny
 */
public class ReflectUtils {

	/**
	 * 获得超类的参数类型，取第一个参数类型
	 * 
	 * @param <T>
	 *            类型参数
	 * @param clazz
	 *            超类类型
	 */
	public static <T> Class<T> getClassGenricType(Class<T> clazz) {
		return getClassGenricType(clazz, 0);
	}

	/**
	 * 根据索引获得超类的参数类型
	 * 
	 * @param clazz
	 *            超类类型
	 * @param index
	 *            索引
	 */
	public static <T> Class<T> getClassGenricType(Class<T> clazz, int index) {
		Type genType = clazz.getGenericSuperclass();
		if (!(genType instanceof ParameterizedType)) {
			return (Class<T>) Object.class;
		}
		Type[] params = ((ParameterizedType) genType).getActualTypeArguments();
		if (index >= params.length || index < 0) {
			return (Class<T>) Object.class;
		}
		if (!(params[index] instanceof Class)) {
			return (Class<T>) Object.class;
		}
		return (Class<T>) params[index];
	}
}
