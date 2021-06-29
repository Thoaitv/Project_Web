/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.AdminDAO;
import dao.CartDAO;
import dao.UserDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author thoai
 */
@WebServlet(name = "AddNewAccountServlet", urlPatterns = {"/AddNewAccountServlet"})
public class AddNewAccountServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
//    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        
//    }
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
        request.setCharacterEncoding("UTF-8");

        AdminDAO dao = new AdminDAO();
        int countUser = dao.countUser();
        int countProduct = dao.countProduct();
        int countOrder = dao.countOrder();

        CartDAO cDao = new CartDAO();
        request.setAttribute("countUser", countUser);
        request.setAttribute("countProduct", countProduct);
        request.setAttribute("countUser", countUser);
        request.setAttribute("countOrder", countOrder);
        request.getRequestDispatcher("addNewAccount.jsp").forward(request, response);

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
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        String userName = request.getParameter("userName");
        String fullName = request.getParameter("fullName");
        Boolean gender = Boolean.parseBoolean(request.getParameter("gender"));
        String role = request.getParameter("role");
        String phone = request.getParameter("phone");
        String address = request.getParameter("address");
        String password = request.getParameter("password");
        String rePassword = request.getParameter("rePassword");

        
        
        AdminDAO dao = new AdminDAO();
//        int countUser = dao.countUser();
//        int countProduct = dao.countProduct();
//        int countOrder = dao.countOrder();
//
//        CartDAO cDao = new CartDAO();
//        request.setAttribute("countUser", countUser);
//        request.setAttribute("countProduct", countProduct);
//        request.setAttribute("countUser", countUser);
//        request.setAttribute("countOrder", countOrder);
        
        
        
        UserDAO uDao = new UserDAO();
        if (uDao.checkAcountExist(userName)) {
            request.setAttribute("message", "err");
            request.getRequestDispatcher("addNewAccount.jsp").forward(request, response);
        } else {
            if (!password.equals(rePassword)) {
                request.setAttribute("message", "errPass");
            } else {
                dao.AddNewUser(userName, password, fullName, phone, address, gender, role);
                request.setAttribute("message", "success");
            }
            request.getRequestDispatcher("UserInAdminServlet").forward(request, response);

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
