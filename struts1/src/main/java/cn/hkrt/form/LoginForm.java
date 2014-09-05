package cn.hkrt.form;

import org.apache.struts.action.ActionForm;

/**
 * 封装登录表单数据的form类
 * 
 * @author xuning
 * @date 2014年9月5日上午11:01:36
 */
public class LoginForm extends ActionForm {

	private static final long serialVersionUID = -732087133601148347L;
	private String userName;
	private String password;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
