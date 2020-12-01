package top.hr37.setting.Interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class UserLoginInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        HttpSession session = request.getSession(false);

        if( ! ("/setting/user/login.do".equals(request.getServletPath())
                || ((session !=null && session.getAttribute("user") != null)))){
            response.sendRedirect("/myWeb");
            return false;
        }
        return true;
    }


}
