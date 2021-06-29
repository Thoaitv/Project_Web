/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.UserDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.User;

/**
 *
 * @author thoai
 */
@WebServlet(name = "LoginServlet", urlPatterns = {"/LoginServlet"})
public class LoginServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");

//        // get data username password to login page
//        String username = request.getParameter("username");
//        String password = request.getParameter("password");
//
//        UserDAO uDao = new UserDAO();
//        boolean checkAccountExist = uDao.checkAcountExist(username);
//        String userMessage = null;
//        String passMessage = null;
//        HttpSession session = request.getSession();
//        
//        // if account not exist
//        if(checkAccountExist == false){
//            userMessage = "Tài khoản không tồn tại!";
//            request.setAttribute("userMessage", userMessage);
//            request.getRequestDispatcher("login.jsp").forward(request, response);
//            
//            
//        }else{
//            User user= uDao.login(username, password);
//            
//            // password incorrect
//            if(user == null){
//                passMessage = "Mật khẩu sai! Vui lòng kiểm tra lại";
//                request.setAttribute("passMessage", passMessage);
//                request.setAttribute("username", username);
//                request.getRequestDispatcher("login.jsp").forward(request, response);
//            }
//            // Username and password right
//            else{
//                // Admin
//                if(user.getRole().equals("ROLE_admin")){
//                    session.setAttribute("user", user);
//                    request.getRequestDispatcher("homeAdmin.jsp").forward(request, response);
//                }
//                //user
//                if(user.getRole().equals("ROLE_user")){
//                    session.setAttribute("user", user);
//                    request.getRequestDispatcher("HomeServlet").forward(request, response);
//                }
//                session.setMaxInactiveInterval(60*60*12); // set session exit 60h
//            }
//        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        HttpSession session = request.getSession();
        String username = "";
        String password = "";
        UserDAO ud = new UserDAO();
        User user = ud.login(username, password);
        if (user != null) {
            if (user.getRole().equals("ROLE_admin")) {
                session.setAttribute("user", user);
                response.sendRedirect("homeAdmin.jsp");
            } else {
                session.setAttribute("user", user);
                response.sendRedirect("HomeServlet");
            }
        } else {
            response.sendRedirect("login.jsp");
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        
        UserDAO ud = new UserDAO();
        User user = ud.login(username, password);
        
        
        if (user != null) {
            if (user.getRole().equals("ROLE_admin")) {
                session.setAttribute("userName", user);
                response.sendRedirect("HomeAdminServlet");
            } else {
                session.setAttribute("user", user);
                response.sendRedirect("HomeServlet");
            }
        } else {
            request.getRequestDispatcher("login.jsp").forward(request, response);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
