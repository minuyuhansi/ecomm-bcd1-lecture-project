package lk.jiat.web.servlet;

import jakarta.ejb.EJB;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lk.jiat.core.dto.UserDTO;
import lk.jiat.core.service.UserService;

import java.io.IOException;

@WebServlet("/user")
public class UserProfile extends HttpServlet {

    @EJB
    private UserService userService;

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UserDTO userD = userService.getUserById(1L);
        resp.getWriter().write("User Profile");

    }
}
