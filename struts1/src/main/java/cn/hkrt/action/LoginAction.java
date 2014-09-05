package cn.hkrt.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import cn.hkrt.form.LoginForm;
/**
 * 处理登录的Action类
 * @author xuning
 * @date 2014年9月5日上午11:03:50
 */
public class LoginAction extends Action{

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		String path = "error";
		LoginForm lf = (LoginForm) form;
		String userName = lf.getUserName();
		String password = lf.getPassword();
		if((userName != null && "admin".equals(userName)) &&   // 
				(password != null && "admin".equals(password))){
			path = "success";
			request.setAttribute("userName", userName);
		}
		return mapping.findForward(path);
	}
	
}
