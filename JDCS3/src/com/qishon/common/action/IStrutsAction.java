package com.qishon.common.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

public interface IStrutsAction<T> {

	/**
	 * Action的默认执行方法
	 */
	public String execute() throws Exception;

	/**
	 * Json的默认执行方法
	 */
	public String json() throws Exception;
	
	/**
	 * 进入新增或修改页面
	 */
	public String input() throws Exception;

	/**
	 * 进入查看页面
	 */
	public String view() throws Exception;

	/**
	 * 新增或修改
	 */
	public String save() throws Exception;

	/**
	 * 删除
	 */
	public String delete() throws Exception;

	public void prepareInput() throws Exception;

	public void prepareSave() throws Exception;

	public void prepareView() throws Exception;

	/**
	 * 取得HttpSession函数
	 */
	public HttpSession getSession();

	/**
	 * 取得HttpRequest函数.
	 */
	public HttpServletRequest getRequest();

	/**
	 * 取得HttpResponse函数
	 */
	public HttpServletResponse getResponse();

	/**
	 * ModelDriven接口定义的方法，返回实体对象
	 */
	public T getModel();

	/**
	 * 页面列表显示的list
	 */
	public List<T> getList();

	/**
	 * 获取页面传递的id值
	 * 
	 * @param id
	 *            主键ID
	 */
	public void setId(Integer id);

	/**
	 * Preparable接口的方法，设置为空方法体是屏蔽它去拦截所有的方法
	 */
	public void prepare() throws Exception;
}
